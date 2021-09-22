package ex24;

import java.util.Arrays;
import java.util.Scanner;

/**
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Ernesto Santos
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        String s1, s2;
        boolean anagram;

        System.out.println("Enter two strings and I'll tell you if they are anagrams:");
        System.out.print("Enter the first string: ");
        s1 = sc.nextLine();

        System.out.print("Enter the second string: ");
        s2 = sc.nextLine();

        anagram = isAnagram(s1, s2);

        if(anagram)
            System.out.println("\"" + s1 + "\" and \"" + s2 + "\" are anagrams.");
        else
            System.out.println("The two string were not anagrams!");

        sc.close();
    }

    public static Boolean isAnagram(String str1, String str2)
    {
        char[] s1;
        char[] s2;

        if(str1.length() != str2.length())
            return false;

        s1 = str1.toCharArray();
        s2 = str2.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(s2);

        for(int i = 0; i < str1.length(); i++)
        {
            if(s1[i] != s2[i])
                return false;
        }

        return true;
    }
}
