package com.dungeon.cybersport.model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;
@XmlRootElement(name = "Ladder")
@XmlType(propOrder = {"seasonName", "year", "teamsList"})
public class Ladder {
    private String seasonName;
    private int year;


    private List<Team>teamsList;

    public Ladder(String seasonName, int year) {
        this.seasonName = seasonName;
        this.year = year;
        this.teamsList=new ArrayList<>();
    }

    public Ladder() {
    }

    @XmlAttribute
    public String getSeasonName() {
        return seasonName;
    }

    @XmlAttribute
    public int getYear() {
        return year;
    }
    @XmlElement(name = "Team")
    @XmlElementWrapper(name = "Teams")
    public List<Team> getTeamsList() {
        return teamsList;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setTeamsList(List<Team> teamsList) {
        this.teamsList = teamsList;
    }

    public void setSeasonName(String seasonName) {
        this.seasonName = seasonName;
    }
}
