package com.company;

import static org.junit.Assert.*;

public class EngineTest {
    @org.junit.Test
    public void plotas_SkaiciuojamasTeisingai() throws Exception {
        Engine engine = new Engine();
        assertEquals(21780, engine.plotas(15, 44, 33));
        assertEquals(64, engine.plotas(4, 4, 4));
    }

    @org.junit.Test
    public void rezultatas_AbiVienodos() throws Exception {
        Engine engine = new Engine();
        assertEquals("Abi vienodų matmenų", engine.rezultatas(4, 4, 4, 4, 4, 4));
    }

    @org.junit.Test
    public void rezultatas_AntrojiTelpaPirmoje() throws Exception {
        Engine engine = new Engine();
        assertEquals("Antroji telpa pirmojoje", engine.rezultatas(4, 5, 6, 3, 4, 5));
    }

    @org.junit.Test
    public void rezultatas_PirmojiTelpaAntroje() throws Exception {
        Engine engine = new Engine();
        assertEquals("Pirmoji telpa antroje", engine.rezultatas(4, 5, 6, 7, 7, 7));
    }

    @org.junit.Test
    public void rezultatas_Nepalyginamos() throws Exception {
        Engine engine = new Engine();
        assertEquals("Dėžutės nepalyginamos", engine.rezultatas(5, 5, 8, 7, 7, 7));
    }


}