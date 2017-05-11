package com.company;

public class Engine {
    final static double a = 273.15;
    final static double b = 0.8;

    private double kelvin;

    public Engine() {
    }

    public Engine(double kelvin) {
        this.kelvin = kelvin;
    }

    public double getKelvin() {
        return kelvin;
    }

    public void setKelvin(double kelvin) {
        this.kelvin = kelvin;
    }

    public double celsius() {
        return getKelvin() - a;
    }

    public double fahrenheit() {
        return 1.8 * (getKelvin() - 273) + 32;
    }

    public double reomiur() {
        return b * celsius();
    }
}
