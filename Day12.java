/*
Day 12 coding Statement: Write a program to find Sum of digits of a number.
Description: Get a number from user and then find the sum of the digits in the given number.
             E.g. let the number = 341
             Sum of digits is 3+4+1= 8

Input: 4521
Output: 12
*/

import java.util.Scanner;

public class Day12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        long sum=0;
        while(num!=0) {
            sum+=num%10;
            num/=10;
        }
        System.out.print(sum);
    }
}