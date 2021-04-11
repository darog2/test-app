package com.dungeon.task15.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Cities {
    public Cities(Map<String, List<String>> citiesMap) {
        this.citiesMap = citiesMap;
    }

    private Map<String, List<String>>citiesMap=new HashMap<>();

    public Map<String, List<String>> getCitiesMap() {
        return citiesMap;
    }

    public void setCitiesMap(Map<String, List<String>> citiesMap) {
        this.citiesMap = citiesMap;
    }
}
