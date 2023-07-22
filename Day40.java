/*
Day 40 coding Statement: Write a Program to Replace substring in a string.
Description: Get a string as input from the user and then get another string which has to be removed from the string.
             Get the third input, the new substring which is placed in that substring position.
             Finally print the output by replacing the substring with new string.

Input: Enter a string
       talentbattle
       Enter the substring to be removed :
       talent
       Enter the new substring :
       student
Output: The new string :
        studentbattle
*/

import java.util.Scanner;

public class Day40 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String s1= sc.next();
        System.out.println("Enter the substring to be removed :");
        String s2=sc.next();
        System.out.println("Enter the new substring :");
        String s3=sc.next();
        int temp=0,flag=0;
        for(int i=0;i<s1.length()-s2.length();i++) {
            for(int j=0;j<s2.length();j++) {
                if(s2.charAt(j)!=s1.charAt(i+j)) {
                    break;
                }
                else if(j==s2.length()-1 && (s2.charAt(s2.length()-1)==s1.charAt(i+s2.length()-1))) {
                    temp=i;
                    flag=1;
                }
            }
        }
        if(flag==1) {
            s1 = s1.substring(0, temp) + s3 + s1.substring(temp + s2.length());
        }
        System.out.println("The new string :\n"+s1);
    }
}
