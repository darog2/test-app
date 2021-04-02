package com.dungeon.task15;

import org.apache.commons.lang3.StringUtils;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class FilesMain {
    public static void main(String[] args) throws Exception {
        try {
            PersonCreator personCreator =
                    new PersonCreatorBuilder()
                            .cities()
//                    .firstNames("Vasya", "Kostyan")
                            .firstNames(22)
                            .lastNames()
                            .lastNames(15)
                            .lastNames("Vasya", "Kostyan")
                            .build();
            Human human = personCreator.randomHuman();

            System.out.println();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }
}
