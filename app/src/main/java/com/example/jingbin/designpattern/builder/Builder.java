package com.example.jingbin.designpattern.builder;

public interface Builder {

    public Builder setName(String name);

    public Builder setSex(boolean sex);

    public Builder setAge(int age);

    public Builder setHeight(float height);

    public Builder setWeight(float weight);

    public Person create();
}
