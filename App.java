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

        if (b() > 10)
            System.out.println("Nice!");
        else
            System.out.println("NOOO");

        }
    }
    public void b() {
        reutrn 2 * this.a + this.b;
    }

    public void extractedFragment() {
        System.out.println("This line of code is added for some purpose");
        System.out.println("This line " + b());
        switch (b()){
            case 1:
                System.out.println("1");
                break
            case 2:
                System.out.printf("2");
                break

        }
