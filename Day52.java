/*
Day 52 coding Statement: Given an integer array of size N, write a program to reverse the array.

Sample input 1: 4
                2 4 1 3
Sample output 1: 3 1 4 2

Sample input 2: 5
                1 5 7 5 3
Sample output 2: 3 5 7 5 1
*/

import java.util.Scanner;

public class Day52 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int [] arr=new int[size];
        for(int i=0;i<size;i++) {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<size/2;i++) {
            int temp=arr[i];
            arr[i]=arr[size-i-1];
            arr[size-i-1]=temp;
        }
        for(int i=0;i<size;i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
