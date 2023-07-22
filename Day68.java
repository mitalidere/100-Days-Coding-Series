/*
Day 68 coding Statement: You will be given queries. Each query is of one of the following three types: :
                         Add an element to the set.
                         Delete an element from the set (If the number is not present in the set, then do nothing).
                         If the number is present in the set, then print "Yes"(without quotes) else print "No"(without quotes).
Input Format: The first line of the input contains where is the number of queries. The next lines contain query each. Each query consists of two integers and where is the type of the query and is an integer.
Output Format: For queries of type print "Yes"(without quotes) if the number is present in the set and if the number is not present, then print "No"(without quotes).
               Each query of type should be printed in a new line.

Sample Input: 8
              1 9
              1 6
              1 10
              1 4
              3 6
              3 14
              2 6
              3 6
Sample Output: Yes
               No
               No
*/

import java.util.*;

public class Day68
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int T= sc.nextInt();
        List<Integer> l=new ArrayList<>();
        for(int i=0;i<T;i++) {
            int n= sc.nextInt();
            int a= sc.nextInt();
            if(n==1) {
                l.add(a);
            }
            else if(n==2) {
                for(int j=0;j<l.size();j++) {
                    if(l.get(j)==a) {
                        l.remove(j);
                    }
                }
            }
            else if(n==3) {
                if(l.contains(a)) {
                    System.out.println("Yes");
                }
                else {
                    System.out.println("No");
                }
            }
        }
    }
}