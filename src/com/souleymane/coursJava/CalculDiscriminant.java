package com.souleymane.coursJava;
public class CalculDiscriminant {
    // recuperer une fonction math et calculer son discriminant avec do while
    public static void main(String[] args) {
        double a = 1;
        double b = 2;
        double c = 3;
        double discriminant = 0;
        do {
            discriminant = (b * b) - (4 * a * c);
            System.out.println("le discriminant   de " + a + "x² + " + b + "x + " + c + " est " + discriminant);
            a++;
            b++;
            c++;
        } while (a < 10);
    }
    //ecrit  qui compare deux chaines de caracteres en java sans utiliser la methode equals
    
}
