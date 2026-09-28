# 💻 TP Java — Algorithmes sur les tableaux et matrices

> 📚 **Langage :** Java  
> 🛠️ **IDE :** Eclipse  
> 📦 **Package :** `m.ens.scolarite`

# 📌 Exercice 1 — somme des n premiers termes de la série harmonique

### 🔹 Fonction `somme`
java 
```
   public static double somme(int n){
            double s=0.0;
         for(double i=1 ; i<=n ; i++){
                 s += 1/i;
         }
         return s;
   };
```
### 🔹 Fonction principale `main`

java
```
 public static void main(String[] args) {
     System.out.println("Exercice 1");
    double s = somme(9);
    System.out.println(s);
 };
```
### ▶️ Exécution

<img width="247" height="43" alt="im11" src="https://github.com/user-attachments/assets/37e74afa-ff71-4a38-814b-c3fd6712e952" />


# 📌 Exercice 2 

### 🔹 Fonction `triangle`

java 
```
    public static void triangle (int n){
            
         for(int i=1 ; i<=n ; i++){
             for(int j = 1 ; j<=i ; j++) 
             {
            System.out.print("*");

             }
             System.out.println("\n");
         }   
   };
```
### 🔹 Fonction principale `main`
java
```
 public static void main(String[] args) {
    System.out.println("Exercice 2");
    triangle(4);
 };
```
### ▶️ Exécution

<img width="247" height="92" alt="ex1et2" src="https://github.com/user-attachments/assets/72bbe114-9bcf-45fa-a706-260dab33fc9e" />


# 📌 Exercice 3 

### 🔹 Programme principal

java
```
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
```



### ▶️ Exécution
<img width="260" height="107" alt="ex2" src="https://github.com/user-attachments/assets/2a3ac123-1fc5-4383-a963-f75c74b8ee96" />



## 👨‍💻 Auteur

**TP Java Lab 3 — ENS Marrakech**

> EN-NASSIRY Mohammed
