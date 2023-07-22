/*
Day 2 coding Statement: Write a program to identify if the character is an alphabet or not.
Description: Take an input character from user and check whether it is an alphabet or not.

Input: A
Output: Alphabet

Input: 7
Output: Not an alphabet
*/

import java.util.Scanner;

public class Day2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char c=sc.next().charAt(0);
        if((c>=97 && c<=122) || (c>=65 && c<=90)) {
            System.out.println("Alphabet");
        }
        else {
            System.out.println("Not an alphabet");
        }
    }
}
