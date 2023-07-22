/*
Day 50 coding Statement: Given an integer array of size N. Write Program to find sum of positive square elements in the array.

Sample input 1: 4 1 2 3 4
Sample output 1: 30
Explanation: (1 + 4 + 9 + 16) = 30

Sample input 2: 4 -1 -2 -3 -4
Sample output 2: 30
Explanation: (1 + 4 + 9 + 16) = 30
*/

import java.util.Scanner;

public class Day50 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size= sc.nextInt();
        int [] arr=new int[size];
        int result=0;
        for(int i=0;i<size;i++) {
            arr[i]= sc.nextInt();
            result+=Math.pow(arr[i],2);
        }
        System.out.print(result);
    }
}
