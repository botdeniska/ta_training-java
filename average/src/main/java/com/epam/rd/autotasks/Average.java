package com.epam.rd.autotasks;

import java.util.ArrayList;
import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> sequenceAverageValue = new ArrayList<>();
        int i = 0;
        do {
            sequenceAverageValue.add(scanner.nextInt());
            i++;
        } while (sequenceAverageValue.get(i - 1) != 0);
        int sum = 0;
        for (int q = 0; q < sequenceAverageValue.size() - 1; q++) {
            sum += sequenceAverageValue.get(q);
            }
        System.out.println(sum / (sequenceAverageValue.size() - 1));
        }
    }