package com.epam.rd.autotasks;

import java.util.Arrays;

class CycleSwap {
    static void cycleSwap(int[] array) {
        if (array.length != 0){
            int[] swap = Arrays.copyOf(array, array.length);
            System.arraycopy(swap, 0, array, 1, swap.length - 1);
            array[0] = swap[swap.length - 1];
        }
    }

    static void cycleSwap(int[] array, int shift) {
        if (array.length != 0) {
            int[] swap = Arrays.copyOf(array, array.length);
            System.arraycopy(swap, 0, array, shift, swap.length - shift);
            System.arraycopy(swap, swap.length - shift, array, 0, shift);
        }
    }
}
