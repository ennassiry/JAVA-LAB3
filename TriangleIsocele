package com.example.tp;

import java.util.Scanner;

public class TriangleIsocele {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Demander à l'utilisateur de saisir la hauteur du triangle
        System.out.print("Entrez la hauteur du triangle (nombre de lignes) : ");
        int n = scanner.nextInt();
        
        // Vérification de la validité de la hauteur
        if (n <= 0) {
            System.out.println("Erreur : la hauteur doit être supérieure à 0.");
        } else {
            // Boucle externe pour parcourir chaque ligne de 1 à n
            for (int i = 1; i <= n; i++) {
                
                // 1. Afficher les espaces de décalage pour aligner la dernière ligne à gauche
                // La ligne i possède (n - i) espaces avant les étoiles
                for (int j = 0; j < (n - i); j++) {
                    System.out.print(" ");
                }
                
                // 2. Afficher les étoiles pour la ligne courante
                // Le nombre d'étoiles sur la ligne i est donné par la formule (2 * i - 1)
                for (int k = 0; k < (2 * i - 1); k++) {
                    System.out.print("*");
                }
                
                // Passer à la ligne suivante
                System.out.println();
            }
        }
        
        scanner.close();
    }
}
