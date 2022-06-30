package com.epam.rd.autotasks;

import static com.epam.rd.autotasks.DecrementingCarousel.arr;

public class CarouselRun {
    int position = 0;
    public int next() {
        int count = 0;
        while (count < arr.length && arr[position %= arr.length] <= 0) {
            position++;
            count++;
        }
        if (count == arr.length) return -1;
        return arr[position++]--;
    }

    public boolean isFinished() {
        for (int var: arr) {
        if (var > 0) return false;
    }
        return true;

}

}
