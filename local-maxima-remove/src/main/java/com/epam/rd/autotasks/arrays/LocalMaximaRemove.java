package com.epam.rd.autotasks.arrays;

import java.util.Arrays;

public class LocalMaximaRemove {

    public static void main(String[] args) {
        int[] array = new int[]{18, 1, 3, 6, 7, -5};

        System.out.println(Arrays.toString(removeLocalMaxima(array)));
    }

    public static int[] removeLocalMaxima(int[] array){
        int[] copyArray = new int[array.length];
        int[] finalArray;
        int numberOfStartCopy = 0;
        if (array[0] <= array[1]){
            System.arraycopy(array, 0, copyArray, numberOfStartCopy, 1);
            numberOfStartCopy++;
        }
        for (int i = 1; i < array.length - 1; i++) {
            if ((array[i] <= array[i - 1]) || (array[i] <= array[i + 1])) {
                System.arraycopy(array, i, copyArray, numberOfStartCopy, 1);
                numberOfStartCopy++;
            }
        }
        if (array[array.length - 1] <= array[array.length - 2]) {
            System.arraycopy(array, array.length - 1, copyArray, numberOfStartCopy, 1);
            numberOfStartCopy++;
        }
        finalArray = Arrays.copyOf(copyArray, numberOfStartCopy);
        return finalArray;
    }
}
