package com.company;

public class Engine {
    private double kuboKrastine;
    private double rutulioSkersmuo;

    public Engine(double kuboKrastine, double rutulioSkersmuo) {
        if (kuboKrastine >= 0 && rutulioSkersmuo >= 0) {
            this.kuboKrastine = kuboKrastine;
            this.rutulioSkersmuo = rutulioSkersmuo;
        } else {
            throw new IllegalArgumentException("Parametrai turi buti >= 0");
        }
    }


    public double getKuboKrastine() {
        return kuboKrastine;
    }

    public void setKuboKrastine(double kuboKrastine) {
        this.kuboKrastine = kuboKrastine;
    }

    public double getRutulioSkersmuo() {
        return rutulioSkersmuo;
    }

    public void setRutulioSkersmuo(double rutulioSkersmuo) {
        this.rutulioSkersmuo = rutulioSkersmuo;
    }

    public double kuboTuris(double kuboKrastine) {
        return Math.pow(kuboKrastine, 3);
    }

    public double rutulioTuris(double rutulioSkersmuo) {
        return (4.0 / 3.0) * Math.PI * Math.pow((rutulioSkersmuo / 2), 3);
    }

    public double vandensTuris(double v) {
        return 0;
    }

    public void start(){

    }
}
