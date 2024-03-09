package TP3;
import java.util.Scanner;
public class EX04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Demander à l'utilisateur de saisir la taille N du tableau
        int taille = 0;

        while (taille < 10 || taille > 50) {
            System.out.print("Entrez la taille du tableau (entre 10 et 50) : ");
            taille = scanner.nextInt();

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
            tableau[i] = scanner.nextInt();
        }

        // Affichage du tableau initial
        System.out.println("Tableau initial :");
        for (int element : tableau) {
            System.out.print(element + " ");
        }
        System.out.println();

        // Suppression des occurrences de 5 et tassement des éléments
        int nouvelleTaille = 0;

        for (int i = 0; i < tableau.length; i++) {
            if (tableau[i] != 5) {
                tableau[nouvelleTaille] = tableau[i];
                nouvelleTaille++;
            }
        }

        // Affichage du tableau résultant
        System.out.println("Tableau résultant après suppression des occurrences de 5 :");
        for (int i = 0; i < nouvelleTaille; i++) {
            System.out.print(tableau[i] + " ");
        }
        System.out.println();
        scanner.close();
    }
}
