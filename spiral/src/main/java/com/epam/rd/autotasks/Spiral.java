package com.epam.rd.autotasks;

class Spiral {
    static int[][] spiral(int rows, int columns) {
        int[][] res = new int[rows][columns];

        int num = 1;
        int maxValue = rows * columns;

        int rmin = 0, rmax = rows - 1;
        int cmin = 0, cmax = columns - 1;

        while (num <= maxValue) {
            for (int i = cmin; num <= maxValue && i <= cmax; i++) {
                res[rmin][i] = num++;
            }
            rmin++;
            for (int i = rmin; num <= maxValue && i <= rmax; i++) {
                res[i][cmax] = num++;
            }
            cmax--;
            for (int i = cmax; num <= maxValue && i >= cmin; i--) {
                res[rmax][i] = num++;
            }
            rmax--;
            for (int i = rmax; num <= maxValue && i >= rmin; i--) {
                res[i][cmin] = num++;
            }
            cmin++;
        }

        return res;
    }
}
