package com.javaclass.inheritance;

public class Pet {
    // Class fields/attributes
    int age;
    int weight;
    int height;
    String size;
    String color;
    String name;
    String type;


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void move() {
        System.out.println("I am moving");
    }

    public void speak() {
        System.out.println("Speaking!");
    }

    public void sleep() {
        System.out.println("Taking a nap. Will see you soon");
    }
}
