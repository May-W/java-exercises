package org.launchcode.java.studios;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        double a;
        double radius;
        double pi;
        Scanner in;

        pi = 3.14;

        in = new Scanner(System.in);
        System.out.println("Enter the radius:");
        radius = in.nextDouble();

        a = pi * radius * radius;

        System.out.println("Area is");
        System.out.println(a);

    }
}
