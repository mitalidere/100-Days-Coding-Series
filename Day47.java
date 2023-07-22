/*
Day 47 coding Statement: Write Program to find longest palindrome in an array.
Description:Get an array as the input from the user and find the longest palindrome in that array.

Input: Enter the size of array
       3
       Enter the elements of array
       121 10456 1000001
Output: 1000001
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Day47 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size=sc.nextInt();
        int [] arr=new int[size];
        List<Integer> l=new ArrayList<>();
        System.out.println("Enter the elements of array");
        for(int i=0;i<size;i++) {
            arr[i]=sc.nextInt();
            int temp=arr[i],quo,num=0;
            while(temp!=0) {
                quo=temp%10;
                temp/=10;
                num=num*10+quo;
            }
            if(arr[i]==num) {
                l.add(arr[i]);
            }
        }
        int greatest=l.get(0);
        for(int i=1;i<l.size();i++) {
            if(l.get(i)>greatest) {
                greatest=l.get(i);
            }
        }
        System.out.print(greatest);
    }
}
