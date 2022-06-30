package com.epam.rd.autotasks;

public class CarouselRun {
    int[] arr, arr1;
    int i, capacit, n;
    String str;
    public CarouselRun(int capacity, int[] arr, String str) {
        this.arr = arr;
        this.capacit = capacity;
        i=0; n = 0;
        arr1 = new int[arr.length];
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
        else {arr1[i]++; arr[i] -= arr1[i]; if(arr[i]<0) arr[i] = 0;}
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
