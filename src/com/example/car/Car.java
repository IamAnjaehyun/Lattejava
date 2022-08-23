package com.example.car;

import com.example.car.items.FastCar;

public class Car {
    public static void main(String[] args) {
        FastCar car = new FastCar("붕붕이_");
        car.ready();
        car.goStraight();
        car.turnRight();
        car.goStraight();
        car.turnLeft();
        car.goStraight();
        car.stop();

    }
}
