package com.souleymane.coursJava;

import java.util.Scanner;

public class InfinitePrimality{
    public static void main(String[] args) {
        //bouvcle infinie qui demande un nombre et affiche si c'est un nombre premier ou non et demande si on veut continuer ou non 
        Scanner sc = new Scanner(System.in); //déclaration du scanner
        boolean continuer = true; //déclaration de la variable continuer
        while (continuer) { //boucle infinie tant que la variable continuer est égale à true
            System.out.println("Veuillez entrer un nombre: "); //affichage du message qui demande un nombre
            int res = sc.nextInt(); //récupération de l'entrée
            boolean isPrime = true; //déclaration de la variable isPrime qui indique si le nombre est premier ou non
            if (res < 2) { //vérification si le nombre est inférieur à 2  alors il n'est pas premier
                isPrime = false; //isPrime est égale à false
            }
            else if (res == 2){ //sinon si le nombre est égale à 2 alors il est premier
                isPrime = true;
            }
            else { //sinon
                for (int i=2; i<res; i++){ //boucle qui vérifie si le nombre est divisible par un nombre entre 2 et le nombre - 1
                    if ((res)% i == 0){ //vérification si le nombre est divisible par un nombre entre 2 et le nombre - 1
                        isPrime = false; //isPrime est égale à false
                        break;
                    }
                }
            } //fin de la boucle
            //affichage du résultat
            if (isPrime){ //vérification si le nombre est premier
                System.out.println(res +" est un nombre premier");
            } else { //sinon
                System.out.println(res + " n'est pas un nombre premier");
            }
            //demande si on veut continuer ou non
            System.out.println("Voulez-vous continuer ? (oui/non)");
            String choix = sc.next();
            if (!choix.equalsIgnoreCase("oui")) {
                continuer = false;
            }
        }
    }
}

