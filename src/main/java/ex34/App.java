package ex34;
/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Ernesto Santos
 */

import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main( String[] args ) {
        Scanner sc = new Scanner(System.in);
        Data nameList = new Data();
        String name;
        int success;

        nameList.displayList();

        System.out.print("\nEnter an employee name to remove: ");
        name = sc.nextLine();

        success = nameList.delName(name.toLowerCase(Locale.ROOT));
        if(success == 1)
            nameList.displayList();
        else
            System.out.println("Delete was not successful.");

        sc.close();
    }
}
