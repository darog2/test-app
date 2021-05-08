package com.dungeon.task15.util;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Cities {
    private Map<String, List<String>> citiesMap = new HashMap<>();

    public Cities(Map<String, List<String>> citiesMap) {
        this.citiesMap = citiesMap;
    }

    public Map<String, List<String>> getCitiesMap() {
        return citiesMap;
    }

    public void setCitiesMap(Map<String, List<String>> citiesMap) {
        this.citiesMap = citiesMap;
    }
}
