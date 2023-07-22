/*
Day 14 coding Statement: Write a program to reverse a given number.
Description: Get an input from the user and the print the reverse of the given number as the output.
             E.g. let the number be 324 then the reverse of the number is 423

Input: 675
Output: 576
*/

import java.util.Scanner;

public class Day14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num= sc.nextInt();
        int rem=0;
        int rev_no=0;
        while(num!=0) {
            rem=num%10;
            num/=10;
            rev_no=rev_no*10+rem;
        }
        System.out.print(rev_no);
    }
}