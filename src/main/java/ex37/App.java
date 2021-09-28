package ex37;
/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Ernesto Santos
 */

import java.util.Scanner;

public class App {
    public static void main( String[] args ) {
        Scanner sc = new Scanner(System.in);
        int length, spChar, nums;
        String password;

        System.out.print("What's the minimum length? ");
        length = Integer.parseInt(sc.nextLine());

        System.out.print("How many special characters? ");
        spChar = Integer.parseInt(sc.nextLine());

        System.out.print("How many numbers? ");
        nums = Integer.parseInt(sc.nextLine());


        password = genPassword(length, spChar, nums);

        System.out.printf("Your password is: %s", password);

        sc.close();
    }

    static String genPassword(int l, int s, int n) {
        Character temp;
        int choice, letCount;
        boolean flag;
        String retVal = "";

        letCount = l - (s + n);

        for(int i = 0; i < l; i++)
        {


            do{
                flag = false;

                choice = (int)(Math. random() * 3) + 1;
                switch (choice){
                    case 1: //Generate letters**********************
                        if(letCount > 0)
                        {
                            temp = (char) ((int)((Math.random() * (122 - 98)) + 97));
                            retVal = temp.toString().concat(retVal);
                            letCount--;
                        }
                        else
                            flag = true;
                        break;

                    case 2: //Generates Special Characters********************
                        if(s > 0)
                        {
                            temp = (char) ((int)((Math.random() * (38 - 36)) + 35));
                            retVal = temp.toString().concat(retVal);
                            s--;
                        }
                        else
                            flag = true;
                        break;

                    case 3: //Generate Numbers*****************
                        if(n > 0)
                        {
                            temp = (char) ((int)((Math.random() * (57 - 49)) + 49));
                            retVal = temp.toString().concat(retVal);
                            n--;
                        }
                        else
                            flag = true;
                        break;
                    default:
                        throw new IllegalStateException("Unexpected value: " + choice);
                }
            }while (flag);

        }

        return retVal;
    }
}
