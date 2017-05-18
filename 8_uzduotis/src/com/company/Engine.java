package com.company;

public class Engine {
    private int a1;
    private int b1;
    private int c1;

    private int a2;
    private int b2;
    private int c2;

    public Engine() {
    }

    public Engine(int a1, int b1, int c1, int a2, int b2, int c2) {
        this.a1 = a1;
        this.b1 = b1;
        this.c1 = c1;
        this.a2 = a2;
        this.b2 = b2;
        this.c2 = c2;
    }

    public int getA1() {
        return a1;
    }

    public void setA1(int a1) {
        this.a1 = a1;
    }

    public int getB1() {
        return b1;
    }

    public void setB1(int b1) {
        this.b1 = b1;
    }

    public int getC1() {
        return c1;
    }

    public void setC1(int c1) {
        this.c1 = c1;
    }

    public int getA2() {
        return a2;
    }

    public void setA2(int a2) {
        this.a2 = a2;
    }

    public int getB2() {
        return b2;
    }

    public void setB2(int b2) {
        this.b2 = b2;
    }

    public int getC2() {
        return c2;
    }

    public void setC2(int c2) {
        this.c2 = c2;
    }

    public int plotas(int a, int b, int c) {
        return a * b * c;
    }

    public String rezultatas(int a1, int b1, int c1, int a2, int b2, int c2) {
        int box1 = plotas(a1, b1, c1);
        int box2 = plotas(a1, b2, c2);
        if (a1 > 100 || b1 > 100 || c1 > 100 || a2 > 100 || b2 > 100 || c2 > 100)
            return "Klaida, metmenys neturi viršiti 100";
        if (box1 == box2) return "Abi vienodų matmenų";
        if (box1 > box2 && (a1 >= a2 && b1 >= b2 && c1 >= c2)) return "Antroji telpa pirmojoje";
        if (box1 < box2 && (a1 <= a2 && b1 <= b2 && c1 <= c2)) return "Pirmoji telpa antroje";
        return "Dėžutės nepalyginamos";
    }


}
