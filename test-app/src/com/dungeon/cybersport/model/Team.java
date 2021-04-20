package com.dungeon.cybersport.model;

import com.dungeon.common.DateFormatUtil;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@XmlType(name = "Team")
@XmlAccessorType(XmlAccessType.PROPERTY)
public class Team {
    private String name;
    private String country;
    private Date creationDate;
    private String game;
    private String prefix;

    private List<Player> playersList;
    private TeamResult result;

    public Team() {
    }

    @XmlElement
    public TeamResult getResult() {
        return result;
    }

    public void setResult(TeamResult result) {
        this.result = result;
    }

    public Team(String name, String country, String creationDate, String game) {
        this.name = name;
        this.country = country;
        this.creationDate = DateFormatUtil.getDateFromString(creationDate);
        this.game = game;
        this.playersList = new ArrayList<>();
    }

    public void addPlayer(Player player) {
        playersList.add(player);
        player.setTeam(this);
    }

    @XmlAttribute
    public String getName() {
        return name;
    }

    @XmlElement
    public String getCountry() {
        return country;
    }

    @XmlElement
    public Date getCreationDate() {
        return creationDate;
    }

    @XmlAttribute
    public String getGame() {
        return game;
    }

    public String getPrefix() {
        return prefix;
    }

    @XmlElement(name = "Player")
    @XmlElementWrapper(name = "Players")
    public List<Player> getPlayersList() {
        return playersList;
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
}
