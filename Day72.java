/*
Day 72 coding Statement: In this problem you will have to implement a simple editor. The editor maintains the content of a string S and have two following functions:
                         "+ i x": insert a string x into the current string S after the i'th character of the S (we use 1-indexing in this problem). When i equals to 0 it mean we add x at the beginning of S.
                         "? i len": Print the sub-string of length len starting at position i'th of S.
                         At the beginning, the editor holds an empty string. There will be Q queries of the two types described above.

Input: The first line contains the integer Q. Each line in the next Q lines contains one query.

Output: For each query of the second type, print out the answer sub-string in one line.

Sample Input: 5
              + 0 ab
              + 1 c
              ? 1 3
              + 2 dd
              ? 1 5
Sample Output: acb
               acddb
*/

import java.io.*;

public class Day72 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(br.readLine());
        StringBuilder sb=new StringBuilder();
        while(T>0) {
            String [] s=br.readLine().split(" ");
            int start=Integer.parseInt(s[1]);
            if(s[0].equals("+")) {
                sb.insert(start,s[2]);
            }
            else if(s[0].equals("?")) {
                int length=Integer.parseInt(s[2]);
                String new_s=sb.substring(start-1, length+start-1);
                System.out.println(new_s);
            }
            T--;
        }
    }
}
