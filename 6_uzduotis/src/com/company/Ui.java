package com.company;

import java.util.Scanner;

public class Ui {
    Scanner reader = new Scanner(System.in);
    Engine engine = new Engine();

    public void start() {
        System.out.println("Autobuso atvykimo laikas");
        System.out.println("Kada autobusas išvyko iš Vilniaus? ");
        System.out.print("Val.: ");
        engine.setVal(Integer.parseInt(reader.nextLine()));
        System.out.print("Min.: ");
        engine.setMin(Integer.parseInt(reader.nextLine()));

        System.out.println("Kiek laiko autobusas važiavo iš Vilniaus į Panevėžį? ");
        System.out.print("Val.: ");
        int val = Integer.parseInt(reader.nextLine());
        System.out.print("Min.: ");
        int min = Integer.parseInt(reader.nextLine());
        engine.laikas(val, min);

        System.out.println("Kelias minučių autobusas stovėjo Panevėžyje? ");
        System.out.print("Min.: ");
        min = Integer.parseInt(reader.nextLine());
        engine.laikas(0, min);

        System.out.println("Kiek laiko autobusas važiavo iš Panevėžio į Rygą? ");
        System.out.print("Val.: ");
        val = Integer.parseInt(reader.nextLine());
        System.out.print("Min.: ");
        min = Integer.parseInt(reader.nextLine());
        engine.laikas(val, min);

        System.out.println("Autobusas į Rygą atvyks: " + engine.getVal() + " val. " + engine.getMin() + " min.");

    }
}
