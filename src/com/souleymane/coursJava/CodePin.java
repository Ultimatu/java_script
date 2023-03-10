package com.souleymane.coursJava;

import java.util.Scanner;

public class CodePin {
    public static void main(String[] args) {

        int pin = 1234; //déclaration du pin
        int essai = 0; //déclaration du nombre d'essai
        int maxEssai = 4; //déclaration du nombre maximum d'essai
        int entree; //déclaration de l'entrée
        Scanner sc = new Scanner(System.in); //déclaration du scanner
        System.out.println("Veuillez entrer votre code pin: "); //affichage du message
        while (essai < maxEssai){ //boucle tant que le nombre d'essai est inférieur au nombre maximum d'essai
            entree = sc.nextInt(); //récupération de l'entrée
            String code = String.valueOf(entree); //conversion de l'entrée en string
            if (code.length() != 4) { //vérification de la longueur de l'entrée
                System.out.println("Désolé le code pin doit contenir 4 chiffres"); //affichage du message
                continue; //retour au début de la boucle
            }
            if (entree == pin){ //vérification si l'entrée est égale au pin
                System.out.println("Bienvenue"); //affichage du message de bienvenue
                break; //sortie de la boucle
            } else { //sinon
                System.out.println("Code pin incorrect, il vous reste " + (maxEssai - essai - 1) + " essai(s)"); //affichage du message d'erreur
                essai++; //incrémentation du nombre d'essai
            }
            if (essai == maxEssai){ //vérification si le nombre d'essai est égal au nombre maximum d'essai
                System.out.println("Vous avez atteint le nombre maximum d'essais"); //affichage du message qui indique que le nombre maximum d'essai est atteint et que la carte est bloquée
            }
        }
        
    }
    
}
