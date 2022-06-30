package com.epam.rd.autotasks;

public class CarouselRun {
    int[] arr, arr1;
    int i, capacit, n, anInt;
    String str;
    public CarouselRun(int capacity, int[] arr, String str) {
        this.arr = arr;
        this.capacit = capacity;
        i= 0 ; n = 0;
        arr1 = new int[arr.length];
        this.str = str;
    }

    public CarouselRun(int capacity, int[] arr, String str, int anInt) {
        this.arr = arr;
        this.capacit = capacity;
        i=0; n = 0;
        arr1 = new int[arr.length];
        this.str = str;
        this.anInt = anInt;
    }

    public int next() {
        if (isFinished()) return -1;
        if (str.equals("decL") && anInt == 0) return -1;
        while (!(arr[i] > 0))   {
            i++;
            n++;
            if (n == capacit) return -1;
            if (i == capacit) {i = 0; n = 0;}
        }
        int k = arr[i];
        if (str.equals("dec")) arr[i]--;
        else {
            arr[i]--; anInt--;}
        i++;
        if (i == capacit) {i = 0; n = 0;}
        return k;

    }

    public boolean isFinished() {
        if (str.equals("decL") && anInt == 0) return true;
        int r = 0;
        for (int j = 0; j < capacit; j++){
            if (arr[j] == 0) r++;
        }
        return r == capacit;
    }

}