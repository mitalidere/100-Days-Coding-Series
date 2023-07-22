/*
Day 56 coding Statement: Write Program to find whether the numbers of an array be made equal.
Description: Check whether the numbers of array be made equal or not.
             For eg, for the following input it should print yes because
             50*2*3 , 75*2*2 and 150*2 are equal to 300 in all cases. So array numbers can be made equal.

Input: 3
       50 75 150
Output: Yes
*/

import java.util.Scanner;

public class Day56 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int flag=0;
        int [] arr=new int [size];
        for(int i=0;i<size;i++) {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<size;i++) {
            while(arr[i]%2==0) {
                arr[i]/=2;
            }
            while(arr[i]%3==0) {
                arr[i]/=3;
            }
            if(arr[i]!=arr[0]) {
                flag=1;
                break;
            }
        }
        if(flag==0) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}
