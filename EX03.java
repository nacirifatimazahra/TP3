package TP3;
import java.util.Scanner;
public class EX03 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // Demander à l'utilisateur de saisir la taille N du tableau
        int taille = 0;

        while (taille < 10 || taille > 50) {
            System.out.print("Entrez la taille du tableau (entre 10 et 50) : ");
            taille = sc.nextInt();

            if (taille < 10 || taille > 50) {
                System.out.println("Veuillez entrer une taille valide.");
            }
        }
        // Déclaration d'un tableau de taille N
        int[] tableau = new int[taille];

        // Remplissage du tableau avec des valeurs saisies par l'utilisateur
        System.out.println("Veuillez saisir les valeurs pour remplir le tableau :");
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
