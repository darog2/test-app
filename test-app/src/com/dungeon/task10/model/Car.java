package com.dungeon.task10.model;

import java.util.Arrays;

public class Car {
    String manufacturer;
    String modelName;
    String color;
    int year;
    double mileage;
    Engine engine;
    Wheel[] wheels;

    public Car(String manufacturer,
               String modelName,
               String color,
               int year,
               double mileage,
               Engine engine,
               Wheel... wheels) {
        this.manufacturer = manufacturer;
        this.modelName = modelName;
        this.color = color;
        this.year = year;
        this.mileage = mileage;
        this.engine = engine;
        this.wheels = wheels;
    }

    public Car() {
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Wheel[] getWheels() {
        return wheels;
    }

    public void setWheels(Wheel[] wheels) {
        this.wheels = wheels;
    }

    @Override
    public String toString() {
        return "Car{" +
                "manufacturer='" + manufacturer + '\'' +
                ", modelName='" + modelName + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", mileage=" + mileage +
                ", engine=" + engine.toString() +
                ", wheels=" + Arrays.toString(wheels) +
                '}';
    }
}
