package com.company;

public class Engine {
    private int a;
    private int b;
    private int c;

    public Engine() {
    }

    public Engine(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
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

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public String suskaiciuotiTrikampi(int a, int b, int c) {
        if (a + b < c || a + c < b || b + c < a) return "Trikampio sudaryti negalima";
        if (a == b && b == c) return "Trikampis yra lygiakraštis";
        if (a == b) return "Trikampis yra lygiašonis";
        if ((a * a) + (b * b) == (c * c)) return "Trikampis yra statusis";
        if (a != b && b != c) return "Trikampis yra įvairiakraštis";

        return null;
    }
}
