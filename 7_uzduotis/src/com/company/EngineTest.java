package com.company;

import static org.junit.Assert.*;

public class EngineTest {
    @org.junit.Test
    public void suskaiciuotiTrikampi_Lygiakrastis() throws Exception {
        Engine engine = new Engine();
        assertEquals("Trikampis yra lygiakraštis", engine.suskaiciuotiTrikampi(4, 4, 4));
    }

    @org.junit.Test
    public void suskaiciuotiTrikampi_Lygiasonis() throws Exception {
        Engine engine = new Engine();
        assertEquals("Trikampis yra lygiašonis", engine.suskaiciuotiTrikampi(4, 4, 6));
    }

    @org.junit.Test
    public void suskaiciuotiTrikampi_Ivairiakrastis() throws Exception {
        Engine engine = new Engine();
        assertEquals("Trikampis yra įvairiakraštis", engine.suskaiciuotiTrikampi(4, 5, 6));
    }

    @org.junit.Test
    public void suskaiciuotiTrikampi_Statusis() throws Exception {
        Engine engine = new Engine();
        assertEquals("Trikampis yra statusis", engine.suskaiciuotiTrikampi(3, 4, 5));
    }

    @org.junit.Test
    public void suskaiciuotiTrikampi_TrikampioSudarytiNegalima() throws Exception {
        Engine engine = new Engine();
        assertEquals("Trikampio sudaryti negalima", engine.suskaiciuotiTrikampi(1, 7, 4));
    }


}