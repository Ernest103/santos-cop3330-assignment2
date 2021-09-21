package ex25;

/**
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Ernesto Santos
 */

import java.util.Scanner;

public class App {
    public static void main( String[] args ) {

        String password, output;
        Scanner sc = new Scanner(System.in);
        int strength;

        System.out.print("Please enter your password: ");
        password = sc.nextLine();

        strength = passwordValidator(password);

        switch (strength){
            case 0:
                output = "very week!";
                break;
            case 1:
                output = "weak.";
                break;
            case 3:
                output = "Strong.";
                break;
            case 4:
                output = "Very Strong!";
                break;
            default:
                output = null;
                break;
        }

        if(output != null)
        {
            System.out.println("The password " + password + " is " + output);
        }
    }

    public static int passwordValidator(String pw) {
        char[] arrPW = pw.toCharArray();
        int strVal = 3;
        boolean isNumeric = true;
        boolean isLet = true;
        boolean contSpecial = false;


        for(int i = 0; i < pw.length(); i++)
        {
            if(!Character.isDigit(arrPW[i])) {
                isNumeric = false;
                break;
            }
        }
        if(isNumeric) //The password contains only numbers
        {
            strVal -= 2;
            if(pw.length() < 8)
                strVal--;
            return strVal;
        }

        for (int i = 0; i < pw.length(); i++) {
            if (!Character.isLetter(arrPW[i])) {
                isLet = false;
                break;
            }
        }
        if(isLet) //The password contains only letters
        {
            strVal --;
            if(pw.length() < 8)
                strVal--;
            return strVal;
        }


        for(int i = 0; i < pw.length(); i++)
        {
            if(!Character.isDigit(arrPW[i]) && !Character.isLetter(arrPW[i])) {
                contSpecial = true;
                break;
            }
        }
        if(contSpecial && pw.length() > 8)
            return ++strVal;



        return strVal;
    }
}
