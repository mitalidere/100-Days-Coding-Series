/*
Day 39 coding Statement: Write a Program to check if two strings are Anagram or not.
Description: Get two strings as input from the user and check whether it is Anagram or not.

Input: sunlight thgiluns
Output: Anagram
*/

import java.util.Scanner;

public class Day39 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
        int flag=0;
        if(s1.length()!=s2.length()) {
            System.out.println("Not anagram");
            System.exit(0);
        }
        for(int i=0;i<s1.length();i++) {
            for (int j = 0; j < s2.length(); j++) {
                if (s1.charAt(i) == s2.charAt(j)) {
                    s1 = s1.substring(0, i) + 0 + s1.substring(i + 1);
                    s2 = s2.substring(0, j) + 0 + s2.substring(j + 1);
                    break;
                }
            }
        }
        for(int i=0;i<s1.length();i++) {
            if(s1.charAt(i)!='0' || s2.charAt(i)!='0') {
                System.out.println("Not anagram");
                flag=1;
                break;
            }
        }
        if(flag==0) {
            System.out.println("Anagram");
        }
    }
}
