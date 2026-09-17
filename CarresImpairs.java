import java.util.Scanner;
import java.util.Arrays;

public class CarresImpairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Combien de valeurs :");
        int n = scanner.nextInt();
        
        if (n <= 0) {
            System.out.println("Veuillez entrer un nombre strictement positif.");
            scanner.close();
            return;
        }
        
        int[] carres = new int[n];
        
        for (int i = 0; i < n; i++) {
            int impair = 2 * i + 1; 
            carres[i] = impair * impair;
        }
        
        System.out.println("\n******* Affichage des résultats *******");
        for (int i = 0; i < n; i++) {
            int impair = 2 * i + 1;
            System.out.println(impair + " a pour carre " + carres[i]);
        }
        
        
        
        scanner.close();
    }
}