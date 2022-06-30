package com.epam.rd.autotasks;

public class DecrementingCarousel {
    Boolean run = false;
    int[] arr;
    int a, capacit;
    public DecrementingCarousel(int capacity) {
        arr = new int[capacity];
        a = 0; capacit = capacity;

    }

    public boolean addElement(int element){
        if (run || element <= 0 || a == capacit) return false;
        arr[a] = element;
        a++;
        return true;
    }

    public CarouselRun run(){
        if (run) return null;
        run = true;
        return new CarouselRun(capacit, arr, "dec");
    }
}