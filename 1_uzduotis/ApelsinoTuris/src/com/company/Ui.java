package com.company;

import java.util.Scanner;

public class Ui {
    Scanner reader = new Scanner(System.in);
    Engine engine = new Engine();

    public void start() {
        System.out.println("1 užduotis (apelsino tūris)");
        while (true) {


            System.out.println("įveskite apelsino skersmenį:");
            engine.setApelsinoSkersmuo(Double.parseDouble(reader.nextLine()));

            System.out.println("įveskite apelsino žievelės storį:");
            engine.setZievelesStoris(Double.parseDouble(reader.nextLine()));

            System.out.println("------------");
            System.out.println("Apelsino turis: " + String.format("%.2f",engine.turis()));
            System.out.println("------------");


            System.out.println("Norite iseiti? y/n");
            String exit = reader.nextLine();
            if (exit.equals("y")) {
                break;
            }
        }
    }


}
