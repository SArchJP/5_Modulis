package com.company;

public class Engine {
    // triusiu vados;
    private int bm, vd, pa;
    //triusiu svoris
    private int svbm, svvd, svpa;
    // triusiuku vidurkis;
    private int trk;
    // Trijų mėnesių triušiukai veisimui kainuoja trkain eurų
    private int trkaina;

    public Engine() {
    }

    public Engine(int bm, int vd, int pa) {
        this.bm = bm;
        this.vd = vd;
        this.pa = pa;
    }

    public Engine(int bm, int vd, int pa, int svbm, int svvd, int svpa) {
        this.bm = bm;
        this.vd = vd;
        this.pa = pa;
        this.svbm = svbm;
        this.svvd = svvd;
        this.svpa = svpa;
    }

    public int getBm() {
        return bm;
    }

    public void setBm(int bm) {
        this.bm = bm;
    }

    public int getVd() {
        return vd;
    }

    public void setVd(int vd) {
        this.vd = vd;
    }

    public int getPa() {
        return pa;
    }

    public void setPa(int pa) {
        this.pa = pa;
    }

    public int getSvbm() {
        return svbm;
    }

    public void setSvbm(int svbm) {
        this.svbm = svbm;
    }

    public int getSvvd() {
        return svvd;
    }

    public void setSvvd(int svvd) {
        this.svvd = svvd;
    }

    public int getSvpa() {
        return svpa;
    }

    public void setSvpa(int svpa) {
        this.svpa = svpa;
    }

    public int getTrk() {
        return trk;
    }

    public void setTrk(int trk) {
        this.trk = trk;
    }

    public int getTrkaina() {
        return trkaina;
    }

    public void setTrkaina(int trkaina) {
        this.trkaina = trkaina;
    }

    public int avarage(int bm, int vd, int pa) {
        return (bm + vd + pa) / 3;
    }

    public int vadosPelnas(int vnt, int kaina) {
        return vnt * kaina;
    }

    public String pelnas(int bm, int vd, int pa) {

        if (bm > vd && bm > pa) return "Auginant Belgijos milžinus pelnas bus didžiausias";
        if (vd > bm && vd > pa) return "Auginant Vokietijos dėmėtus pelnas bus didžiausias";
        if (pa > bm && pa > vd) return "Auginant Prancūzijos avinus pelnas bus didžiausias";

        if (bm == vd && vd > pa) return "Auginant Belgijos milžinus arba Vokietijos dėmėtus pelnas bus didžiausias";
        if (bm == pa && pa > vd) return "Auginant Belgijos milžinus arba Prancūzijos avinus pelnas bus didžiausias";
        if (pa == vd && vd > bm) return "Auginant Prancūzijos avinus arba Vokietijos dėmėtus pelnas bus didžiausias";

        return "Pelnas bus vienodas";
    }

    public String didziausias(int svbm, int svvd, int svpa) {
        if (svbm > svvd && svbm > svpa) return "Didžiausi užauga Belgijos milžinai";
        if (svvd > svbm && svvd > svpa) return "Didžiausi užauga Vokietijos dėmėtieji";
        if (svpa > svbm && svpa > svvd) return "Didžiausi užauga Prancūzijos avinai";

        if (svbm == svvd && svvd > svpa) return "Didžiausi užauga Belgijos milžinai arba Vokietijos dėmėtieji";
        if (svbm == svpa && svpa > svvd) return "Didžiausi užauga Belgijos milžinai arba Prancūzijos avinai";
        if (svpa == svvd && svvd > svbm) return "Didžiausi užauga Prancūzijos avinai arba Vokietijos dėmėtieji";

        return "Visu svoris vienodas";

    }
}
