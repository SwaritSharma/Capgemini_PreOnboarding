package com.ipl.service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ipl.model.Match;

import java.io.*;
import java.util.List;

public class JsonProcessor {

    private final ObjectMapper mapper = new ObjectMapper();

    public List<Match> readJson(String fileName) throws Exception {

        InputStream is = getClass()
                .getClassLoader()
                .getResourceAsStream(fileName);

        if (is == null) {
            throw new RuntimeException("File not found: " + fileName);
        }

        return mapper.readValue(is,
                new TypeReference<List<Match>>() {});
    }

    public void writeJson(String fileName, List<Match> matches) throws Exception {

        mapper.writerWithDefaultPrettyPrinter()
                .writeValue(new File(fileName), matches);
    }
}
