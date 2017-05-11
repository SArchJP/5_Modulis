package com.company;

import java.util.Scanner;

public class Ui {
    Scanner reader = new Scanner(System.in);
    Engine engine = new Engine();

    public void start() {
        System.out.println("Temperatūrų skalės.");

        System.out.print("Įveskite temperatūrą Kelvino skalėje: ");
        engine.setKelvin(Double.parseDouble(reader.nextLine()));

        System.out.println("\t1. " + String.format("%.2f", engine.celsius()) + " Celsijaus laipsnių");
        System.out.println("\t2. " + String.format("%.2f", engine.fahrenheit()) + " Farenheito laipsnių");
        System.out.println("\t3. " + String.format("%.2f", engine.reomiur()) + " Reomiūro laipsnių");

        System.out.println("Programa darbą baigė. Ačiū, kad skaičiavote.");

    }

}
