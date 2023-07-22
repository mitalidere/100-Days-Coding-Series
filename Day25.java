/*
Day 25 coding Statement: Write a program to find Area of a circle
Description: Get the value for radius from the user and calculate the area of the circle for the given radius.
              Area of circle = 3.14*radius*radius
Input: 3
Output: 28.26
*/

import java.util.Scanner;

public class Day25 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int radius=sc.nextInt();
        float area=3.14f*radius*radius;
        System.out.printf("%.2f",area);
    }
}
