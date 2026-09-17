

public class Main {
   public static double somme(int n){
            double s=0.0;
         for(int i=1 ; i<=n ; i++){
                 s += 1.0/i;
         }
         return s;
   };
    public static void triangle (int n){
            
         for(int i=1 ; i<=n ; i++){
             for(int j = 1 ; j<=i ; j++) 
             {
            System.out.print("*");

             }
             System.out.println("\n");

         }
         
   };

 public static void main(String[] args) {
    somme(9);
  triangle(4);


 };
 
}
