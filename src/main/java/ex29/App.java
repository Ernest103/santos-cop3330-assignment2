package ex29;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Ernesto Santos
 */

import java.util.Scanner;

public class App {
    public static void main( String[] args ) {
        Scanner sc = new Scanner(System.in);
        boolean isValid;
        int rate = -1, years;

        do{
            isValid = true;

            System.out.print("What is the rate of return? ");
            try {
                rate = Integer.parseInt(sc.nextLine());
                if(rate == 0)
                    isValid = false;
            } catch (Exception InputMismatchException) {
                isValid = false;
            }

            if(!isValid)
                System.out.println("Sorry that is not a valid input.");

        }while (!isValid);

        years = 72 / rate;
        System.out.println("It will take " + years + " years to double your initial investment.");

        sc.close();
    }
}
