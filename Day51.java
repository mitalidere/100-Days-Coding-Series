/*
Day 51 coding Statement: Given an integer array of size N, write a program to sort the array.

Sample input 1: 4
                2 4 1 3
Sample output 1: 1 2 3 4

Sample input 2: 5
                1 5 7 5 3
Sample output 2: 1 3 5 5 7
*/

import java.util.Scanner;

public class Day51 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int [] arr=new int[size];
        for(int i=0;i<size;i++) {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<size;i++) {
            for(int j=i+1;j<size;j++) {
                if(arr[i]>arr[j]) {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(int i=0;i<size;i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
