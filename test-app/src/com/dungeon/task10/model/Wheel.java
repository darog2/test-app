package com.dungeon.task10.model;

public class Wheel implements Cloneable{
    private int diameter;
    private String protectorModel;
    private String discModel;

    public Wheel() {
    }

    public Wheel(String protectorModel, String discModel, int diameter) {
        this.diameter = diameter;
        this.protectorModel = protectorModel;
        this.discModel = discModel;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public String getProtectorModel() {
        return protectorModel;
    }

    public void setProtectorModel(String protectorModel) {
        this.protectorModel = protectorModel;
    }

    public String getDiscModel() {
        return discModel;
    }

    public void setDiscModel(String discModel) {
        this.discModel = discModel;
    }

    @Override
    public Wheel clone() throws CloneNotSupportedException {
        return (Wheel) super.clone();
    }

    @Override
    public String toString() {
        return "Wheel{" +
                "diameter=" + diameter +
                ", protectorModel='" + protectorModel + '\'' +
                ", discModel='" + discModel + '\'' +
                '}';
    }
}
