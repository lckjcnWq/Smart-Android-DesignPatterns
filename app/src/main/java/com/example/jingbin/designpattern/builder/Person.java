package com.example.jingbin.designpattern.builder;

public class Person {
    private String name;
    private boolean sex;
    private int age;
    private float height;
    private float weight;


    public Person(String name, boolean sex, int age, float height, float weight) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }
}
