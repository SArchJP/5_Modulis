package com.company;

import java.util.Scanner;

public class Ui {
    Scanner reader = new Scanner(System.in);
    Engine engine = new Engine();

    public void start() {
        System.out.println("5 užduotis (saldainiai)");
        while (true) {
            System.out.print("Įveskite saldainių maišelio kainą: ");
            engine.setPrice(Integer.parseInt(reader.nextLine()));

            System.out.print("Įveskite pinigų sumą skirtą saldainiams pirkti: ");
            engine.setMoney(Integer.parseInt(reader.nextLine()));

            System.out.println("Daugiausia galima gauti saldainių maišelių už " + engine.getMoney() + " eurų: " + engine.saldainiuTotal());

            System.out.println("Norite iseiti y/n");
            String exit = reader.nextLine();
            if (exit.equals("y")) {
                break;
            }
        }
    }
}
