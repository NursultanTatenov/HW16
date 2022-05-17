package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Write radius of circle to calculate area and circumference:");
        double radius;
        Scanner sc=new Scanner(System.in);
        radius= sc.nextDouble();
        Circle.areaCalculate(radius);
        Circle.circumferenceCalculate(radius);

    }
}
