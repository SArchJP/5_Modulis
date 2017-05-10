package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

public class EngineTest {


    Engine engine;

    @org.junit.Before
    public void setUp() throws Exception {
        engine = new Engine(10, 1);
    }

    @org.junit.Test
    public void radius_skaiciuojamasTeisingai() throws Exception {
        double radius = engine.radius(engine.getApelsinoSkersmuo(), engine.getZievelesStoris());
        assertEquals(4.5, radius, 0);
    }

    @Test
    public void turis_skaiciuojamasGerai() throws Exception {
        double volume = engine.turis();
        assertEquals(381.704,volume,0.01);
    }

}