package com.epam.rd.autotasks;

public class DecrementingCarouselWithLimitedRun extends DecrementingCarousel{
    int anInt;
    public DecrementingCarouselWithLimitedRun(final int capacity, final int anInt) {
        super(capacity);
        this.anInt = anInt;
    }
    public CarouselRun run(){
        if (run) return null;
        run = true;
        return new CarouselRun(capacit, arr, "decL", anInt);
    }
}