/*
Day 57 coding Statement: Pass or Fail
                         Anusree is struggling to pass a certain college course.
                         The test has a total of N question, each question carries 3 marks for a correct answer and −1 for an incorrect answer. Anusree is a risk-averse person so he decided to attempt all the questions. It is known that Anusree got X questions correct and the rest of them incorrect. For Anusree to pass the course he must score at least P marks.
                         Will Anusree be able to pass the exam or not?
Input Format: First line will contain T, number of testcases. Then the testcases follow.
              Each testcase contains of a single line of input, three integers N, X, P.
Output Format: For each test case output ""PASS"" if Chef passes the exam and ""FAIL"" if Chef fails the exam.
               You may print each character of the string in uppercase or lowercase (for example, the strings ""pAas"", ""pass"", ""Pass"" and ""PASS"" will all be treated as identical).

Sample Input 1: 3
                5 2 3
                5 2 4
                4 0 0
Sample Output 1: PASS
                 FAIL
                 FAIL
*/

import java.util.Scanner;

public class Day57 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T= sc.nextInt();
        int marks=0;
        for(int i=0;i<T;i++) {
            int N= sc.nextInt();
            int X= sc.nextInt();
            int P= sc.nextInt();
            marks=(X*3)+((N-X)*-1);
            if(marks>=P) {
                System.out.println("PASS");
            }
            else {
                System.out.println("FAIL");
            }
        }
    }
}
