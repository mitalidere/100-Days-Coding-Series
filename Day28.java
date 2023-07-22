/*
Day 28 coding Statement: Write a Program to reverse a string.
Description: Get an input string from user and print it in reverse order.

Input: Hello
Output: olleH
*/

import java.util.Scanner;

public class Day28 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        for(int i=s.length()-1;i>=0;i--) {
            System.out.print(s.charAt(i));
        }
    }
}
