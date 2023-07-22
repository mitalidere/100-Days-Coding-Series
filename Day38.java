/*
Day 38 coding Statement: Write a Program to print Non-repeating characters in a string.
Description: Get a string as the input from the user and print the non-repeating characters in a string.

Input: Hello
Output: H e o
*/

import java.util.Scanner;

public class Day38 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char [] arr=s.toCharArray();
        int [] count=new int [arr.length];
        for(int i=0;i< arr.length;i++) {
            for(int j=i+1;j< arr.length;j++) {
                if(arr[i]==arr[j] && arr[i]!=32) {
                    count[i]++;
                    count[j]++;
                }
            }
        }
        for(int i=0;i<s.length();i++) {
            if(count[i]>0) {
                s=s.substring(0,i)+0+s.substring(i+1);
            }
        }
        for(int i=0;i<s.length();i++) {
            if(s.charAt(i)=='0' || s.charAt(i)==' ') {
                s=s.substring(0,i)+s.substring(i+1);
                i--;
            }
        }
        for(int i=0;i<s.length();i++) {
            System.out.print(s.charAt(i)+" ");
        }
    }
}
