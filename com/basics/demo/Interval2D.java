package com.basics.demo;

import edu.princeton.cs.algs4.*;

public class Interval2D {
    public static void main(String[] args) {
        String[] arr = new String[5];
        arr[0] = ".2";
        arr[1] = ".5";
        arr[2] = ".5";
        arr[3] = ".6";
        arr[4] = "10000";

        double xlo = Double.parseDouble(arr[0]);
        double xhi = Double.parseDouble(arr[1]);
        double ylo = Double.parseDouble(arr[2]);
        double yhi = Double.parseDouble(arr[3]);

        int T = Integer.parseInt(arr[4]);
        Interval1D xinterval = new Interval1D(xlo, xhi);
        Interval1D yinterval = new Interval1D(ylo, yhi);
        edu.princeton.cs.algs4.Interval2D box = new edu.princeton.cs.algs4.Interval2D(xinterval, yinterval);
        box.draw();

        Counter counter = new Counter("hits");
        for (int t = 0; t < T; t++) {
            double x = Math.random();
            double y = Math.random();
            Point2D point2D = new Point2D(x, y);
            if (box.contains(point2D)) {
                counter.increment();
            } else {
                point2D.draw();
            }
        }

        StdOut.println(counter);
        StdOut.println(box.area());


    }
}
