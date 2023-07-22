/*
Day 29 coding Statement: Write a Program to concatenate a string.
Description: Get two strings as input from the user and then concatenate it.

Input: Enter first string
       Hello
       Enter second string
       Hi
Output: HelloHi
*/

import java.util.Scanner;

public class Day29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first string");
        String s1=sc.next();
        System.out.println("Enter second string");
        String s2=sc.next();
        System.out.print(s1+s2);
    }
}