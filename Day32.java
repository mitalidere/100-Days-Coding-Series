/*
Day 32 coding Statement : Write a Program to Remove vowels from a string.
Description : Get a string as the input from the user and then remove all the vowel letters from the string and give the output.

Input : remove
Output : rmv
*/

import java.util.Scanner;

public class Day32 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        for(int i=0;i<s.length();i++) {
            if(s.charAt(i)=='a' || s.charAt(i)=='A' || s.charAt(i)=='e' || s.charAt(i)=='E' || s.charAt(i)=='i' || s.charAt(i)=='I' || s.charAt(i)=='o' || s.charAt(i)=='O' || s.charAt(i)=='u' || s.charAt(i)=='U') {
                s=s.substring(0,i)+s.substring(i+1);
                i--;
            }
        }
        System.out.print(s);
    }
}
