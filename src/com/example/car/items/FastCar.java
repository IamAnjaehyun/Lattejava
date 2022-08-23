package com.example.car.items;

public class FastCar{
    String name;
    Accelerator accelerator;
    Engine engine;
    Handle handle;
    Wheel wheel;

    public FastCar(String name) {
        this.name = name;
        this.accelerator = new Accelerator(name);
        this.engine = new Engine(name);
        this.handle = new Handle();
        this.wheel = new Wheel(name + "바퀴");
    }

    public void ready(){
        engine.start();
    }

    public void stop(){
        engine.turnOff();
    }

    public void goStraight(){
        accelerator.push();
        wheel.go();
    }

    public void turnLeft(){
        handle.left();
    }

    public void turnRight(){
        handle.right();
    }
}
