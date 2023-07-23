/*
Day 71 coding Statement: There are N students in a class, where the i-th student has a score of Ai?.
                         The i-th student will boast if and only if the number of students scoring less than or equal Ai? is greater than the number of students scoring greater than Ai?.
                         Find the number of students who will boast.

Input Format: The first line contains T - the number of test cases. Then the test cases follow.
              The first line of each test case contains a single integer N - the number of students.
              The second line of each test case contains N integers 1,2,…,A1?,A2?,…,AN? - the scores of the students.

Output Format: For each test case, output in a single line the number of students who will boast.
*/

import java.util.Arrays;
import java.util.Scanner;

public class Day71 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int i=0;i<T;i++) {
            int N= sc.nextInt();
            int [] arr=new int[N];
            for(int j=0;j<N;j++) {
                arr[j]= sc.nextInt();
            }
            Arrays.sort(arr);
            int mid=N/2;
            while(mid>0 && arr[mid-1]==arr[mid]) {
                mid--;
            }
            System.out.println(N-mid);
        }
    }
}
