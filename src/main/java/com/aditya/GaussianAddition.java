/*
 * Author Name: Aditya Chaurasia
 * Date: 03-09-2022
 * Created With: IntelliJ IDEA Community Edition
 */
package com.aditya;

public class GaussianAddition {

    public double gaussianAddition(double number) {
        double a = 0;
        for (int i = 1; i <= number; i++) {
            a +=i;
        }
        return a;
    }
}
