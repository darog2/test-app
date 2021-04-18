package com.dungeon.cybersport.model;

import com.dungeon.common.DateFormatUtil;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Team {
    private String name;
    private String country;
    private Date creationDate;
    private String game;
    private String prefix;
    private List<Player>playersList;

    public Team(String name, String country, String creationDate, String game)  {
        this.name = name;
        this.country = country;
        this.creationDate = DateFormatUtil.getDateFromString(creationDate);
        this.game = game;
        this.playersList=new ArrayList<>();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public void setGame(String game) {
        this.game = game;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public String getGame() {
        return game;
    }

    public String getPrefix() {
        return prefix;
    }

    public List<Player> getPlayersList() {
        return playersList;
    }
}
