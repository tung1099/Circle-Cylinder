package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Circle circle = new Circle();
        circle = new Circle(5,"Blue");
        System.out.println(circle);
        System.out.println("Area = " + circle.getArea());
        System.out.println();

        Cylinder cylinder = new Cylinder();
        cylinder = new Cylinder(10,"green",15);
        System.out.println(cylinder);
        System.out.println("V= " + cylinder.getV());
    }
}
