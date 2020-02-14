package com.basics.demo;

import edu.princeton.cs.algs4.Bag;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Scanner;
import java.util.logging.XMLFormatter;

public class Stats {
    public static void main(String[] args) {
        Bag<Double> numbers = new Bag<>();
        Scanner scanner = new Scanner(System.in);
        StdOut.println("输入：");
        while (scanner.nextDouble()!=-1) {
            numbers.add(scanner.nextDouble());
        }
        int N = numbers.size();

        double sum = 0.0;
        for (double x : numbers) {
            sum += x;
        }
        double mean = sum / N;

        sum = 0.0;
        for (double x : numbers) {
            sum += (x - mean) * (x - mean);
        }
        double std = Math.sqrt(sum / (N - 1));

        StdOut.printf("Mean: %.2f\n",mean);
        StdOut.printf("Std dev: %.2f\n",std);

        for (Double number : numbers) {
            StdOut.print(number+",");
        }

    }
}
