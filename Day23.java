/*
Day 23 coding Statement: Write a program to Replace all 0’s with 1 in a given integer.
Description: Get a number as input from the user and find the zeros present in that number.
              Then convert the zeros into one and then print it.

Input: 310020
Output: 311121
*/

import java.util.Scanner;

public class Day23 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long num=sc.nextInt();
        long rem,res=0;
        int x=0;
        while(num!=0) {
            rem=num%10;
            if(rem!=0) {
                res=res+rem*(int)Math.pow(10,x);
            }
            else {
                res=res+(rem+1)*(int)Math.pow(10,x);
            }
            num/=10;
            x++;
        }
        System.out.print(res);
    }
}
