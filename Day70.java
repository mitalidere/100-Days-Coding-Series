/*
Day 70 coding Statement: Given an array, rotate the array by one position in clock-wise direction.

Example 1:
Input: N = 5
       A[] = {1, 2, 3, 4, 5}
Output: 5 1 2 3 4

Example 2:
Input: N = 8
       A[] = {9, 8, 7, 6, 4, 2, 1, 3}
Output: 3 9 8 7 6 4 2 1
*/

import java.util.Scanner;

public class Day70 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N= sc.nextInt();
        int [] A=new int [N];
        for(int i=0;i<N;i++) {
            A[i]= sc.nextInt();
        }
        int temp=A[N-1];
        for(int i=0;i<N-1;i++) {
            A[N-1-i]=A[N-2-i];
        }
        A[0]=temp;
        for(int i=0;i<N;i++) {
            System.out.print(A[i]+" ");
        }
    }
}
