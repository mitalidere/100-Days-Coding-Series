/*
Day 22 coding Statement: Write a program to express a number as a sum of two prime numbers.
Description: Get a number as input from the user and express that number as sum of two prime numbers.

Input: 4
Output: 4 can be expressed as sum of 2 and 2
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Day22 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        List<Integer> l=new ArrayList<>();
        for(int i=1;i<=num;i++) {
            int flag=0;
            for (int j = 2; j < num; j++) {
                if (i % j == 0 && i!=j) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0 && i > 1) {
                l.add(i);
            }
        }
        for(int i=0;i<l.size();i++) {
            for(int j=0;j<l.size();j++) {
                if(l.get(i)+l.get(j)==num) {
                    System.out.print(num+" can be expressed as sum of "+l.get(i)+" and "+l.get(j));
                }
            }
        }
    }
}
