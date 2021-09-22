package ex32;
/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Ernesto Santos
 */

import java.util.Scanner;

public class App {
    public static void main( String[] args ) {
        Scanner sc = new Scanner(System.in);
        int num = 0, input, guess = 0;
        String repeat;
        boolean valid;

        do {
            valid = true;




            if(guess == 0) //Only generate a number the first run through
            {
                System.out.print("Enter the difficulty level:(1, 2, 3) ");
                try {
                    input = Integer.parseInt(sc.nextLine());
                } catch (NumberFormatException e) {
                    valid = false;
                    continue;
                }
                num = createNum(input);
                System.out.print("I have my number. What's your guess? ");
            }

            try {
                input = Integer.parseInt(sc.nextLine());
            }catch (Exception e) {
                valid = false;
                guess++;
                continue;
            }

            if(input < num)
            {
                System.out.print("Too low. Guess again: ");
                guess++;
                valid = false;
            }
            else if(input > num)
            {
                System.out.print("Too high. Guess again:");
                guess++;
                valid = false;
            }
            else
            {
                System.out.println("You got it in " + (guess + 1)  + " guesses!");
                System.out.print("\nWould you like to play again? (Y/N) ");
                repeat = sc.nextLine();
                if(repeat.toLowerCase().equals("y"))
                {
                    valid = false;
                    guess = 0;
                }
            }


        }while(!valid);



        sc.close();
    }

    public static int createNum(int level)
    {
        int num = 0;
        switch (level)
        {
            case 1:
                num = (int)(Math.random() * 10) + 1;
                break;
            case 2:
                num = (int)(Math.random() * 100) + 1;
                break;
            case 3:
                num = (int)(Math.random() * 1000) + 1;
        }

        return num;
    }
}
