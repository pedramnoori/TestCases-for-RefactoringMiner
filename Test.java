package com.facebook.buck.cli;

public class Test {

    void printOwing(int t1, int t2) {

        printBanner();
        int t3 = calValue(t1, t2);

        System.out.println("The expected value is " + t3);

    }

    int calValue(int a, int b){
      
      int c = (a + b) * 4;
      System.out.println("dummy");
      return c;

    }
}