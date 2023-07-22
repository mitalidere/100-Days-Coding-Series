/*
Day 42 coding Statement: Write Program to check if two arrays are the same or not.
Description: Get two arrays as the input from the user and check whether it is the same or not.

Input: Enter the size of first array :
       3
       Enter the size of second array :
       3
       Enter elements of first array :
       1 2 3
       Enter elements of second array :
       1 2 3
Output: Same
*/

import java.util.Scanner;

public class Day42 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of first array :");
        int size1= sc.nextInt();
        System.out.println("Enter the size of second array :");
        int size2=sc.nextInt();
        int [] arr1=new int[size1];
        int [] arr2=new int[size2];

        System.out.println("Enter elements of first array :");
        for(int i=0;i<size1;i++) {
            arr1[i]=sc.nextInt();
        }

        System.out.println("Enter elements of second array :");
        for(int i=0;i<size2;i++) {
            arr2[i]=sc.nextInt();
        }

        int flag=0;
        if(size1==size2) {
            for(int i=0;i<size1;i++) {
                if(arr1[i]!=arr2[i]) {
                    flag=1;
                    break;
                }
            }
            if(flag==0) {
                System.out.print("Same");
            }
            else {
                System.out.print("Not same");
            }
        }
        else {
            System.out.print("Not same");
        }
    }
}
