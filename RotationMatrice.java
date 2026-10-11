package com.example.tp;

import java.util.Scanner;

public class RotationMatrice {

    /**
     * Fait pivoter la matrice carrée de 90° dans le sens horaire en place.
     * Méthode : Transposition (i < j) puis inversion de chaque ligne.
     */
    public static void rotate90ClockwiseInPlace(int[][] A) {
        int n = A.length;

        // Étape 1 : Transposition de la matrice (échanger A[i][j] et A[j][i] pour i < j)
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = A[i][j];
                A[i][j] = A[j][i];
                A[j][i] = temp;
            }
        }

        // Étape 2 : Renverser chaque ligne (échanger les éléments symétriques par rapport au milieu de la ligne)
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {
                int temp = A[i][j];
                A[i][j] = A[i][n - 1 - j];
                A[i][n - 1 - j] = temp;
            }
        }
    }

    /**
     * Bonus : Fait pivoter la matrice de 90° dans le sens anti-horaire en place.
     * Méthode : Transposition puis inversion de chaque colonne (ou inversion de ligne puis transposition).
     */
    public static void rotate90CounterClockwiseInPlace(int[][] A) {
        int n = A.length;

        // Étape 1 : Transposition
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = A[i][j];
                A[i][j] = A[j][i];
                A[j][i] = temp;
            }
        }

        // Étape 2 : Renverser chaque colonne (échanger A[i][j] et A[n - 1 - i][j])
        for (int i = 0; i < n / 2; i++) {
            for (int j = 0; j < n; j++) {
                int temp = A[i][j];
                A[i][j] = A[n - 1 - i][j];
                A[n - 1 - i][j] = temp;
            }
        }
    }

    /**
     * Bonus : Fait pivoter la matrice de 180° en place.
     */
    public static void rotate180InPlace(int[][] A) {
        int n = A.length;
        // Échanger chaque élément A[i][j] avec son symétrique central A[n - 1 - i][n - 1 - j]
        for (int i = 0; i < n; i++) {
            // Pour la dernière ligne si n est impair, on s'arrête à la moitié de la ligne
            int limiteCol = (i == n - 1 - i) ? n / 2 : n;
            for (int j = 0; j < limiteCol; j++) {
                if (i > n - 1 - i || (i == n - 1 - i && j >= n / 2)) {
                    break;
                }
                int temp = A[i][j];
                A[i][j] = A[n - 1 - i][n - 1 - j];
                A[n - 1 - i][n - 1 - j] = temp;
            }
        }
    }

    /**
     * Affiche la matrice, une ligne par rangée, éléments séparés par un espace.
     */
    public static void afficher(int[][] A) {
        int n = A.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(A[i][j] + (j < n - 1 ? " " : ""));
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Lecture de N
        if (!scanner.hasNextInt()) return;
        int n = scanner.nextInt();

        // Vérification de la contrainte N ∈ [2, 200]
        if (n < 2 || n > 200) {
            System.out.println("Erreur : N doit être compris entre 2 et 200.");
            scanner.close();
            return;
        }

        // 2. Lecture de la matrice N x N
        int[][] matrice = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrice[i][j] = scanner.nextInt();
            }
        }
        scanner.close();

        // 3. Rotation à 90° dans le sens horaire en place
        rotate90ClockwiseInPlace(matrice);

        // 4. Affichage de la matrice transformée
        afficher(matrice);
    }
}
