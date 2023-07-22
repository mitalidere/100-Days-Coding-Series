/*
Day 41 coding Statement: Check if two strings match where one string contains wildcard characters.
Description: Get two strings as input from the user, first with wildcard characters (* and ?) and second without wildcard characters.
             Then check whether they match or not.

Input: Ta**nt
       Talent
Output: Yes they match
*/

import java.util.Scanner;

public class Day41 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        String s2= sc.next();
        int flag=0;
        if(s1.length()==s2.length()) {
            for(int i=0;i<s1.length();i++) {
                if(s1.charAt(i)!=s2.charAt(i) && (s1.charAt(i))!='*' && (s1.charAt(i))!='?') {
                    flag=1;
                    break;
                }
            }
            if(flag==0) {
                System.out.print("Yes they match");
            }
            else {
                System.out.print("No they don't match");
            }
        }
        else {
            System.out.print("No they don't match");
        }
    }
}
