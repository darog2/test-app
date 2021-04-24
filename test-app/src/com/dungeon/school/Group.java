package com.dungeon.school;

public class Group {
    private int group;
    private String thing;
   private String curator;

    public Group(int group, String thing, String curator) {
        this.group = group;
        this.thing = thing;
        this.curator = curator;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public String getThing() {
        return thing;
    }

    public void setThing(String thing) {
        this.thing = thing;
    }

    public String getCurator() {
        return curator;
    }

    public void setCurator(String curator) {
        this.curator = curator;
    }
}
