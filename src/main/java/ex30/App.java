package ex30;
/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Ernesto Santos
 */


public class App {
    public static void main( String[] args ) {

        int[][] table = new int[12][12];

        //Sets up table
        for(int i = 0; i < table.length; i++)
        {
            for(int j = 0; j < table.length; j++)
                table[i][j] = (i + 1) * (j + 1);
        }

        //Displays table
        for (int i = 0, tableLength = table.length; i < tableLength; i++) {
            int[] ints = table[i];
            for (int j = 0; j < table.length; j++) {
                System.out.format("%3d  ", ints[j]);
            }
            System.out.println("");
        }

    }
}
