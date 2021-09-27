package ex35;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Ernesto Santos
 */

import java.util.Scanner;

public class App {
    public static void main( String[] args ) {
        Scanner sc = new Scanner(System.in);
        List names = new List();
        String _name = " ";

        while (!_name.equals(""))
        {
            System.out.print("Enter a name: ");
            _name = sc.nextLine();

            if(!_name.equals(""))
                names.initNames(_name);
        }

        _name = names.winner();
        System.out.println("The winner is... " + _name);

        sc.close();
    }
}
