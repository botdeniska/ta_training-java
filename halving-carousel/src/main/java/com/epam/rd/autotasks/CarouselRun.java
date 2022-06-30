package com.epam.rd.autotasks;

public class CarouselRun {
    int i;
    int capacit;
    int n;
    String str;
    int[] arr;
    public CarouselRun(int capacity, int[] arr, String str) {
        this.arr = arr;
        this.capacit = capacity;
        i=0; n = 0;
        this.str = str;
    }

    public int next() {
        if (isFinished()) return -1;
        while (!(arr[i] > 0))   {
            i++;
            n++;
            if (n == capacit) return -1;
            if (i == capacit) {i = 0; n = 0;}
        }
        int k = arr[i];
        if (str.equals("dec"))arr[i]--;
        else arr[i] /= 2;
        i++;
        if (i == capacit) {i = 0; n = 0;}
        return k;
    }

    public boolean isFinished() {
        int m = 0;
        for (int j = 0; j < capacit; j++){
            if (arr[j] == 0) m++;
        }
        return m == capacit;
    }

}