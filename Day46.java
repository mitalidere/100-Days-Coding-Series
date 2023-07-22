/*
Day 46 coding Statement: Write Program to find sum of elements in an array.
Description: Get an array as the input from the user and find the sum of the elements.

Input: Enter the size of array
       3
       Enter the elements of array
       5 10 15
Output: 30
*/

import java.util.Scanner;

public class Day46 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size=sc.nextInt();
        int [] arr=new int[size];
        int count=0;
        System.out.println("Enter the elements of array");
        for(int i=0;i<size;i++) {
            arr[i]=sc.nextInt();
            count+=arr[i];
        }
        System.out.print(count);
    }
}
