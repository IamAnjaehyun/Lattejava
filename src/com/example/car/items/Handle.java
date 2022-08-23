package com.example.car.items;

class Handle {
    void left() {
        turnOnLeftLight();
        System.out.println("좌회전 합니다.");
        turnOffLeftLight();
    }

    void turnOnLeftLight() {
        System.out.println("좌회전 깜빡이를 켭니다.");
    }

    void turnOffLeftLight() {
        System.out.println("좌회전 깜빡이를 끕니다.");
    }

    void right() {
        turnOnRightLight();
        System.out.println("우회전 합니다.");
        turnOffRightLight();
    }

    void turnOnRightLight() {
        System.out.println("우회전 깜빡이를 켭니다.");
    }

    void turnOffRightLight() {
        System.out.println("우회전 깜빡이를 끕니다.");
    }
}
