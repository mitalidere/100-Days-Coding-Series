/*
Day 37 coding Statement: Write a Program to calculate the Frequency of characters in a string.
Description: Get a string as the input from the user and find the frequency of characters in the string.

Input: program
Output: The frequency of a is 1
        The frequency of g is 1
        The frequency of m is 1
        The frequency of o is 1
        The frequency of p is 1
        The frequency of r is 2
*/

import java.util.Scanner;

public class Day37 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char [] arr=s.toCharArray();

        char temp;
        for(int i=0;i< arr.length;i++) {
            for(int j=i+1;j< arr.length;j++) {
                if (arr[i] > arr[j]) {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(int i=0;i< arr.length;i++) {
            int count=1;
            for(int j=i+1;j<arr.length;j++) {
                if(arr[i]==arr[j]) {
                    count++;
                    arr[j]=0;
                }
            }
            if(arr[i]!=0 && arr[i]!=32) {
                System.out.println("The frequency of "+arr[i]+" is "+count);
            }
        }
    }
}
