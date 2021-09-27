package ex36;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Ernesto Santos
 */

import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main( String[] args ) {
        Scanner sc = new Scanner(System.in);
        Data values = new Data();
        String input;
        double temp;

        do{
            System.out.print("Enter a number: ");
            input = sc.nextLine();
            try {
                temp = Double.parseDouble(input);
            }catch (Exception e) {
                continue;
            }

            values.initData(input);

        }while (!input.toLowerCase(Locale.ROOT).equals("done"));

        values.prepData();
        values.displayData();

        sc.close();
    }

}
