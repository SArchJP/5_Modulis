package com.company;

import java.util.Scanner;

public class Ui {
    Scanner reader = new Scanner(System.in);
    Engine engine = new Engine();

    public void start() {
        System.out.println("7 užduotis (trikampis)");
        while (true) {
            System.out.print("Įveskite kraštinę a: ");
            engine.setA(Integer.parseInt(reader.nextLine()));
            System.out.print("Įveskite kraštinę b: ");
            engine.setB(Integer.parseInt(reader.nextLine()));
            System.out.print("Įveskite kraštinę/ižambinę c: ");
            engine.setC(Integer.parseInt(reader.nextLine()));

            System.out.println("-----------------------------------");
            System.out.println(engine.suskaiciuotiTrikampi(engine.getA(), engine.getB(), engine.getC()));
            System.out.println("-----------------------------------");

            System.out.println("Norite išeiti? y/n");
            String exit = reader.nextLine();
            if (exit.equals("y")) break;
        }
    }
}
