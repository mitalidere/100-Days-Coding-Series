/*
Day 54 coding Statement: Given an integer array of size N. Write Program to find whether Arrays are disjoint or not. Two arrays are said to be disjoint if they have no elements in common.

Sample input 1: 4
                2 -4 -1 -3
                3
                1 3 5
Sample output 1: Disjoint

Sample input 2: 5
                1 5 -7 6 3
                4
                2 4 6 8
Sample output 2: Not disjoint. (6 is common)
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Day54 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size1=sc.nextInt();
        int [] arr1=new int[size1];
        for(int i=0;i<size1;i++) {
            arr1[i]=sc.nextInt();
        }
        int size2=sc.nextInt();
        int [] arr2=new int[size2];
        for(int i=0;i<size2;i++) {
            arr2[i]=sc.nextInt();
        }
        List<Integer> l=new ArrayList<>();
        for(int i=0;i<size1;i++) {
            for(int j=0;j<size2;j++) {
                if(arr1[i]==arr2[j]) {
                    l.add(arr1[i]);
                }
            }
        }
        if(l.size()!=0) {
            System.out.print("Not Disjoint. (");
            for(int i=0;i<l.size();i++) {
                System.out.print(l.get(i)+" ");
            }
            System.out.print("is common)");
        }
        else {
            System.out.print("Disjoint");
        }
    }
}
