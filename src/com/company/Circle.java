package com.company;



public class Circle {
    private static final double pi=Math.PI;

    public static void areaCalculate(double radius){
        System.out.println("Area: "+pi*radius*radius);
    }
    public static void circumferenceCalculate(double radius){
        System.out.print("Circumference: "+pi*2*radius);
    }


}
