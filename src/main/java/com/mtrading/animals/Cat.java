package com.mtrading.animals;

public class Cat {

    private String name;
    private Integer assSize;

    public Cat(String name, Integer assSize) {
        this.name = name;
        this.assSize = assSize;
    }

    public String getName() {
        return name;
    }

    public Integer getAssSize() {
        return assSize;
    }
}
