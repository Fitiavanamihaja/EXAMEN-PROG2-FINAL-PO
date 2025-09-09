import java.time.LocalDate;

public class Pointage {
    private LocalDate date;
    private TypeTravail typeTravail;
    private double duree; // fraction de jour (0.5, 1, etc.)
    private String description;

    public Pointage(LocalDate date, TypeTravail typeTravail, double duree, String description) {
        if (duree <= 0 || duree > 1) {
            throw new IllegalArgumentException("La durée doit être > 0 et <= 1 jour");
        }
        this.date = date;
        this.typeTravail = typeTravail;
        this.duree = duree;
        this.description = description;
    }

    public LocalDate getDate() {
        return date;
    }

    public TypeTravail getTypeTravail() {
        return typeTravail;
    }

    public double getDuree() {
        return duree;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return date + " | " + typeTravail + " | " + duree + " jour(s) | " + description;
    }
}
