/*
Day 48 coding Statement: Write Program to remove duplicate elements in an array.
Description: Get an array as input from the user and then remove all the duplicate elements in that array.

Input: Enter the size of array
       5
       Enter the elements of array
       35 35 45 60 60
Output: 35 45 60
*/

import java.util.Scanner;

public class Day48 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size=sc.nextInt();
        int [] arr=new int[size];
        System.out.println("Enter the elements of array");
        for(int i=0;i<size;i++) {
            arr[i]= sc.nextInt();
        }
        for(int i=0;i<size;i++) {
            int flag=0;
            for(int j=i-1;j>=0;j--){
                if(arr[i]==arr[j]) {
                    flag=1;
                    break;
                }
            }
            if(flag==0) {
                System.out.print(arr[i]+" ");
            }
        }
    }
}
