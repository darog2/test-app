package com.dungeon.cybersport.model;

import com.dungeon.common.DateFormatUtil;

import java.text.ParseException;
import java.util.Date;

public class Player {
    private final String firstName;
    private final String lastName;
    private String nickname;
    private String country;
    private Team team;
    private Date dateOfBirth;

    public Player(String firstName,
                  String lastName,
                  String nickname,
                  String country,
                  String dateOfBirth)  {
        this.firstName = firstName;
        this.lastName = lastName;
        this.nickname = nickname;
        this.country = country;
        this.dateOfBirth = DateFormatUtil.getDateFromString(dateOfBirth);
    }

    public String getFirstName() {
        return firstName;
    }


    public String getLastName() {
        return lastName;
    }


    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = DateFormatUtil.getDateFromString(dateOfBirth);
    }
}
