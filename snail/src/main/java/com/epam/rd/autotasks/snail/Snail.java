package com.epam.rd.autotasks.snail;

import java.util.Scanner;

public class Snail
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int h = scan.nextInt();
        int numberOfDays = 0;
        if (a >= h) {
            System.out.println(1);
        } else if (a > b) {
            do {
                h = h - a;
                numberOfDays++;
                if (h > 0) {
                    h = h + b;
                }
            } while (h > 0);
            System.out.println(numberOfDays);
        } else {
            System.out.println("Impossible");
        }
    }
}
