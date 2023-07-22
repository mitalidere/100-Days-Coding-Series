/*
Day 15 coding Statement: Write a program to identify if the number is Strong number or not
Description: Get a number as input from user and then check whether that number is a strong number or not. A number is said to be strong number if the sum of the factorial of each digit in the number is same as that of the number.
             E.g. let the number be 145
             Here 1! + 4! + 5! is 1 + 24 + 120 which is equal to 145 itself.

Input: 121
Output: Not a strong number

Input: 2
Output: Strong number
*/

import java.util.Scanner;

public class Day15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int temp=num;
        int rem,add=0;
        if(num==0) {
            System.out.println("Not a strong number");
        }
        else {
            while (num != 0) {
                rem = num % 10;
                int fact = 1;
                for (int i = 1; i <= rem; i++) {
                    fact *= i;
                }
                add += fact;
                num /= 10;
            }
            if (temp == add) {
                System.out.println("Strong number");
            } else {
                System.out.println("Not a strong number");
            }
        }
    }
}
