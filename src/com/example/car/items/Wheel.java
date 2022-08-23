package com.example.car.items;

class Wheel{
    String name;
    Wheel(String wheelName){
        this.name = wheelName;
    }

    void go(){
        System.out.println(String.format("%s가 굴러갑니다.",name));
    }
}
