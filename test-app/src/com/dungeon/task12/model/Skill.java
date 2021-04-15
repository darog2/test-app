package com.dungeon.task12.model;

import java.util.Objects;

public class Skill {
    private static long idCounter = 0;
    private long id;
    private String name;
    private double experience;
    private SkillType type;

    public Skill(String name, double experience, SkillType type) {
        idCounter++;
        id = idCounter;
        this.name = name;
        this.experience = experience;
        this.type = type;
    }

    public Skill(long id, String name, double experience, SkillType type) {
        if (id > idCounter) {
            idCounter = id;
        }
        this.id = id;
        this.name = name;
        this.experience = experience;
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Skill skill = (Skill) o;
        return name.equals(skill.name) && type == skill.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, type);
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setExperience(double experience) {
        this.experience = experience;
    }

    public String getName() {
        return name;
    }

    public double getExperience() {
        return experience;
    }

    public SkillType getType() {
        return type;
    }
}
