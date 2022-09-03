/*
 * Author Name: Aditya Chaurasia
 * Date: 03-09-2022
 * Created With: IntelliJ IDEA Community Edition
 */
package com.aditya;

import java.util.Scanner;

public class GaussianAddition {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner scanner = new Scanner(System.in);

        // prompt the user to enter the number
        System.out.println("Enter a number: ");
        double number = scanner.nextDouble();

        // create an object to call the method
        GaussianAddition gaussianAddition = new GaussianAddition();

        // call the method and store the result in a variable
        double Result = gaussianAddition.gaussianAddition(number);

        // Display the result
        System.out.println("The result is: " + Result);
    }

    public double gaussianAddition(double number) {
        double a = 0;
        for (int i = 1; i <= number; i++) {
            a += i;
        }
        return a;
    }
}
