import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Création d'un prestataire
        Prestataire p = new Prestataire(1, "Mihaja", "beloha", "Mihaja@hei.com", "0330000121", 100_000);

        // Ajout de pointages
        p.addPointage(new Pointage(LocalDate.of(2025, 9, 1), TypeTravail.ENSEIGNEMENT, 1, "Cours Java"));
        p.addPointage(new Pointage(LocalDate.of(2025, 9, 2), TypeTravail.ADMINISTRATION, 0.5, "Réunion de projet"));
        p.addPointage(new Pointage(LocalDate.of(2025, 9, 3), TypeTravail.RD, 1, "Développement d'application"));

        // Afficher les pointages
        System.out.println("=== Pointages du prestataire ===");
        for (Pointage pt : p.getPointages()) {
            System.out.println(pt);
        }

        // Calcul du salaire entre deux dates
        LocalDate debut = LocalDate.of(2025, 9, 1);
        LocalDate fin = LocalDate.of(2025, 9, 3);
        System.out.println("\nSalaire entre " + debut + " et " + fin + " : " + p.calculerSalaire(debut, fin) + " Ar");
    }
}
