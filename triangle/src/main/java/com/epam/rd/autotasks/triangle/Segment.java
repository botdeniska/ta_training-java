package com.epam.rd.autotasks.triangle;

import static java.lang.Math.*;

class Segment {
    private final double x1, y1, x2, y2;

    public Segment(Point start, Point end) {
        x1 = start.getX();
        y1 = start.getY();
        x2 = end.getX();
        y2 = end.getY();
        if ((x1 == x2) && (y1 == y2)) { throw new IllegalArgumentException(); }
    }

    double length() {
        return sqrt(pow((x2 - x1), 2) + pow((y2 - y1), 2));
    }

    Point middle() {
        return new Point((x1 + x2) / 2, (y1 + y2) / 2);
    }

    Point intersection(Segment another) {
        double s = ((x1 - x2) * (another.y1 - another.y2) - (y1 - y2) * (another.x1 - another.x2));
        if (s == 0) {
            return null;
        }
        double a = ((x1 - another.x1) * (another.y1 - another.y2) - (y1 - another.y1) * (another.x1 - another.x2)) / s;
        double b = ((x1 - another.x1) * (y1 - y2) - (y1 - another.y1) * (x1 - x2)) / s;
        if ((a < 0 || a > 1) || (b < 0 || b > 1)) {
            return null;
        }
        return new Point(x1 + a * (x2 - x1), y1 + a * (y2 - y1));
    }

}