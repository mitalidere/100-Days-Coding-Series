/*
Day 31 coding Statement : Write a Program to Toggle each character in a string.
Description : Get an input string from user and then convert the lower case of alphabets to upper case and all upper-case alphabets into lower case.

Input : Hello
Output : hELLO
*/

import java.util.Scanner;

public class Day31 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        for(int i=0;i<s.length();i++) {
            if(Character.isUpperCase(s.charAt(i))) {
                s=s.substring(0,i)+Character.toLowerCase(s.charAt(i))+s.substring(i+1);
            }
            else {
                s=s.substring(0,i)+Character.toUpperCase(s.charAt(i))+s.substring(i+1);
            }
        }
        System.out.println(s);
    }
}
