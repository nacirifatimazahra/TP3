package TP3;
import java.util.Scanner;
public class EX06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Demander à l'utilisateur de saisir la taille N du tableau
        System.out.print("Entrez la taille du tableau : ");
        int taille = scanner.nextInt();

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

        // Création des tableaux TP et TN
        int[] tableauPositif = new int[taille];
        int[] tableauNegatif = new int[taille];
        int taillePositif = 0;
        int tailleNegatif = 0;

        // Copie des composantes positives dans TP et des valeurs négatives dans TN
        for (int element : tableau) {
            if (element > 0) {
                tableauPositif[taillePositif] = element;
                taillePositif++;
            } else if (element < 0) {
                tableauNegatif[tailleNegatif] = element;
                tailleNegatif++;
            }
        }

        // Affichage du tableau TP
        System.out.println("Tableau des composantes positives (TP) :");
        for (int i = 0; i < taillePositif; i++) {
            System.out.print(tableauPositif[i] + " ");
        }
        System.out.println();

        // Affichage du tableau TN
        System.out.println("Tableau des valeurs négatives (TN) :");
        for (int i = 0; i < tailleNegatif; i++) {
            System.out.print(tableauNegatif[i] + " ");
        }
        System.out.println();

        scanner.close();
    }
}
