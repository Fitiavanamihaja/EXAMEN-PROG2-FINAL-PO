import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Prestataire extends Travailleur {
    private double tauxJournalier; // TJM
    private List<Pointage> pointages;

    public Prestataire(int id, String nom, String prenom, String email, String telephone, double tauxJournalier) {
        super(id, nom, prenom, email, telephone);
        this.tauxJournalier = tauxJournalier;
        this.pointages = new ArrayList<>();
    }

    public void addPointage(Pointage p) {
        pointages.add(p);
    }

    public List<Pointage> getPointages() {
        return pointages;
    }

    // Calculer le salaire entre deux dates
    public double calculerSalaire(LocalDate debut, LocalDate fin) {
        double total = 0;
        for (Pointage p : pointages) {
            if ((p.getDate().isAfter(debut) || p.getDate().isEqual(debut)) &&
                    (p.getDate().isBefore(fin) || p.getDate().isEqual(fin))) {
                total += p.getDuree() * tauxJournalier;
            }
        }
        return total;
    }

    @Override
    public String toString() {
        return super.toString() + " | Prestataire - TJM: " + tauxJournalier + " Ar";
    }
}

