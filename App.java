package com.company;

public class Test {
    private int a;
    private int b;

    public Test(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void calc() {
        int c = 2 * this.a + this.b;

        if (c > 10)
            System.out.println("Nice!");
        else
            System.out.println("NOOO");
    }
}
