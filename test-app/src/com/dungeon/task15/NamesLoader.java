package com.dungeon.task15;

import org.apache.commons.lang3.StringUtils;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class NamesLoader {
    public List<String> loadFirstNames() throws URISyntaxException, IOException {
        return load("names.txt");
    }

    public List<String> loadLastNames() throws URISyntaxException, IOException {
        return load("last-names.txt");
    }
    private List<String> load(String file) throws IOException, URISyntaxException {
        Path path = Paths.get(ClassLoader.getSystemResource("task15/"+file).toURI());
        List<String> fileData = Files.lines(path).collect(Collectors.toList());
        return fileData;

    }
}
