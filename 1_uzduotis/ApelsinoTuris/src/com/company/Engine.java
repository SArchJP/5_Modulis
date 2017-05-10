package com.company;

public class Engine {
    private double apelsinoSkersmuo;
    private double zievelesStoris;

    public Engine() {
    }

    public Engine(double apelsinoSkersmuo, double zievelesStoris) {
        this.apelsinoSkersmuo = apelsinoSkersmuo;
        this.zievelesStoris = zievelesStoris;
    }

    public double getApelsinoSkersmuo() {
        return apelsinoSkersmuo;
    }

    public void setApelsinoSkersmuo(double apelsinoSkersmuo) {
        this.apelsinoSkersmuo = apelsinoSkersmuo;
    }

    public double getZievelesStoris() {
        return zievelesStoris;
    }

    public void setZievelesStoris(double zievelesStoris) {
        this.zievelesStoris = zievelesStoris;
    }

    public double radius(double apelsinoSkersmuo, double zievelesStoris) {
        return (apelsinoSkersmuo - zievelesStoris) / 2;
    }

    public double turis() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius(getApelsinoSkersmuo(), getZievelesStoris()), 3);
    }

//    public static void turis(double a, double b) {
//        double radius = (a - b) / 2;
//        double turis = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
//        System.out.println("Apelsino turis: " + String.format("%.2f",turis));
//    }
}
