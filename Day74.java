/*
Day 74 coding Statement: You have a grid with N rows and M columns. You have two types of tiles — one of dimensions 2×2 and the other of dimensions 1×1. You want to cover the grid using these two types of tiles in such a way that:
                         Each cell of the grid is covered by exactly one tile; and
                         The number of 1×1 tiles used is minimized.
                         Find the minimum number of 1×1 tiles you have to use to fill the grid.

Input Format: The first line of input will contain a single integer T, denoting the number of test cases.
              Each test case consists of a single line containing two space-separated integers N,M.

Output Format: For each test case, print on a new line the minimum number of 1×1 tiles needed to fill the grid.

Sample Input: 4
              1 1
              4 5
              6 8
              3 2
Sample Output: 1
               4
               0
               2
*/

import java.util.Scanner;

public class Day74 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T= sc.nextInt();
        for(int i=0;i<T;i++) {
            int x=sc.nextInt();
            int y= sc.nextInt();
            int temp_x=x;
            int temp_y=y;
            int result=0;
            int [][] arr=new int [x][y];
            if(x%2!=0) {
                x=x-1;
            }
            if(y%2!=0) {
                y=y-1;
            }
            for(int j=0;j<x;j+=2) {
                for(int k=0;k<y;k+=2) {
                    if(arr[j][k]==0 && arr[j][k+1]==0 && arr[j+1][k]==0 && arr[j+1][k+1]==0) {
                        arr[j][k]=1;
                        arr[j][k+1]=1;
                        arr[j+1][k]=1;
                        arr[j+1][k+1]=1;
                    }
                }
            }
            for(int j=0;j<temp_x;j++) {
                for (int k = 0; k < temp_y; k++) {
                    if(arr[j][k]==0) {
                        result++;
                    }
                }
            }
            System.out.println(result);
        }
    }
}

/*

OR

public class Day74 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            if(x%2==0 && y%2==0) {
                System.out.println(0);
            }
            else if(x%2==0) {
                System.out.println(x);
            }
            else if(y%2==0) {
                System.out.println(y);
            }
            else {
                System.out.println(x+y-1);
            }
        }
    }
}
*/
