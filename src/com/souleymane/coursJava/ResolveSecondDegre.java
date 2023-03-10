package com.souleymane.coursJava;
import java.util.Scanner;
public class ResolveSecondDegre {
    public static void main(String[] args) {

        //recuperer les valeurs de a, b et c
        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez entrer la valeur de a: ");
        double a = sc.nextDouble();
        System.out.println("Veuillez entrer la valeur de b: ");
        double b = sc.nextDouble();
        System.out.println("Veuillez entrer la valeur de c: ");
        double c = sc.nextDouble();

        //faire la fonction math
        String fonction = a + "x² + " + b + "x + " + c + " = 0";
        //calculer le discriminant
        double delta = (b * b) - (4 * a * c);

        if (delta > 0) {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("\nLa fonction " + fonction + " a deux solutions qui sont:");
            System.out.println("x1 = " + x1 + "\nx2 = " + x2);
        } else if (delta == 0) {
            double x0 = -b / (2 * a);
            System.out.println("\nLa fonction " + fonction + " a une solution qui est:");
            System.out.println("x0 = " + x0);
        } else {
            System.out.println("\nLa fonction " + fonction + " n'a pas de solution");
            System.out.println("Pas de solution");
        }

    }
}
