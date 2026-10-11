package com.example.tp;

public class TableauxDoubleUtils {

    /**
     * Affiche les valeurs du tableau t, à raison d'une ligne d'écran pour une ligne du tableau,
     * sans utiliser la classe Arrays.
     */
    public static void affiche(double[][] t) {
        if (t == null) {
            System.out.println("Le tableau est null.");
            return;
        }
        for (int i = 0; i < t.length; i++) {
            if (t[i] == null) {
                System.out.println("null");
            } else {
                System.out.print("[");
                for (int j = 0; j < t[i].length; j++) {
                    System.out.print(t[i][j]);
                    if (j < t[i].length - 1) {
                        System.out.print(", ");
                    }
                }
                System.out.println("]");
            }
        }
    }

    /**
     * Teste si le tableau t est régulier (toutes les lignes ont la même taille).
     */
    public static boolean regulier(double[][] t) {
        if (t == null || t.length == 0) {
            return true;
        }
        
        if (t[0] == null) {
            return false;
        }
        
        int tailleReference = t[0].length;
        
        for (int i = 1; i < t.length; i++) {
            if (t[i] == null || t[i].length != tailleReference) {
                return false;
            }
        }
        return true;
    }

    /**
     * Renvoie un tableau unidimensionnel contenant les sommes des différentes lignes de t.
     */
    public static double[] sommeLignes(double[][] t) {
        if (t == null) {
            return null;
        }
        
        double[] sommes = new double[t.length];
        
        for (int i = 0; i < t.length; i++) {
            if (t[i] != null) {
                double sommeLigne = 0.0;
                for (int j = 0; j < t[i].length; j++) {
                    sommeLigne += t[i][j];
                }
                sommes[i] = sommeLigne;
            } else {
                sommes[i] = 0.0;
            }
        }
        
        return sommes;
    }

    /**
     * Vérifie que t1 et t2 sont réguliers et de mêmes dimensions et renvoie leur somme ; sinon renvoie null.
     */
    public static double[][] somme(double[][] t1, double[][] t2) {
        if (t1 == null || t2 == null) {
            return null;
        }
        
        if (!regulier(t1) || !regulier(t2)) {
            return null;
        }
        
        if (t1.length != t2.length) {
            return null;
        }
        
        if (t1.length == 0) {
            return new double[0][0];
        }
        
        int nbLignes = t1.length;
        int nbColonnes = t1[0].length;
        
        if (t2[0].length != nbColonnes) {
            return null;
        }
        
        double[][] resultat = new double[nbLignes][nbColonnes];
        for (int i = 0; i < nbLignes; i++) {
            for (int j = 0; j < nbColonnes; j++) {
                resultat[i][j] = t1[i][j] + t2[i][j];
            }
        }
        
        return resultat;
    }
}
