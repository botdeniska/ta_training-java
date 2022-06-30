package com.epam.rd.autotasks.pizzasplit;

import java.util.Scanner;

public class PizzaSplit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfMembers = scanner.nextInt();
        int numberOfPieces = scanner.nextInt();
        for (int i = 1; i <= numberOfMembers; i++) {
            if ((i * numberOfPieces) % numberOfMembers == 0) {
                System.out.println(i);
                break;
            }
        }
    }
}
