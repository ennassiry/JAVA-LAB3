package com.example.tp;

import java.util.Scanner;

public class CarresImpairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 1. Lecture de la valeur de n au clavier
        System.out.print("Combien de valeurs : ");
        int n = scanner.nextInt();
        
        // Vérification que n est strictement positif
        if (n <= 0) {
            System.out.println("Erreur : n doit être supérieur à 0.");
        } else {
            // Création d'un tableau pour stocker les carrés
            int[] carresImpairs = new int[n];
            
            // 2. Remplissage du tableau avec les carrés des n premiers nombres impairs
            // Le i-ème nombre impair (en partant de 1) est donné par la formule (2 * i + 1)
            for (int i = 0; i < n; i++) {
                int nombreImpair = 2 * i + 1;
                carresImpairs[i] = nombreImpair * nombreImpair;
            }
            
            // 3. Affichage des résultats au format demandé
            for (int i = 0; i < n; i++) {
                int nombreImpair = 2 * i + 1;
                System.out.println(nombreImpair + " a pour carre " + carresImpairs[i]);
            }
        }
        
        // Fermeture du scanner
        scanner.close();
    }
}
