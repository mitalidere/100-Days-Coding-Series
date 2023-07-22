/*
Day 27 coding Statement: Write a program to find the double of the given number without using arithmetic operator.
Description: For the given input number calculate the double of it without using arithmetic operator.

Input: 4
Output: 8
*/

import java.util.Scanner;
public class Day27 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.print(num<<1);
    }
}