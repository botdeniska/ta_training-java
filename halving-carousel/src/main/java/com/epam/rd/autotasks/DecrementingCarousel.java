package com.epam.rd.autotasks;

public class DecrementingCarousel {
    Boolean run = false;
    int[] arr;
    int i;
    int capacit;
    public DecrementingCarousel(int capacity) {
        arr = new int[capacity];
        i=0; capacit = capacity;

    }

    public boolean addElement(int element){
        if (run || element <= 0 || i == capacit) return false;
        arr[i] = element;
        i++;
        return true;
    }

    public CarouselRun run(){
        if (run) return null;
        run = true;
        return new CarouselRun(capacit, arr, "dec");
    }
}