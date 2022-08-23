package com.example;

class Person{
    String name;
    int age;
    String gender;

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class create {
    public static void main(String[] args) {
        Person kim = new Person("kimchi",28,"male");
        System.out.println("이름 " +kim.name + " 나이 " + kim.age +" 성별 "+kim.gender);

        Person ann = new Person("ann",25);
        System.out.println("이름 " +ann.name + " 나이 " + ann.age);

        Person lee = new Person("lee");
        System.out.println("이름 " +lee.name );
    }
}
