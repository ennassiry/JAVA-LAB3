import java.util.Scanner;

public class RotationMatrice {

     public static void rotate90ClockwiseInPlace(int[][] A) {
        int n = A.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = A[i][j];
                A[i][j] = A[j][i];
                A[j][i] = temp;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {
                int temp = A[i][j];
                A[i][j] = A[i][n - 1 - j];
                A[i][n - 1 - j] = temp;
            }
        }
    }

public static void afficherMatrice(int[][] A) {
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                System.out.print(A[i][j] + (j == A[i].length - 1 ? "" : " "));
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      System.out.println("Entrer la taille de matrice (N*N)");
        int n = scanner.nextInt();

        int[][] matrice = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrice[i][j] = scanner.nextInt();
            }
        }
        
        scanner.close();
          afficherMatrice(matrice);
      System.out.println("**************************");

        rotate90ClockwiseInPlace(matrice);

        afficherMatrice(matrice);
        
       
    }

   

    
}