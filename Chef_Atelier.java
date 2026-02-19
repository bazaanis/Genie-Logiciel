import java.util.Date;

public class Chef_Atelier extends Personne {
    private int nbExperience;
    private Date dateExperience;
    private Date datePromotion;
    private Statut statut;
    private static Chef_Atelier instance;

    private Chef_Atelier(int nbExperience, Date dateExperience, Date datePromotion, Statut statut) {
        super.nom = "Chef";
        super.prenom = "Atelier";
        super.email = "chef.atelier@entreprise.com";
        super.login = "chef.atelier";
        super.password = "chef123";
        this.nbExperience = nbExperience;
        this.dateExperience = dateExperience;
        this.datePromotion = datePromotion;
        this.statut = statut;
    }

    private Chef_Atelier() {
        super();
        // Constructeur par défaut
    }

    public int getNbExperience() {
        return nbExperience;
    }

    public Date getDateExperience() {
        return dateExperience;
    }

    public Date getDatePromotion() {
        return datePromotion;
    }

    public Statut getStatut() {
        return statut;
    }

    public void setNbExperience(int nbExperience) {
        this.nbExperience = nbExperience;
    }

    public void setDateExperience(Date dateExperience) {
        this.dateExperience = dateExperience;
    }

    public void setDatePromotion(Date datePromotion) {
        this.datePromotion = datePromotion;
    }

    public void setStatut(Statut statut) {
        this.statut = statut;
    }

    @Override
    public String toString() {
        return super.toString() + ", nbExperience=" + nbExperience +
                ", dateExperience=" + dateExperience +
                ", datePromotion=" + datePromotion +
                ", statut=" + statut +
                '}';
    }

    @Override
    public void afficher() {
        System.out.println(this.toString());
    }

    // public int miseAJourExperience(dateExp: Date) {
    // //???????????????????????
    // }

    public static Chef_Atelier getInstance(int nbExperience, Date dateExperience, Date datePromotion, Statut statut) {
        if (instance == null) {
            instance = new Chef_Atelier(nbExperience, dateExperience, datePromotion, statut);
        }
        return instance;
    }

}