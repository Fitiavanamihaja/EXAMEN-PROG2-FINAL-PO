public class Travailleur {
        protected int id;
        protected String nom;
        protected String prenom;
        protected String email;
        protected String telephone;

        public Travailleur(int id, String nom, String prenom, String email, String telephone) {
            this.id = id;
            this.nom = nom;
            this.prenom = prenom;
            this.email = email;
            this.telephone = telephone;
        }

        public int getId() {
            return id;
        }

        public String getNom() {
            return nom;
        }

        public String getPrenom() {
            return prenom;
        }

        public String getEmail() {
            return email;
        }

        public String getTelephone() {
            return telephone;
        }

        @Override
        public String toString() {
            return "Travailleur: " + nom + " " + prenom + " (" + email + ")";
        }
    }


