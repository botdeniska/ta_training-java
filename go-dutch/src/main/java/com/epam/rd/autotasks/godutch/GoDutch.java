package com.epam.rd.autotasks.godutch;

import java.util.Scanner;

public class GoDutch {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int amount = scan.nextInt();
        int numberOfFriends = scan.nextInt();
        if (amount < 0) {
            System.out.println("Bill total amount cannot be negative");
        } else if (numberOfFriends <= 0) {
            System.out.println("Number of friends cannot be negative or zero");
        } else {
            System.out.println((int) (amount * 1.1) / numberOfFriends);
        }
    }
}
