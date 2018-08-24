package com.example.jingbin.designpattern.builder;

import android.app.Activity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class ConcreteBuilder implements Builder {
    private String name;
    private boolean sex;
    private int age;
    private float height;
    private float weight;

    public Builder setName(String name) {
        this.name = name;
        return this;
    }

    public Builder setSex(boolean sex) {
        this.sex = sex;
        return this;
    }

    public Builder setAge(int age) {
        this.age = age;
        return this;
    }

    public Builder setHeight(float height) {
        this.height = height;
        return this;
    }

    public Builder setWeight(float weight) {
        this.weight = weight;
        return this;
    }

    public Person create() {
        return new Person(name, sex, age, height, weight);
    }
}
