package com.epam.rd.autotasks.triangle;

import static java.lang.Math.*;

class Triangle {
    private final Point a, b, c;
    private final double aTob, bToc, cToa;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
        // Took class "Segment" from last task
        aTob = new Segment(a, b).length();
        bToc = new Segment(b, c).length();
        cToa = new Segment(a, c).length();

        if ((aTob >= bToc + cToa) || (bToc >= aTob + cToa) || (cToa >= aTob + bToc)) {
            throw new IllegalArgumentException();
        }
    }

    public double area() {
        return sqrt(pow(pow(aTob, 2) + pow(bToc, 2) + pow(cToa, 2), 2) - 2 * (pow(aTob, 4) + pow(bToc, 4) + pow(cToa, 4))) / 4;
    }

    public Point centroid(){
        return (new Segment(a, new Segment(b, c).middle()).intersection(new Segment(b, new Segment(a, c).middle())));
    }

}
