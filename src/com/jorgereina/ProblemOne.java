package com.jorgereina;

import java.util.Scanner;

public class ProblemOne
{

    public static void main(String[] args) {
	// write your code here

        Scanner scanner = new Scanner(System.in);
        String values = "Enter values to compute Pythagorean theorem.";
        System.out.println(values);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();


        double result = a*a + b*b;
        result = Math.sqrt(result);

        System.out.println("a: " + a);
        System.out.println("b: " + b );
        System.out.println("c: " + result);
    }

}
