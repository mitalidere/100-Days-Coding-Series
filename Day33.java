/*
Day 33 coding Statement: Write a Program to check if String is a palindrome or not.
Description: Get an input string from the user and then check whether it is a palindrome string or not.

Input: noon
Output: Palindrome

Input: Talent
Output: Not a Palindrome
*/

import java.util.Scanner;

public class Day33 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int flag=0;
        for(int i=0;i<s.length()/2;i++) {
            if(s.charAt(i)!=s.charAt(s.length()-i-1)) {
                flag=1;
                break;
            }
        }
        if (flag == 0) {
            System.out.print("Palindrome");
        }
        else {
            System.out.print("Not a Palindrome");
        }
    }
}
