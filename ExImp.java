package com.facebook.buck.cli;

public class Test {

    void printOwing(int t1) {


        t1 = calValue(t1);

        System.out.println("The expected value would be " + t3);

    }

    int calValue(int t1){

        t1 = t1 * 4;
        printBanner(t1);
        return t1;
    }

    int printBanner(int t1) {

        if (t1 > 10)
            t1 = doA(t1);
        else
            t1 =  doB(t1);

        return t1;
    }
}