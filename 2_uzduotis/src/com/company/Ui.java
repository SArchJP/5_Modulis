package com.company;

import java.util.Scanner;

public class Ui {
    Scanner reader = new Scanner(System.in);
    Engine engine = new Engine();
    public void start(){
        System.out.println("2 užduotis (vandens tūris)");
        while(true){
            System.out.println("Įveskite kubo kraštinės ilgį:");
            engine.setKuboKrastine(Double.parseDouble(reader.nextLine()));

            System.out.println("Įveskite rutulio skersmenį:");
            engine.setRutulioSkersmuo(Double.parseDouble(reader.nextLine()));

            System.out.println("------------");

            System.out.println("Kubo tūris: " + engine.kuboTuris(engine.getKuboKrastine()));
            System.out.println("Rutulio tūris: " + engine.rutulioTuris(engine.getRutulioSkersmuo()));
            System.out.println("Vandens tūris: " + engine.vandensTuris());

            System.out.println("------------");
            System.out.println("Norite iseiti? y/n");

            String exit = reader.nextLine();
            if(exit.equals("y")){
                break;
            }

        }
    }
}
