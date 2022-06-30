package com.epam.rd.autotasks.max;

public class MaxMethod {
    public static int max(int[] values){
        if (values == null) {
            throw new UnsupportedOperationException();
        }
        int max = values[0];
        for (int elem: values) {
            if (max < elem) {
                max = elem;
            }
        }
        return max;
    }
}
