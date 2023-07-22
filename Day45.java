/*
Day 45 coding Statement: Write Program to find smallest and largest element in an array.
Description: Get an array as input from the user and then find the smallest and largest element in the array.

Input: Enter the size of array :
       5
       Enter the elements :
       10 20 5 40 30
Output: Smallest Number :
        5
        Largest Number :
        40
*/

import java.util.Scanner;

public class Day45 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array :");
        int size=sc.nextInt();
        int [] arr=new int[size];
        System.out.println("Enter the elements :");
        for(int i=0;i<size;i++) {
            arr[i]=sc.nextInt();
        }
        int greatest=arr[0],smallest=arr[0];
        for(int i=0;i<size;i++) {
            if(smallest>arr[i]) {
                smallest=arr[i];
            }
            if(greatest<arr[i]) {
                greatest=arr[i];
            }
        }
        System.out.println("Smallest Number :\n"+smallest);
        System.out.println("Largest Number :\n"+greatest);
    }
}
