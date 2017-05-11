package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

public class EngineTest {

    Engine engine;

    @org.junit.Before
    public void setUp() throws Exception {
        engine = new Engine(1, 15);
    }

    @org.junit.Test
    public void saldainiuGalimaNupirkti() throws Exception {
        int test = engine.saldainiuGalimaNupirkti();
        assertEquals(15, test, 0);
    }

    @Test
    public void kuponuGauta() throws Exception {
        int test = engine.saldainiuGalimaGautiUzKuponus();
        assertEquals(5, test, 0);
    }

    @Test
    public void saldainiuTotal() throws Exception {
        int total = engine.saldainiuTotal();
        assertEquals(18, total, 0);
    }

}