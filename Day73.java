/*
Day 73 coding Statement: A string is called boring if all the characters of the string are same.
                         You are given a string S of length N, consisting of lowercase english alphabets. Find the length of the longest boring substring of S which occurs more than once.
                         Note that if there is no boring substring which occurs more than once in S, the answer will be 00.
                         A substring is obtained by deleting some (possibly zero) elements from the beginning of the string and some (possibly zero) elements from the end of the string.

Input Format: The first line of input will contain a single integer T, denoting the number of test cases.
              Each test case consists of two lines of input.
              The first line of each test case contains an integer N, denoting the length of string S.
              The next contains string S.

Output Format: For each test case, output on a new line, the length of the longest boring substring of S which occurs more than once.

Sample Input: 4
              3
              aaa
              3
              abc
              5
              bcaca
              6
              caabaa
Sample Output: 2
               0
               1
               2
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Day73 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int i=0;i<T;i++) {
            List<String> l=new ArrayList<>();
            int n=sc.nextInt();
            String s=sc.next();
            String s1="";
            int flag;
            if(s.length()==1) {
                System.out.println(0);
                continue;
            }
            if(s.charAt(n-1)==s.charAt(n-2)) {
                flag=1;
            }
            else {
                flag=0;
            }
            for(int j=0;j<n-1;j++) {
                if(s1=="") {
                    s1 += s.charAt(j);
                }
                if(s.charAt(j)==s.charAt(j+1)) {
                    s1+=s.charAt(j+1);
                }
                if((s.charAt(j)!=s.charAt(j+1)) || j==s.length()-2){
                    l.add(s1);
                    s1="";
                }
            }
            if(flag==0) {
                l.add(""+s.charAt(n-1));
            }
            int [] arr=new int[l.size()];
            int size=0;
            for(int j=0;j<l.size();j++) {
                for(int k=j+1;k<l.size();k++) {
                    if(Objects.equals(l.get(j), l.get(k))) {
                        arr[j]++;
                    }
                }
                if(arr[j]>0 && l.get(j).length()>size) {
                    size=l.get(j).length();
                }
            }
            if(l.size()==1 && (l.get(0).length())>1) {
                System.out.println(l.get(0).length()-1);
            }
            else {
                System.out.println(size);
            }
        }
    }
}