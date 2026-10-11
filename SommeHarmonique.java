package com.example.tp;

import java.util.Scanner;

public class SommeHarmonique {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Demander à l'utilisateur de saisir la valeur de n
        System.out.print("Entrez la valeur de n (entier strictement positif) : ");
        int n = scanner.nextInt();
        
        // Vérification de la validité de n
        if (n <= 0) {
            System.out.println("Erreur : n doit être supérieur à 0.");
        } else {
            double somme = 0.0;
            
            // Boucle pour calculer la somme des n premiers termes
            for (int i = 1; i <= n; i++) {
                // On utilise 1.0 / i pour forcer une division en virgule flottante (double)
                somme += 1.0 / i;
            }
            
            // Affichage du résultat final
            System.out.println("La somme des " + n + " premiers termes de la série harmonique est : " + somme);
        }
        
        // Fermeture du scanner pour éviter les fuites de ressources
        scanner.close();
    }
}
