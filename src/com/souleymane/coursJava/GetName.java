package com.souleymane.coursJava;
import java.util.Scanner;
public class GetName {
    public static void main(String[] args) {
        String name = "souleymane";
        do {
            System.out.println("Entrez votre nom");
            Scanner scanner = new Scanner(System.in);
            name = scanner.nextLine();

        } while (!name.equals("souleymane"));
        System.out.println("Bienvenue " + name);
    }
}
