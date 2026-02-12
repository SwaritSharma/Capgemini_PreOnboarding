package com.ipl.service;

import com.ipl.model.Match;

import java.io.*;
import java.util.*;

public class CsvProcessor {

    public List<Match> readCsv(String fileName) throws Exception {

        InputStream is = getClass()
                .getClassLoader()
                .getResourceAsStream(fileName);

        if (is == null) {
            throw new RuntimeException("File not found: " + fileName);
        }

        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        List<Match> matches = new ArrayList<>();

        String line = br.readLine(); // skip header

        while ((line = br.readLine()) != null) {

            String[] parts = line.split(",");

            Match match = new Match();
            match.setMatch_id(Integer.parseInt(parts[0]));
            match.setTeam1(parts[1]);
            match.setTeam2(parts[2]);

            Map<String, Integer> score = new HashMap<>();
            score.put(parts[1], Integer.parseInt(parts[3]));
            score.put(parts[2], Integer.parseInt(parts[4]));

            match.setScore(score);
            match.setWinner(parts[5]);
            match.setPlayer_of_match(parts[6]);

            matches.add(match);
        }

        br.close();
        return matches;
    }

    public void writeCsv(String fileName, List<Match> matches) throws Exception {

        BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
        bw.write("match_id,team1,team2,score_team1,score_team2,winner,player_of_match\n");

        for (Match m : matches) {

            bw.write(
                    m.getMatch_id() + "," +
                            m.getTeam1() + "," +
                            m.getTeam2() + "," +
                            m.getScore().get(m.getTeam1()) + "," +
                            m.getScore().get(m.getTeam2()) + "," +
                            m.getWinner() + "," +
                            m.getPlayer_of_match() + "\n"
            );
        }

        bw.close();
    }
}
