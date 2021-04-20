package com.dungeon.cybersport.model;

import javax.xml.bind.annotation.XmlAccessOrder;
import javax.xml.bind.annotation.XmlAccessorOrder;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "PlayerResult",propOrder = {"kills","deaths","assists"})
public class PlayerResult {
    private int kills;
    private int deaths;
    private int assists;

    public PlayerResult() {
    }

    public PlayerResult(int kills, int deaths, int assists) {
        this.kills = kills;
        this.deaths = deaths;
        this.assists = assists;
    }

    @XmlAttribute
    public int getKills() {
        return kills;
    }

    public void setKills(int kills) {
        this.kills = kills;
    }

    @XmlAttribute
    public int getDeaths() {
        return deaths;
    }

    public void setDeaths(int deaths) {
        this.deaths = deaths;
    }

    @XmlAttribute
    public int getAssists() {
        return assists;
    }

    public void setAssists(int assists) {
        this.assists = assists;
    }
}
