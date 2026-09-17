public class Tableau {

   
    public static void affiche(double[][] t) {
        if (t == null) {
            System.out.println("Le tableau est null.");
            return;
        }
        for (int i = 0; i < t.length; i++) {
            if (t[i] != null) {
                for (int j = 0; j < t[i].length; j++) {
                    System.out.print(t[i][j] + "\t"); 
                }
            }
            System.out.print("\n");
        }
    }

  
    public static boolean regulier(double[][] t) {
       
        
        int tailleRef = t[0].length ;
        
        for (int i = 1; i < t.length; i++) {
            int tailleActuelle = t[i].length ;
            if (tailleActuelle != tailleRef) {
                return false; 
            }
        }
        return true;
    }

    
    
    public static double[] sommeLignes(double[][] t) {
        if (t == null) {
            return null;
        }
        
        double[] sommes = new double[t.length];
        
        for (int i = 0; i < t.length; i++) {
            double sommeCourante = 0;
            if (t[i] != null) {
                for (int j = 0; j < t[i].length; j++) {
                    sommeCourante += t[i][j];
                }
            }
            sommes[i] = sommeCourante;
        }
        
        return sommes;
    }

   
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
        
        
        
        int nbT1 = t1[0].length ;
        int nbT2 = t2[0].length;
        
        if (nbT1 != nbT2) {
            return null;
        }
        
        double[][] resultat = new double[t1.length][nbT1];
        
        for (int i = 0; i < t1.length; i++) {
            for (int j = 0; j < nbT1; j++) {
                resultat[i][j] = t1[i][j] + t2[i][j];
            }
        }
        
        return resultat;
    }

   
    public static void main(String[] args) {
        double[][] t1 = {
            {1.5, 2.0, 3.5},
            {4.0, 5.5, 6.0}
        };
        
        double[][] t2 = {
            {1.0, 1.0, 1.0},
            {2.0, 2.0, 2.0}
        };
        
        double[][] t3 = {
            {1.0, 2.0},
            {3.0, 4.0, 5.0}
        };

        System.out.println("--- Affichage d'un tableau ---");
        affiche(t1);

        System.out.println("\n--- Test de régularité ---");
        System.out.println("t1 est régulier ? " + regulier(t1));
        System.out.println("t3 est régulier ? " + regulier(t3));

        System.out.println("\n--- Somme des lignes ---");
        double[] sommes = sommeLignes(t3);
        System.out.println("Ligne 0 : " + sommes[0]);
        System.out.println("Ligne 1 : " + sommes[1]);

        System.out.println("\n--- Somme de deux tableaux ---");
        double[][] total = somme(t1, t2);
        if (total != null) {
            affiche(total);
        } else {
            System.out.println("Erreur : Les tableaux ne sont pas compatibles pour l'addition.");
        }
        
        System.out.println("\n--- Somme avec un tableau irrégulier ---");
        double[][] totalEchec = somme(t1, t3);
        if (totalEchec == null) {
            System.out.println("Opération annulée car l'un des tableaux est irrégulier ou les dimensions sont différentes.");
        }
    }
}