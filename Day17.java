/*
Day 17 coding Statement: Write a program to find the Factors of a number.
Description: Get an input from the user and find the factors of the number.

Input: 4
Output: 1,2,4
*/

import java.util.Scanner;

public class Day17 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        for(int i=1;i<=num;i++) {
            if(num%i==0) {
                System.out.print(i);
                if(num!=i) {
                    System.out.print(",");
                }
            }
        }
    }
}