package TP3;
import java.util.Scanner;
public class EX05 {
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
        // Inversion de l'ordre des éléments du tableau sans utiliser de tableau d'aide
        int debut = 0;
        int fin = tableau.length - 1;
        while (debut < fin) {
            // Échanger les éléments aux positions debut et fin
            int temp = tableau[debut];
            tableau[debut] = tableau[fin];
            tableau[fin] = temp;

            // Déplacer les indices debut et fin
            debut++;
            fin--;
        }
        // Affichage du tableau résultant
        System.out.println("Tableau résultant après inversion :");
        for (int element : tableau) {
            System.out.print(element + " ");
        }
        System.out.println();

        scanner.close();
    }
}
