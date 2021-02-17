package com.dungeon.task10;

import com.dungeon.task10.model.Car;
import com.dungeon.task10.model.Engine;
import com.dungeon.task10.model.Wheel;

public class DataGenerator {
    public Car[] createArray() throws CloneNotSupportedException {
        Engine engine1 = new Engine();
        engine1.setModel("Volkswagen EA113");
        engine1.setTorque(670);
        engine1.setVolume(3.5);
        Engine engine2 =
                new Engine("AUDI CVMD 3.0 TDI", 3, 600);
        Wheel lanosWheel =
                new Wheel("rasava 123", "berins S12", 12);
        Wheel suvWheel =
                new Wheel("rover z4", "jeep gsv15", 19);
        Car[] cars = new Car[5];
        cars[0] = new Car("AUDI",
                "A5",
                "blue",
                2010,
                300012,
                engine1,
                lanosWheel.clone(),
                lanosWheel.clone(),
                lanosWheel.clone(),
                lanosWheel.clone()
        );
        cars[1] = new Car("AUDI",
                "A8",
                "red",
                2010,
                394012,
                engine1,
                lanosWheel.clone(),
                lanosWheel.clone(),
                lanosWheel.clone(),
                lanosWheel.clone()
        );
        cars[2] = new Car("AUDI",
                "A5",
                "black",
                2025,
                000012,
                engine2,
                lanosWheel.clone(),
                lanosWheel.clone(),
                lanosWheel.clone(),
                lanosWheel.clone()
        );
        cars[3] = new Car("LandRover",
                "Discovery",
                "DarkGrey",
                2008,
                480012,
                engine2,
                suvWheel.clone(),
                suvWheel.clone(),
                suvWheel.clone(),
                suvWheel.clone()
        );
        cars[4] = new Car("SKODA",
                "Etty",
                "brown",
                2020,
                0000022,
                engine2,
                lanosWheel.clone(),
                lanosWheel.clone(),
                lanosWheel.clone(),
                lanosWheel.clone()
        );

        return cars;

    }
}
