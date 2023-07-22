/*
Day 18 coding Statement: Write a program to Add two fractions
Description: Get the values for numerator and denominator of two fractions, then add that fractions. Consider the following format
             x3/y3 = (x1/y1) + (x2/y2)
             here x3 = (x1*y2) + (x2*y1) and y3 = (y1*y2)

Input: 2  3
       4  3
Output: 2/1
*/

import java.util.Scanner;

public class Day18 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x1= sc.nextInt();
        int y1= sc.nextInt();
        int x2= sc.nextInt();
        int y2= sc.nextInt();

        int num=1,den=1;

        if(y1!=y2) {
            num=y1*x2+y2*x1;
            den=y1*y2;
        }
        else {
            num=x1+x2;
            den=y1;
        }

        if(num%den==0) {
            num=num/den;
            den=1;
        }
        else if(den%num==0) {
            num=1;
            den=den/num;
        }
        else {
            for(int i=2;i<10;i++) {
                if(num%i==0 && den%i==0) {
                    num=num/i;
                    den=den/i;
                    i=1;
                }
            }
        }
        System.out.println(num+"/"+den);
    }
}
