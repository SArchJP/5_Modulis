package com.company;

import java.util.Scanner;

public class Ui {
    Scanner reader = new Scanner(System.in);
    Engine engine = new Engine();

    public void start() {
        System.out.println("11 užduotis (triušiai)");
        while (true) {

            System.out.println("Triušiukų vadų kiekis - ");
            System.out.print("Belgijos milžinų: ");
            engine.setBm(Integer.parseInt(reader.nextLine()));
            System.out.print("Vokietijos dėmėtųjų: ");
            engine.setVd(Integer.parseInt(reader.nextLine()));
            System.out.print("Prancūzijos avinų: ");
            engine.setPa(Integer.parseInt(reader.nextLine()));

            System.out.println("");

            System.out.println("Suaugusių triušių masė kilogramais - ");
            System.out.print("Belgijos milžinų: ");
            engine.setSvbm(Integer.parseInt(reader.nextLine()));
            System.out.print("Vokietijos dėmėtųjų: ");
            engine.setSvvd(Integer.parseInt(reader.nextLine()));
            System.out.print("Prancūzijos avinų: ");
            engine.setSvpa(Integer.parseInt(reader.nextLine()));

            System.out.println("------------------------------------");

            System.out.println("Triušiukų vados skaičiaus vidurkis " + engine.avarage(engine.getBm(), engine.getVd(), engine.getPa()));

            System.out.println("------------------------------------");

            System.out.print("Trijų mėnesių triušiuko kaina: ");
            engine.setTrkaina(Integer.parseInt(reader.nextLine()));

            System.out.println("------------------------------------");

            System.out.println(engine.pelnas(
                    engine.vadosPelnas(engine.getBm(), engine.getTrkaina()),
                    engine.vadosPelnas(engine.getVd(), engine.getTrkaina()),
                    engine.vadosPelnas(engine.getPa(), engine.getTrkaina())
            ));

            System.out.println("");

            System.out.println(engine.didziausias(
                    engine.getSvbm(),
                    engine.getSvvd(),
                    engine.getSvpa()
            ));

            System.out.println("------------------------------------");

            System.out.println("Norite iseiti?/y");
            String exit = reader.nextLine();
            if (exit.equals("y")) break;
        }

    }
}
