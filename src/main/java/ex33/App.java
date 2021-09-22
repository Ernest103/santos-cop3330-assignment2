package ex33;
/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Ernesto Santos
 */

import java.util.Scanner;

public class App {
    public static void main( String[] args ) {
        Scanner sc = new Scanner(System.in);
        String[] answers =
                {"Yes." , "No." , "Maybe." , "Ask again later."};
        String question;

        System.out.print("What is your question? \n > ");
        question = sc.nextLine();

        System.out.println(answers[index()]);

        sc.close();
    }

    public static int index() {
        return (int)(Math.random() * 4);
    }
}


