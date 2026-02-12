package com.ipl;

import com.ipl.model.Match;
import com.ipl.service.*;

import java.util.List;
import java.util.stream.Collectors;

public class IPLAnalyzerApp {

    public static void main(String[] args) throws Exception {

        JsonProcessor jsonProcessor = new JsonProcessor();
        CsvProcessor csvProcessor = new CsvProcessor();
        CensorService censorService = new CensorService();

        // JSON Flow
        List<Match> jsonMatches = jsonProcessor.readJson("input.json");

        List<Match> censoredJson = jsonMatches.stream()
                .map(censorService::censor)
                .collect(Collectors.toList());

        jsonProcessor.writeJson("output_censored.json", censoredJson);


        // CSV Flow
        List<Match> csvMatches = csvProcessor.readCsv("input.csv");

        List<Match> censoredCsv = csvMatches.stream()
                .map(censorService::censor)
                .collect(Collectors.toList());

        csvProcessor.writeCsv("output_censored.csv", censoredCsv);

        System.out.println("Censorship completed successfully.");
    }
}
