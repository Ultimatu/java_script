package com.souleymane.coursJava;
public class CalculDiscriminant {
    // c
    public static void main(String[] args) {
        double a = 1;
        double b = 2;
        double c = 3;
        double discriminant = 0;
        do { // boucle do while
            discriminant = (b * b) - (4 * a * c); // calcul du discriminant
            System.out.println("le discriminant   de " + a + "x² + " + b + "x + " + c + " est " + discriminant); // affichage du discriminant
            a++; // incrémentation de a
            b++; // incrémentation de b
            c++; // incrémentation de c
        } while (a < 10); // condition de sortie de la boucle
    }
   
    
}
