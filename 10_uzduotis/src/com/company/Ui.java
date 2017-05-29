package com.company;

import java.util.Scanner;

public class Ui {
    Engine engine = new Engine();
    Scanner reader = new Scanner(System.in);

    public void start() {
        System.out.println("10 užduotis (bilietas į koncertą)");
        while (true) {
            System.out.println(engine.toString());

            System.out.println("Kiek Dainius yra sutaupes pinigų?: ");
            int savings = Integer.parseInt(reader.nextLine());

            System.out.println("Tėvų duodami pinigai smulkioms išlaidoms: ");
            int support = Integer.parseInt(reader.nextLine());

            System.out.println(engine.result(savings, support));


            System.out.println("Norite išeiti? y/n");
            String exit = reader.nextLine();
            if (exit.equals("y")) break;

        }
    }
}
