package com.epam.rd.autotasks.meetautocode;

import java.util.Scanner;

public class ElectronicWatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ss = scanner.nextInt();
        int hh = (ss / 3600) % 24;
        int mm = ((ss - hh * 3600) / 60) % 60;
        ss = (ss - hh * 3600 - mm * 60) % 60;
        System.out.printf("%d:%02d:%02d", hh, mm, ss);
    }
}
