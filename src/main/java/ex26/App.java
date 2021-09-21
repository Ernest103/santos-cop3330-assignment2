package ex26;

import java.util.Scanner;

/**
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Ernesto Santos
 */

public class App {
        public static void main( String[] args ) {
            Scanner sc = new Scanner(System.in);
            double APR, balance, monthPay;
            int numMonths;
            PaymentCalculator calc = new PaymentCalculator();

            System.out.print("What is your balance? ");
            balance = sc.nextDouble();
            System.out.print("What is your APR on the card?(as a percent) ");
            APR = sc.nextDouble();
            System.out.print("What is the monthly payments you can make? ");
            monthPay = sc.nextDouble();

            numMonths = calc.calculateMonthsUntilPaidOff(balance, APR, monthPay);
            System.out.println("It will take you "+ numMonths +" months to pay off this card.\n");

        }





}
