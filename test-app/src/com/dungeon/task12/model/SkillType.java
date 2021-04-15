package com.dungeon.task12.model;

public enum SkillType {
    EASY("iiizi"),
    MEDIUM("easy to learn, hard to master"),
    ADVANCED("hard to learn, insane to master");
    private final String description;

    SkillType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
