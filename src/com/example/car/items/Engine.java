package com.example.car.items;

class Engine {
    String name;
    boolean isStarted = false;

    Engine(String carName) {
        this.name = carName;
    }

    void start() {
        if (isStarted) {
            System.out.println(String.format("%s는 이미 시동이 걸려있습니다.", name));
            return;
        }
        isStarted = true;
        System.out.println(String.format("%s의 시동이 걸렸습니다.", name));
    }

    void turnOff() {
        if (!isStarted) {
            System.out.println(String.format("%s의 시동이 이미 꺼져있습니다..", name));
            return;
        }
        isStarted = false;
        System.out.println(String.format("%s의 시동이 꺼졌습니다.", name));
    }
}
