package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EngineTest {

    private Engine revenueWeight;

    @Before
    public void setUp() {

        revenueWeight = new Engine(3, 5, 5, 8, 7, 6);

    }

    @Test
    public void avarage() throws Exception {
        assertEquals(4, revenueWeight.avarage(revenueWeight.getBm(), revenueWeight.getVd(), revenueWeight.getPa()));
    }

    @Test
    public void revenue() throws Exception {
        revenueWeight.setTrkaina(30);
        assertEquals(90, revenueWeight.vadosPelnas(revenueWeight.getBm(), revenueWeight.getTrkaina()));
        assertEquals(150, revenueWeight.vadosPelnas(revenueWeight.getPa(), revenueWeight.getTrkaina()));
    }

    @Test
    public void topRevenue() throws Exception {
        revenueWeight.setTrkaina(30);
        assertEquals("Auginant Prancūzijos avinus arba Vokietijos dėmėtus pelnas bus didžiausias",
                revenueWeight.pelnas(
                        revenueWeight.vadosPelnas(revenueWeight.getBm(), revenueWeight.getTrkaina()),
                        revenueWeight.vadosPelnas(revenueWeight.getVd(), revenueWeight.getTrkaina()),
                        revenueWeight.vadosPelnas(revenueWeight.getPa(), revenueWeight.getTrkaina())));

        revenueWeight.setPa(6);
        assertEquals("Auginant Prancūzijos avinus pelnas bus didžiausias",
                revenueWeight.pelnas(
                        revenueWeight.vadosPelnas(revenueWeight.getBm(), revenueWeight.getTrkaina()),
                        revenueWeight.vadosPelnas(revenueWeight.getVd(), revenueWeight.getTrkaina()),
                        revenueWeight.vadosPelnas(revenueWeight.getPa(), revenueWeight.getTrkaina())));

        revenueWeight.setPa(5);
        revenueWeight.setBm(5);
        revenueWeight.setVd(5);
        assertEquals("Pelnas bus vienodas",
                revenueWeight.pelnas(
                        revenueWeight.vadosPelnas(revenueWeight.getBm(), revenueWeight.getTrkaina()),
                        revenueWeight.vadosPelnas(revenueWeight.getVd(), revenueWeight.getTrkaina()),
                        revenueWeight.vadosPelnas(revenueWeight.getPa(), revenueWeight.getTrkaina())));
    }

    @Test
    public void didziausiasTriusis() throws Exception {
        assertEquals("Didžiausi užauga Belgijos milžinai", revenueWeight.didziausias(revenueWeight.getSvbm(), revenueWeight.getSvvd(), revenueWeight.getSvpa()));

        revenueWeight.setSvvd(8);
        assertEquals("Didžiausi užauga Belgijos milžinai arba Vokietijos dėmėtieji", revenueWeight.didziausias(revenueWeight.getSvbm(), revenueWeight.getSvvd(), revenueWeight.getSvpa()));

        revenueWeight.setSvpa(8);
        assertEquals("Visu svoris vienodas", revenueWeight.didziausias(revenueWeight.getSvbm(), revenueWeight.getSvvd(), revenueWeight.getSvpa()));

    }


}