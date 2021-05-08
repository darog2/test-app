package com.dungeon.task15.util;

import com.dungeon.common.CommonInputUtils;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PersonCreatorBuilder {
    private final NamesLoader namesLoader = new NamesLoader();
    private Cities cities;
    private List<String> firstNamesList;
    private List<String> lastNamesList;
    private PersonCreator result;

    //    CitiesManager citiesManager = new CitiesManager();
//    Cities cities = citiesManager.loadCities();
//    NamesLoader namesLoader = new NamesLoader();
//    List<String> strings = namesLoader.loadFirstNames();
//    List<String> strings1 = namesLoader.loadLastNames();
//    PersonCreator personCreator = new PersonCreator(cities, strings, strings1);
    public PersonCreatorBuilder cities() throws IOException, URISyntaxException {
        CitiesManager citiesManager = new CitiesManager();
        cities = citiesManager.loadCities();
        return this;
    }

    public PersonCreatorBuilder firstNames(String... fistNames) throws IOException, URISyntaxException {
        if (fistNames.length == 0) {
            firstNamesList = namesLoader.loadFirstNames();
        } else {
            firstNamesList = Arrays.asList(fistNames);
        }
        return this;
    }

    public PersonCreatorBuilder lastNames(String... lastNames) throws IOException, URISyntaxException {
        if (lastNames.length == 0) {
            lastNamesList = namesLoader.loadLastNames();
        } else {
            lastNamesList = Arrays.asList(lastNames);
        }
        return this;
    }

    public PersonCreator build() {
        return new PersonCreator(cities, firstNamesList, lastNamesList);
    }

    public PersonCreatorBuilder lastNames(int lastNamesCount) throws IOException, URISyntaxException {
        lastNamesList = new ArrayList<>();
        List<String> strings = namesLoader.loadLastNames();
        int size = strings.size();
        for (int i = 0; i < lastNamesCount; i++) {
            String lastName = strings.get(CommonInputUtils.getInstance().randomInt(size));
            lastNamesList.add(lastName);
        }
        return this;
    }

    public PersonCreatorBuilder firstNames(int firstNamesCount) throws IOException, URISyntaxException {
        firstNamesList = new ArrayList<>();
        List<String> strings = namesLoader.loadFirstNames();
        int size = strings.size();
        for (int i = 0; i < firstNamesCount; i++) {
            String firstName = strings.get(CommonInputUtils.getInstance().randomInt(size));
            firstNamesList.add(firstName);
        }
        return this;

    }
}
