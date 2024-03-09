package TP3;
import java.util.Arrays;
import java.util.Scanner;
public class EX07 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Étape 1 : Demander à l'utilisateur de saisir la taille du tableau
            System.out.print("Entrez la taille du tableau : ");
            int taille = scanner.nextInt();

            // Étape 2 : Créer un objet tableau avec la taille entrée par l'utilisateur
            int[] tableau = new int[taille];

            // Étape 3 : Demander à l'utilisateur de remplir le tableau
            System.out.println("Veuillez saisir les valeurs pour remplir le tableau :");
            for (int i = 0; i < tableau.length; i++) {
                System.out.print("Élément " + i + " : ");
                tableau[i] = scanner.nextInt();
            }

            // Étape 4 : Calculer la somme des éléments saisis
            int somme = 0;
            for (int element : tableau) {
                somme += element;
            }

            // Étape 5 : Calculer la moyenne des éléments
            double moyenne = (double) somme / taille;

            // Étape 6 : Copier le tableau dans un deuxième tableau T2 et l'afficher
            int[] tableauCopie = Arrays.copyOf(tableau, tableau.length);
            System.out.println("Tableau initial :");
            for (int element : tableau) {
                System.out.print(element + " ");
            }
            System.out.println();

            // Étape 7 : Classer les éléments du tableau dans un ordre croissant
            Arrays.sort(tableau);

            // Afficher le tableau trié
            System.out.println("Tableau trié :");
            for (int element : tableau) {
                System.out.print(element + " ");
            }
            System.out.println();

            scanner.close();
        }
}
