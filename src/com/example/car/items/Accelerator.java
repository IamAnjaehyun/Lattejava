package com.example.car.items;

class Accelerator {
    String name;

    Accelerator(String carName) {
        this.name = carName;
    }

    void push() {
        System.out.println(String.format("%s의 악셀이 밟혀 앞으로 가고있습니다.", name));
    }
}
