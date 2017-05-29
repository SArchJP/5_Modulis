package com.company;

import static org.junit.Assert.*;

public class EngineTest {
    @org.junit.Test
    public void result_PA_sektorius() throws Exception {
        Engine engine = new Engine();
        assertEquals("Dainius nusipirks bilietą P arba A sektoriuje, bilietas kainuos 60 eurų", engine.result(30, 10));
    }

    @org.junit.Test
    public void result_KC_sektorius() throws Exception {
        Engine engine = new Engine();
        assertEquals("Dainius nusipirks bilietą K arba C sektoriuje, bilietas kainuos 50 eurų", engine.result(30, 7));
    }

    @org.junit.Test
    public void result_DJ_sektorius() throws Exception {
        Engine engine = new Engine();
        assertEquals("Dainius nusipirks bilietą D arba J sektoriuje, bilietas kainuos 40 eurų", engine.result(30, 4));
    }

    @org.junit.Test
    public void result_EH_sektorius() throws Exception {
        Engine engine = new Engine();
        assertEquals("Dainius nusipirks bilietą E arba H sektoriuje, bilietas kainuos 35 eurų", engine.result(30, 2));
    }

    @org.junit.Test
    public void result_FG_sektorius() throws Exception {
        Engine engine = new Engine();
        assertEquals("Dainius nusipirks bilietą F arba G sektoriuje, bilietas kainuos 30 eurų", engine.result(30, 0));
    }

    @org.junit.Test
    public void result_Negales() throws Exception {
        Engine engine = new Engine();
        assertEquals("Dainius nusipirkti bilietą NEGALĖS", engine.result(20, 2));
    }




}