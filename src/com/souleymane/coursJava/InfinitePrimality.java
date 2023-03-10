package com.souleymane.coursJava;

import java.util.Scanner;

public class InfinitePrimality{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continuer = true;
        while (continuer) {
            System.out.println("Veuillez entrer un nombre: ");
            int res = sc.nextInt();
            boolean isPrime = true;
            if (res < 2) {
                isPrime = false;
            }
            else if (res == 2){
                isPrime = true;
            }
            else {
                for (int i=2; i<res; i++){
                    if ((res)% i == 0){
                        isPrime = false;
                        break;
                    }
                }
            }
            if (isPrime){
                System.out.println(res +" est un nombre premier");
            } else {
                System.out.println(res + " n'est pas un nombre premier");
            }
            System.out.println("Voulez-vous continuer ? (oui/non)");
            String choix = sc.next();
            if (!choix.equalsIgnoreCase("oui")) {
                continuer = false;
            }
        }
    }
}

