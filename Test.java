package com.facebook.buck.cli;

public class Test {

    void printOwing(int t1, int t2) {

        printBanner();
        int t3 = (t1 + t2) * 4;
        System.out.println("The expected value would be " + t3);

    }
}