package com.facebook.buck.cli;

public class TestNonMapped {

    void printOwing(int t1) {

        printBanner();
        int t3 = calValue(t1);

        System.out.println("The expected value would be " + t3);

    }

    int calValue(int t1){
      
      int t3 = t1 * 4;
      return t3;
    }
}