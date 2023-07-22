/*
Day 4 coding Statement: Write a program to identify of the number is positive or negative.
Description: Get an input number from the user and check whether it is a positive or negative number.

Input: -10
Output: Negative number

Input: 0
Output: Neither positive nor negative

Input: 15
Output: Positive number
*/

import java.util.Scanner;

public class Day4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int input=sc.nextInt();
        if(input>0) {
            System.out.print("Positive number");
        }
        else if(input<0) {
            System.out.print("Negative number");
        }
        else {
            System.out.print("Neither positive nor negative");
        }
    }
}
