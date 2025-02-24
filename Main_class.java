// Main_class.java
import java.util.Scanner;

public class Main_class {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Voiture[] voitures = new Voiture[5]; // Tableau pour stocker les voitures

        for (int i = 0; i < 5; i++) {
            voitures[i] = new Voiture(); // Création d'un nouvel objet Voiture

            // Demande des valeurs à l'utilisateur
            System.out.print("Entrez la marque de la voiture " + (i + 1) + " : ");
            voitures[i].setMarque(scanner.nextLine());

            System.out.print("Entrez le nombre de portes : ");
            voitures[i].setNombrePortes(scanner.nextInt());

            System.out.print("Entrez le nombre de pneus : ");
            voitures[i].setNombrePneus(scanner.nextInt());

            System.out.print("Entrez le nombre de chaises : ");
            voitures[i].setNombreChaises(scanner.nextInt());
            scanner.nextLine(); // Nettoyage du buffer

            // Affichage du message après création de la voiture
            System.out.println("Vous venez de créer la voiture numéro " + (i + 1) +
                    ", de marque " + voitures[i].getMarque() +
                    ", ayant " + voitures[i].getNombrePortes() + " portes, " +
                    voitures[i].getNombrePneus() + " pneus et " +
                    voitures[i].getNombreChaises() + " chaises.");
            System.out.println("--------------------------------------------");
        }

        scanner.close();
    }
}
