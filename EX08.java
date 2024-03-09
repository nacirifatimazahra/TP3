package TP3;
import java.util.Scanner;
public class EX08 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            // Demander à l'utilisateur de saisir la taille du tableau
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
            // Calculer le plus grand écart dans le tableau
            int plusGrandEcart = 0;
            for (int i = 0; i < tableau.length - 1; i++) {
                int ecart = Math.abs(tableau[i] - tableau[i + 1]);
                if (ecart > plusGrandEcart) {
                    plusGrandEcart = ecart;
                }
            }
            // Afficher le plus grand écart
            System.out.println("Le plus grand écart dans le tableau est : " + plusGrandEcart);
            scanner.close();
        }
}
