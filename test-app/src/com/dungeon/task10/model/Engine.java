package com.dungeon.task10.model;

public class Engine {
    private double volume; // обьем двигателя!
    private double torque; // крутящий момент!
    private String model; // название модели двигателя!
    public Engine(){

    }
    public Engine(String model,double volume,double torque){
        this.model=model;
        this.volume=volume;
        this.torque=torque;

    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getTorque() {
        return torque;
    }

    public void setTorque(double torque) {
        this.torque = torque;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "volume=" + volume +
                ", torque=" + torque +
                ", model='" + model + '\'' +
                '}';
    }
}
