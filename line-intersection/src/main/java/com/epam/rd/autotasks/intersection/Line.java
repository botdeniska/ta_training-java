package com.epam.rd.autotasks.intersection;

public class Line {
    int k, b;
    public Line(int k, int b) {
        this.k = k;
        this.b = b;
    }

    public Point intersection(Line other) {
        int x, y;
        if (k == other.k) {return null;}
        x = (other.b - b) / (k - other.k);
        y = k * x + b;
        return new Point(x, y);
    }

}
