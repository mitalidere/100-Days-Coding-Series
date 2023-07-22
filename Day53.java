/*
Day 53 coding Statement: Given an integer array of size N. Write Program to find maximum product subarray in a given array.

Sample input 1: 4
                2 -4 -1 -3
Sample output 1: 8 = {2, -4, -1}

Sample input 2: 5
                1 5 -7 5 3
Sample output 2: 15 = {5, 3}
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Day53 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int [] arr=new int[size];
        for(int i=0;i<size;i++) {
            arr[i]= sc.nextInt();
        }
        List<Integer> l=new ArrayList<>();
        int max=0;
        for(int i=0;i<size-1;i++) {
            max=arr[i]*arr[i+1];
            for(int j=i+2;j<size;j++) {
                if(max<max*arr[j]) {
                    max*=arr[j];
                }
                else {
                    break;
                }
            }
            l.add(max);
        }
        int y=0;
        int final_max=l.get(0);
        for(int i=1;i<l.size();i++) {
            if(final_max<l.get(i)) {
                final_max=l.get(i);
                y=i;
            }
        }
        System.out.print(final_max+" = {");
        int x=1;
        for(int i=y;i<size;i++) {
            if(x!=final_max) {
                System.out.print(arr[i]);
                x*=arr[i];
                if(x!=final_max) {
                    System.out.print(", ");
                }
            }
        }
        System.out.print("}");
    }
}
