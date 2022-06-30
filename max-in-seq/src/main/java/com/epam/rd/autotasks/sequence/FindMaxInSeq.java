package com.epam.rd.autotasks.sequence;
import java.util.ArrayList;
import java.util.Scanner;

public class FindMaxInSeq {
    public static int max() {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> sequenceMaxValue = new ArrayList<>();
        int i = 0;
        do {
            sequenceMaxValue.add(scan.nextInt());
            i++;
        } while (sequenceMaxValue.get(i - 1) != 0);
        int maximum = sequenceMaxValue.get(0);
        for (int q = 1; q < sequenceMaxValue.size() - 1; q++) {
            if (sequenceMaxValue.get(q) > maximum) {
                maximum = sequenceMaxValue.get(q);
            }
        }
        return maximum;
    }

    public static void main(String[] args) {
        System.out.println(max());
    }
}
