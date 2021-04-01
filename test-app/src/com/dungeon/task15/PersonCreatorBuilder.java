package com.dungeon.task15;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Arrays;
import java.util.List;

public class PersonCreatorBuilder {
    private Cities cities;
    private List<String> fistNamesList;
    private List<String> lastNamesList;
    private PersonCreator result;
    private final NamesLoader namesLoader = new NamesLoader();

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

    public PersonCreatorBuilder firstNames() throws IOException, URISyntaxException {
        fistNamesList = namesLoader.loadFirstNames();
        return this;
    }
    public PersonCreatorBuilder firstNames(String... fistNames) throws IOException, URISyntaxException {
        fistNamesList = Arrays.asList(fistNames);
        return this;
    }

    public PersonCreatorBuilder lastNames() throws IOException, URISyntaxException {
        lastNamesList = namesLoader.loadLastNames();
        return this;
    }

    public PersonCreator build() {
        return new PersonCreator(cities, fistNamesList, lastNamesList);
    }
}
