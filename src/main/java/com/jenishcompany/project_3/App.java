package com.jenishcompany.project_3;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
           // initializing variables
        int num1 = 10, num2 = 20, sum = 0;
 
        // Displaying num1 and num2
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
 
        // adding num1 and num2
        sum = num1 + num2;
        System.out.println("The sum = " + sum);
    }
}
import java.io.*;
 

class Division {

    public static void main(String[] args)

    {

        // initializing variables

        int num1 = 20, num2 = 10, div = 0;
 

        // Displaying num1 and num2

        System.out.println("num1 = " + num1);

        System.out.println("num2 = " + num2);
 

        // Dividing num1 and num2

        div = num1 / num2;

        System.out.println("Division = " + div);

    }
}

class Multiplication {

    public static void main(String[] args)

    {

        // initializing variables

        int num1 = 20, num2 = 10, mult = 0;
 

        // Displaying num1 and num2

        System.out.println("num1 = " + num1);

        System.out.println("num2 = " + num2);
 

        // Multiplying num1 and num2

        mult = num1 * num2;

        System.out.println("Multiplication = " + mult);

    }
}

import java.util.*;
 
class GFG {
    //function that calculate modular exponentiation x^n mod m.
    public static int modpower(int x, int n, int m) {
        if (n == 0) //base case 
            return 1 % m; 
        long u = modpower(x, n / 2, m);  
        u = (u * u) % m;
        if (n % 2 == 1) // when 'n' is odd
            u = (u * x) % m;
        return (int)u;
    }
 
    //driver function
    public static void main(String[] args) {
        System.out.println(modpower(5, 2, 7));
    }
}

import java.io.*;
 
class Subtraction {
    public static void main(String[] args)
    {
        // initializing variables
        int num1 = 20, num2 = 10, sub = 0;
 
        // Displaying num1 and num2
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
 
        // subtracting num1 and num2
        sub = num1 - num2;
        System.out.println("Subtraction = " + sub);
    }
}
