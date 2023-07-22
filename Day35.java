/*
Day 35 coding Statement: Write a Program to Count the sum of numbers in a string.
Description: Get a string from the user and find the sum of numbers in the string.

Input: Hello56
Output: 11
*/

import java.util.Scanner;

public class Day35 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int result=0;
        for(int i=0;i<s.length();i++) {
            if(s.charAt(i)>=49 && s.charAt(i)<=57) {
                result+=s.charAt(i)-48;
            }
        }
        System.out.print(result);
    }
}