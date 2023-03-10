package com.souleymane.coursJava;

import java.util.Scanner;
//Une classe qui contient une fonction  permet de tester si un nombre est premier ou non
public class Primality {
    //une fonction qui prend en paramètre un nombre entier et retourne un boolean
    boolean isPrime(int ent){
        if (ent < 2){
            return false;
        }
        else if (ent == 2){
            return  true;
        }
        for (int i=2; i<ent; i++){
            if ((ent)% i == 0){
                return false;
            }
        }
        return true;
    }
}

//Test de la classe Primality
class TestPrimality{
    //fonction principale
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //déclaration du scanner
        Primality isPrim = new Primality(); //déclaration de l'objet isPrim de la classe Primality
        System.out.println("Veuillez entrer un nombre: "); //affichage du message qui demande un nombre
        int res = sc.nextInt(); //récupération de l'entrée

        if (isPrim.isPrime(res)){ //vérification si le nombre est premier
            System.out.println(res +" est un nombre premier");
        } else { //sinon
            System.out.println(res + " n'est pas un nombre premier");
        }
    }
}
