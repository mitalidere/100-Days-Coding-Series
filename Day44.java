/*
Day 44 coding Statement: Write Program to find number of even and odd elements in an array.
Description: Get an array as input from the user and then count the number of even and odd elements present in the array.

Input: Enter size of array
       4
       Enter the elements :
       1 3 4 5
Output: Number of even elements :
        1
        Number of odd elements :
        3
*/

import java.util.Scanner;

public class Day44 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        int size= sc.nextInt();
        int [] arr=new int[size];
        int even=0,odd=0;
        System.out.println("Enter the elements :");
        for(int i=0;i<size;i++) {
            arr[i]=sc.nextInt();
            if(arr[i]%2==0) {
                even++;
            }
            else {
                odd++;
            }
        }
        System.out.println("Number of even elements :\n"+even);
        System.out.println("Number of odd elements :\n"+odd);
    }
}
