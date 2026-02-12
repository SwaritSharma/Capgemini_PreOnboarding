package com.ipl.service;

import com.ipl.model.Match;

import java.util.HashMap;
import java.util.Map;

public class CensorService {

    public Match censor(Match match) {

        match.setTeam1(mask(match.getTeam1()));
        match.setTeam2(mask(match.getTeam2()));
        match.setWinner(mask(match.getWinner()));

        match.setPlayer_of_match("REDACTED");

        // Update score map keys
        Map<String, Integer> newScore = new HashMap<>();

        for (Map.Entry<String, Integer> entry : match.getScore().entrySet()) {
            newScore.put(mask(entry.getKey()), entry.getValue());
        }

        match.setScore(newScore);

        return match;
    }

    private String mask(String team) {
        if (team == null) return null;

        String[] parts = team.split(" ");
        if (parts.length > 1) {
            return parts[0] + " ***";
        }
        return "***";
    }
}
