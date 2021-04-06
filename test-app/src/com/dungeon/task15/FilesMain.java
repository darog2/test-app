package com.dungeon.task15;

import com.dungeon.task15.util.PersonCreator;
import com.dungeon.task15.util.PersonCreatorBuilder;

import java.io.IOException;
import java.net.URISyntaxException;

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
