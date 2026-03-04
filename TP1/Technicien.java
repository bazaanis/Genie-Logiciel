public class Technicien extends Personne {
    private String matricule;
    private Specialité specialite;

    public Technicien(String nom, String prenom, String email, String login, String password, Specialité specialite, String matricule) {
        super(nom, prenom, email, login, password);
        this.specialite = specialite;
        this.matricule = matricule;
    }

    public Technicien() {
        super();
        // Constructeur par défaut
    }

    public String getMatricule() {
        return matricule;
    }

    public Specialité getSpecialite() {
        return specialite;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public void setSpecialite(Specialité specialite) {
        this.specialite = specialite;
    }

    @Override
    public String toString() {
        return super.toString() + ", matricule='" + matricule + ',' +
                ", specialite='" + specialite + '}';
    }

    @Override
    public void afficher() {
        System.out.println(this.toString());
    }
}
