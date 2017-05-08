package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        double apelsinoSkersmuo;
        double zievelesStoris;

            System.out.println("Iveskite skersmeni: ");
            apelsinoSkersmuo = reader.nextDouble();
            System.out.println("Iveskite apelsino zieveles stori: ");
            zievelesStoris = reader.nextDouble();
            turis(apelsinoSkersmuo, zievelesStoris);
    }

    public static void turis(double a, double b) {
        double radius = (a - b) / 2;
        double turis = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
        System.out.println("Apelsino turis: " + String.format("%.2f",turis));
    }
}
