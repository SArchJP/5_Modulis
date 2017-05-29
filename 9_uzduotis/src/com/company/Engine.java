package com.company;

import java.util.Scanner;

public class Engine {
    Scanner reader = new Scanner(System.in);
    private int a, b, c, d, e, f = 0;

    public void start() {

        System.out.println("9 užduotis (kelių remontas)");
        System.out.println("Duomenys (taip = 1, ne = 0)");
        while (true) {
            System.out.println("Ar galima važiuoti keliu a?");
            try {
                a = Integer.parseInt(reader.nextLine());
            } catch (NumberFormatException e) {
                throw new NumberFormatException("Duomenys (taip = 1, ne = 0)");
            }

            System.out.println("Ar galima važiuoti keliu b?");
            try {
                b = Integer.parseInt(reader.nextLine());
            } catch (NumberFormatException e) {
                throw new NumberFormatException("Duomenys (taip = 1, ne = 0)");
            }

            System.out.println("Ar galima važiuoti keliu c?");
            try {
                c = Integer.parseInt(reader.nextLine());
            } catch (NumberFormatException e) {
                throw new NumberFormatException("Duomenys (taip = 1, ne = 0)");
            }

            System.out.println("Ar galima važiuoti keliu d?");
            try {
                d = Integer.parseInt(reader.nextLine());
            } catch (NumberFormatException e) {
                throw new NumberFormatException("Duomenys (taip = 1, ne = 0)");
            }

            System.out.println("Ar galima važiuoti keliu e?");
            try {
                e = Integer.parseInt(reader.nextLine());
            } catch (NumberFormatException e) {
                throw new NumberFormatException("Duomenys (taip = 1, ne = 0)");
            }

            System.out.println("Ar galima važiuoti keliu f?");
            try {
                f = Integer.parseInt(reader.nextLine());
            } catch (NumberFormatException e) {
                throw new NumberFormatException("Duomenys (taip = 1, ne = 0)");
            }
            if (a == 1)
                System.out.println("Iš taško A į tašką B patekti galima.");
            else if (b == 1 && e == 1 || c == 1 && f == 1)
                System.out.println("Iš taško A į tašką B patekti galima.");
            else if (b == 1 && d == 1 && f == 1 || c == 1 && d == 1 && e == 1)
                System.out.println("Iš taško A į tašką B patekti galima.");
            else
                System.out.println("Iš taško A į tašką B patekti negalima.");

            System.out.println("Ar norite išeiti? y/n");
            String exit = reader.nextLine();
            if (exit.equals("y")) break;
        }
    }
}

