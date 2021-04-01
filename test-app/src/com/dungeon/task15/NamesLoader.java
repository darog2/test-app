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
        Path path = Paths.get(ClassLoader.getSystemResource("task15/names.txt").toURI());
        List<String> fileData = Files.lines(path).collect(Collectors.toList());
        return fileData;
    }
public List<String> loadLastNames() throws URISyntaxException, IOException {
    Path path = Paths.get(ClassLoader.getSystemResource("task15/last-names.txt").toURI());
    List<String> fileData = Files.lines(path).collect(Collectors.toList());
    for (int i = 0; i < fileData.size(); i++) {
        fileData.set(i, StringUtils.capitalize(fileData.get(i).toLowerCase()));
    }
    return fileData;
}
}
