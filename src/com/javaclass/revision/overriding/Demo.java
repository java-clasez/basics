package com.javaclass.revision.overriding;

public class Demo {
    public static void main(String[] args) {
        Transport t = new Transport();
        Bicycle b = new Bicycle();
        Car c = new Car();

        t.alert();
        b.alert();
        c.alert();
    }
}
