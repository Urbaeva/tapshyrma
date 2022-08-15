package com.tapshyrma15;

public class Circle {
    private static final double PI = 3.14;
    private static int radius;

    public Circle(int radius) {
        Circle.radius = radius;
    }

    public static void area(){
        System.out.println(PI*radius*radius);
    }

    public static void circumference(){
        System.out.println(2*PI*radius);
    }

    public double getPI() {
        return PI;
    }

    public int getRadius() {
        return radius;
    }
}
