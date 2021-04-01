package com.dungeon.task15;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Arrays;
import java.util.List;

public class FilesMain {
    public static void main(String[] args) {
        try {
            PersonCreator personCreator =
                    new PersonCreatorBuilder()
                    .cities()
//                    .firstNames(Arrays.asList("Vasya", "Kostyan"))
                    .firstNames()
                    .lastNames()
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
