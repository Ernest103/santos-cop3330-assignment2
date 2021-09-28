package ex38;
/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Ernesto Santos
 */

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main( String[] args ) {
        Scanner sc = new Scanner(System.in);
        String list;
        Integer[] even;

        System.out.print("Enter a list of numbers, separated by spaces: ");
        list = sc.nextLine();
        String[] num_list = list.split(" ");

        even = filterEvenNumbers(num_list);

        displayNums(even);


        sc.close();
    }

    public static Integer[] filterEvenNumbers(String[] list) {
        ArrayList<Integer> even_nums = new ArrayList<>();

        for(int i = 0; i < list.length; i++)
        {
            int temp = Integer.parseInt(list[i]);
            if((temp % 2) == 0)
                even_nums.add(temp);
        }

        Integer[] ret_list = new Integer[even_nums.size()];
        ret_list = even_nums.toArray(ret_list);

        return ret_list;
    }

    public static void displayNums(Integer[] list){
        System.out.print("The even numbers are: ");

        for(int i : list)
        {
            System.out.print(i + " ");
        }
    }
}
