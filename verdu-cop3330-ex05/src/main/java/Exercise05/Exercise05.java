package Exercise05;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Evan Verdu
 */


import java.util.Scanner;

public class Exercise05 {

    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("What is the first number? ");
        String Number1 = scanner.nextLine();

        System.out.print("What is the second number? ");
        String Number2 = scanner.nextLine();

        int num1 = Integer.parseInt(Number1);
        int num2 = Integer.parseInt(Number2);

        System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
        System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
        System.out.println(num1 + " * " + num2 + " = " + (num1*num2));
        System.out.print(num1 + " / " + num2 + " = " + (num1/num2));


    }

}
