/*
Day 43 coding Statement: Write Program to find the array type.
Description: Get an array as input from the user and check the type of the array, whether it is odd, even or mixed type.

Input: Enter size of array :
       3
       Enter elements
       1 3 5
Output: Odd
*/

import java.util.Scanner;

public class Day43 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array :");
        int size=sc.nextInt();
        int [] arr=new int[size];
        int count=0;
        System.out.println("Enter elements");

        for(int i=0;i<size;i++) {
            arr[i]=sc.nextInt()%2;
            count+=arr[i];
        }

        if(count==0) {
            System.out.print("Even");
        }
        else if(count==size) {
            System.out.print("Odd");
        }
        else {
            System.out.print("Mixed");
        }
    }
}
