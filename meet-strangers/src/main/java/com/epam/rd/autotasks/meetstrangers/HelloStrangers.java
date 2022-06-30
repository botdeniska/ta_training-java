package com.epam.rd.autotasks.meetstrangers;

import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;

public class HelloStrangers {
    public static void main(String[] args) throws IOException {
        Scanner scanNumber = new Scanner(System.in);
        Scanner scanNames = new Scanner(System.in);

        int numberOfStrangers = scanNumber.nextInt();
        if (numberOfStrangers > 0){
            ArrayList <String> names = new ArrayList<>();
            for (int i = 0; i < numberOfStrangers; i++) {
                names.add(scanNames.nextLine());
            }

            for (int i = 0; i < numberOfStrangers; i++) {
                System.out.println("Hello, " + names.get(i));
            }

        } else if (numberOfStrangers == 0) {
            System.out.println("Oh, it looks like there is no one here");
        } else {
            System.out.println("Seriously? Why so negative?");
        }
    }
}
