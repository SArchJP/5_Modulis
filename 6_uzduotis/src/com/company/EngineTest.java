package com.company;

import static org.junit.Assert.*;

public class EngineTest {
    Engine engine;
    @org.junit.Before
    public void setUp() throws Exception {
        engine = new Engine(23,55);
    }

    @org.junit.Test
    public void laikas_valSkaiciuojamosTeisingai() throws Exception {
        engine.laikas(3,5);
        assertEquals(3, engine.getVal());
    }

    @org.junit.Test
    public void laikas_minSkaiciuojamosTeisingai() throws Exception {
        engine.laikas(3,5);
        assertEquals(0, engine.getMin());
    }

}