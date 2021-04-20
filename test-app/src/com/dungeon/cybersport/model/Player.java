package com.dungeon.cybersport.model;

import com.dungeon.common.DateFormatUtil;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;
import java.util.Date;

@XmlType(name = "Player")
public class Player {
    private String firstName;
    private String lastName;
    private String nickname;
    private String country;
    private Team team;
    private Date dateOfBirth;
    private PlayerResult result;

    public Player() {
    }

    public Player(String firstName,
                  String lastName,
                  String nickname,
                  String country,
                  String dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.nickname = nickname;
        this.country = country;
        this.dateOfBirth = DateFormatUtil.getDateFromString(dateOfBirth);

    }

    @XmlElement
    public PlayerResult getResult() {
        return result;
    }

    @XmlElement
    public String getFirstName() {
        return firstName;
    }

    @XmlElement
    public String getLastName() {
        return lastName;
    }


    @XmlAttribute
    public String getNickname() {
        return nickname;
    }

    @XmlElement
    public String getCountry() {
        return country;
    }

    @XmlTransient
    public Team getTeam() {
        return team;
    }

    @XmlElement
    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = DateFormatUtil.getDateTimeFromString(dateOfBirth);
    }

    public void setResult(PlayerResult result) {
        this.result = result;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
