/*
Day 24 coding Statement: Write a program to print Pyramid pattern using stars.
Description: Get the number of lines as the input and print stars in that many lines or rows in a pyramid shape.

Input: 4
Output:   *
         ***
        *****
       *******
*/

import java.util.Scanner;

public class Day24 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        for(int i=0;i<rows;i++) {
            for(int j=rows-1-i;j>0;j--) {
                System.out.print(" ");
            }
            for(int j=0;j<=i*2;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
