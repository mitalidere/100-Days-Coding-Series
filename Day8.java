/*
Day 8 coding Statement: Write a program to find roots of a quadratic equation.
Description: Get the values of a, b and c (coefficients of quadratic equation) as input from the user and calculate the roots and print as the output.

Input: Enter the value of a, b and c : 1 -6 9
Output: Roots are equal
        Root 1= root 2 = 3.00
*/

import java.util.Scanner;

public class Day8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of a,b and c : ");
        float a=sc.nextFloat();
        float b=sc.nextFloat();
        float c=sc.nextFloat();
        float discriminant=(float)Math.sqrt(b*b-4*a*c);
        if(discriminant>=0) {
            float x1=(-b+discriminant)/2*a;
            float x2=(-b-discriminant)/2*a;
            if(x1==x2) {
                System.out.println("Roots are equal");
                System.out.println("Root 1 = Root 2 = "+x1);
            }
            else {
                System.out.println("Roots are distinct");
                System.out.println("Root 1 = "+x1);
                System.out.println("Root 2 = "+x2);
            }
        }
        else {
            System.out.print("Roots are not real");
        }
    }
}
