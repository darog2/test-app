package com.dungeon.task15;

import com.dungeon.common.CommonInputUtils;

import java.util.List;

public class PersonCreator {
    private Cities cities;
    private List<String> fistNamesList;
    private List<String> lastNamesList;

    public PersonCreator(Cities cities, List<String> fistNamesList, List<String> lastNamesList) {
        this.cities = cities;
        this.fistNamesList = fistNamesList;
        this.lastNamesList = lastNamesList;
    }
    public Human randomHuman(){
//        Object h = new Human(null,null,null,null);
//        Object l = new CitiesManager();
//        ((Human) h).getCity();//это работает
//        ((Human) l).getCity();//ClassCastException потому что l это CitiesManager,а он не хуя не Human
        int stateNumber = CommonInputUtils.getInstance().randomInt(
                cities.getCitiesMap().size()
        );
        String state = (String) cities.getCitiesMap().keySet().toArray()[stateNumber];
        int cityNumber = CommonInputUtils.getInstance().randomInt(cities.getCitiesMap().get(state).size());
        Human human= new Human(
                fistNamesList.get(CommonInputUtils.getInstance().randomInt(fistNamesList.size())),
                lastNamesList.get(CommonInputUtils.getInstance().randomInt(lastNamesList.size())),
                state,
                cities.getCitiesMap().get(state).get(cityNumber)
        );
        return human;
    }
}
