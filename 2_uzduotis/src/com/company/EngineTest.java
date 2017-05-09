package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EngineTest {

    private Engine engine;

    @Before
    public void setUp() throws Exception {
        engine = new Engine(4.0D, 4.0D);
    }

    @Test
    public void kuboTuris_skaiciuojamasTeisingai() {
        double turis = engine.kuboTuris(engine.getKuboKrastine());
        assertEquals(64, turis, 0);
    }

    @Test
    public void rutulioTuris_skaiciuojamasTeisingai() {
        double turis = engine.rutulioTuris(engine.getRutulioSkersmuo());
        assertEquals(33.51, turis, 0.01);
    }

    @Test
    public void vandensTuris_skaiciuojamasTeisingai() {
        double turis = engine.vandensTuris(engine.kuboTuris(engine.getKuboKrastine()) - engine.rutulioTuris(engine.getRutulioSkersmuo()));
        assertEquals(30.49, turis, 0.01);
    }

//    @Test (expected = IllegalArgumentException.class)
//    public void valuesPositive(){
//
//    }
}