/*
Day 75 coding Statement: You are a person who is always fond of eating candies. Your friend gave you a candy of length N, to eat during the break period of your school.
                         You start eating this candy from one of the ends. But as it is not your candy, your friend told you to eat exactly K unit length of candy during each bite. You will stop eating if the candy's length becomes 00. This means that you have eaten the entire candy.
                         If at some point of time, the candy's length is positive, but less than K, you cannot take a bite thereafter.
                         Can you eat the complete candy? If yes, print the number bites it will take, else print −1−1.

Input Format: First line will contain T, number of testcases. Then the testcases follow.
              Each testcase contains of two spaced integers N, K.

Output Format: For each testcase, print the minimum number of bites you need to eat the complete candy. Print −1−1 if it is not possible to do so.

Sample Input: 3
              3 1
              3 2
              0 3
Sample Output: 3
               -1
               0
*/

import java.util.Scanner;

public class Day75 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int i=0;i<T;i++) {
            int N= sc.nextInt();
            int K= sc.nextInt();
            if(N<K) {
                System.out.println(0);
            }
            else if(N%K==0) {
                System.out.println(N/K);
            }
            else if(N%K!=0) {
                System.out.println(-1);
            }
        }
    }
}
