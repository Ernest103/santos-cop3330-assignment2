package ex28;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Ernesto Santos
 */

import java.util.Scanner;

public class App {
    public static void main( String[] args ) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[5];
        int total = 0;

        for (int i = 0; i < num.length; i++)
        {
            System.out.print("Enter a number: ");
            num[i] = sc.nextInt();

            total += num[i];
        }

        System.out.println("The total is " + total);

        sc.close();
    }
}
