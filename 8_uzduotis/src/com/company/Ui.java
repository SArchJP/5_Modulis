package com.company;

import java.util.Scanner;

public class Ui {
    Scanner reader = new Scanner(System.in);
    Engine engine = new Engine();

    public void start() {
        System.out.println("8 užduotis (dvi dėžutės");
        while (true) {

            System.out.println("Duomenys/Dėžučių matmenys (a1, b1, c1, a2, b2, c2): ");
            engine.setA1(Integer.parseInt(reader.nextLine()));
            engine.setB1(Integer.parseInt(reader.nextLine()));
            engine.setC1(Integer.parseInt(reader.nextLine()));
            engine.setA2(Integer.parseInt(reader.nextLine()));
            engine.setB2(Integer.parseInt(reader.nextLine()));
            engine.setC2(Integer.parseInt(reader.nextLine()));

            System.out.println("------------------------------------");
            System.out.println(engine.rezultatas(engine.getA1(), engine.getB1(), engine.getC1(), engine.getA2(), engine.getB2(), engine.getC2()));
            System.out.println("------------------------------------");

            System.out.println("Norite išeiti? y/n");
            String exit = reader.nextLine();
            if (exit.equals("y")) break;
        }
    }

}
