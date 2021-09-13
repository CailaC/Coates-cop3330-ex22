package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Caila Coates
 */

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.printf("Enter the first number: ");
        int a = input.nextInt();
        System.out.printf("Enter the second number: ");
        int b = input.nextInt();
        System.out.printf("Enter the third number: ");
        int c = input.nextInt();

        if(a == b && b == c)
            return;

        int largest = 0;


        if (a > b && a > c) {
            largest = a;
        }

        if (b > a && b > c) {
            largest = b;
        }

        if (c > b && c > a) {
            largest = c;
        }

        System.out.println("The largest number is " + largest + ".");
    }
}
