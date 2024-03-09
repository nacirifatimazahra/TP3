package TP3;
import java.util.Scanner;
public class EX02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Déclaration d'un tableau de 10 éléments
        int[] tableau = new int[10];
        // Remplissage du tableau avec des valeurs saisies par l'utilisateur
        System.out.println("Veuillez saisir 10 valeurs pour remplir le tableau :");
        for (int i = 0; i < tableau.length; i++) {
            System.out.print("Élément " + i + " : ");
            tableau[i] = sc.nextInt();
        }
        // Affichage des éléments du tableau
        System.out.println("Éléments du tableau :");
        for (int i = 0; i < tableau.length; i++) {
            System.out.println("Élément " + i + ": " + tableau[i]);
        }
        sc.close();
    }
}
