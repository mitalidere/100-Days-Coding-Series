/*
Day 76 coding Statement: You are given N integers. In each step you can choose some K of the remaining numbers and delete them, if the following condition holds: Let the K numbers you've chosen be a1, a2, a3, ..., aK in sorted order. Then, for each i ≤ K - 1, ai+1 must be greater than or equal to ai * C.
                         You are asked to calculate the maximum number of steps you can possibly make.

Input: The first line of the input contains an integer T, denoting the number of test cases. The description of each testcase follows.
       The first line of each testcase contains three integers: N, K, and C
       The second line of each testcase contains the N initial numbers

Output: For each test case output the answer in a new line.

Sample Input: 2
              6 3 2
              4 1 2 2 3 1
              6 3 2
              1 2 2 1 4 4
Sample Output: 1
               2
*/

import java.util.Scanner;

public class Day76 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        int i=0;
        while (i<T){
            int N= sc.nextInt();
            int K= sc.nextInt();
            int C= sc.nextInt();
            int [] arr=new int[N];
            int count=0;
            for(int j=0;j<N;j++) {
                arr[j]=sc.nextInt();
            }
            for(int j=0;j<N-1;j++) {
                if(arr[j+1]>=arr[j]*C) {
                    count++;
                }
            }
            System.out.println(count);
            i++;
        }
    }
}
