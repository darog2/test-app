package com.dungeon.cybersport.model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "TeamResult")
public class TeamResult {
    private int wins;
    private int loses;

    public TeamResult(int wins, int loses) {
        this.wins = wins;
        this.loses = loses;
    }

    public TeamResult() {
    }

    @XmlAttribute
    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    @XmlAttribute
    public int getLoses() {
        return loses;
    }

    public void setLoses(int loses) {
        this.loses = loses;
    }

    public int gamesCount(){
        return wins + loses;
    }
}
