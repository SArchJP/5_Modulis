package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

public class EngineTest {

    Engine engine;

    @org.junit.Before
    public void setUp() throws Exception {
        engine = new Engine(310.94);
    }

    @org.junit.Test
    public void celsius_isKelvinoSkaiciuojamasTeisingai() throws Exception {
        double output = engine.celsius();
        assertEquals(37.79, output, 0.001);
    }

    @Test
    public void fahrenheit_isKelvinoSkaiciuojamasTeisingai() throws Exception {
        double output = engine.fahrenheit();
        assertEquals(100, output, 0.3);
    }

    @Test
    public void remiur_isKelvinoSkaiciuojamasTeisingai() throws Exception {
        double output = engine.reomiur();
        assertEquals(30.22, output, 0.02);
    }

}