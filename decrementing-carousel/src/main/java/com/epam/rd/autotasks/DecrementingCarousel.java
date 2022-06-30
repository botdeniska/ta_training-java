package com.epam.rd.autotasks;

public class DecrementingCarousel {
    static int capacity;
    int counter = 0;
    static int [] arr ;
    private int checkCarouselRun = 0;
    public DecrementingCarousel(int capacity) {
        DecrementingCarousel.capacity = capacity;
        arr = new int[capacity];

    }

    public boolean addElement(int element){
        if (checkCarouselRun == 1) { return false; }
        if (counter < capacity && element > 0) {
            arr[counter] = element;
            counter++;
            return true;
        }
        return false;
    }

    public CarouselRun run(){
        if (checkCarouselRun == 1) { return null; }
        checkCarouselRun = 1;
        return new CarouselRun();
    }
}
