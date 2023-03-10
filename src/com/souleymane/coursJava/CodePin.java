package com.souleymane.coursJava;

import java.util.Scanner;

public class CodePin {
    public static void main(String[] args) {
        int pin = 1234;
        int essai = 0;
        int maxEssai = 4;
        int entree;
        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez entrer votre code pin: ");
        while (essai < maxEssai){
            entree = sc.nextInt();
            String code = String.valueOf(entree);
            if (code.length() != 4) {
                System.out.println("Désolé le code pin doit contenir 4 chiffres");
                continue;
            }
            if (entree == pin){
                System.out.println("Bienvenue");
                break;
            } else {
                System.out.println("Code pin incorrect, il vous reste " + (maxEssai - essai - 1) + " essai(s)");
                essai++;
            }
            if (essai == maxEssai){
                System.out.println("Vous avez atteint le nombre maximum d'essais");
            }
        }
        
    }
    
}
