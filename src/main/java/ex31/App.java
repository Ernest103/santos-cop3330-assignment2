package ex31;
/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Ernesto Santos
 */

import java.util.Scanner;

public class App {
    public static void main( String[] args ) {
        Scanner sc = new Scanner(System.in);
        int age = -1, pulse = -1;
        double intensity, rate;
        boolean isValid;

        do{
            isValid = true;

            try {
                System.out.print("Please enter your age: ");
                age = Integer.parseInt(sc.nextLine());

                System.out.print("Please enter your resting heart rate: ");
                pulse = Integer.parseInt(sc.nextLine());
            } catch (Exception e){
                isValid = false;
            }


        }while (!isValid);

        System.out.println("Intensity    | Rate   ");
        System.out.println("-------------|--------");
        for(int i = 55; i <= 95; i += 5)
        {
            intensity = (double) i / 100;
            rate = (((220 - age) - pulse) * intensity) + pulse;

            System.out.format("%3d%%\t\t | %3d bpm\n", i, (int)Math.round(rate));
        }
        sc.close();

    }
}
