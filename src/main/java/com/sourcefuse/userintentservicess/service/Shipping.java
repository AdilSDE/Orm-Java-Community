package com.sourcefuse.userintentservicess.service;

public class Shipping {
    public static int minimalNumberOfPackages(int items, int availableLargePackages, int availableSmallPackages) {
        int count = 0;
        int qut = 0;
        int rem = 0;

        int largehold = 5;
        int smallhold = 1;

        qut = items / largehold;
        rem = items % largehold;
        if (qut > availableLargePackages) {
            rem = rem + (qut - availableLargePackages) * 5;
            qut = qut - (qut - availableLargePackages);
        }
        count = count + qut;
        qut = rem / smallhold;
        count = count + qut;

        return count;
    }

    public static void main(String[] args) {
        System.out.println(minimalNumberOfPackages(17, 2, 10));
    }
}