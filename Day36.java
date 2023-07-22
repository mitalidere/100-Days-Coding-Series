/*
Day 36 coding Statement: Write a Program to Capitalize the first and last letter of each word of a string.
Description: Get a string from the user and then change the first and last letter to uppercase.

Input: programming
Output: ProgramminG
*/

import java.util.Scanner;

public class Day36 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        s=Character.toUpperCase(s.charAt(0))+s.substring(1);
        for(int i=1;i<s.length();i++) {
            if(s.charAt(i)==32) {
                s=s.substring(0,i-1)+Character.toUpperCase(s.charAt(i-1))+s.substring(i);
                if(i+1<s.length()) {
                    s=s.substring(0,i+1)+Character.toUpperCase(s.charAt(i+1))+s.substring(i+2);
                }
            }
        }
        s=s.substring(0,s.length()-1)+Character.toUpperCase(s.charAt(s.length()-1));
        System.out.print(s);
    }
}
