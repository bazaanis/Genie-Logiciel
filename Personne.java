public class Personne {
    protected String nom;
    protected String prenom;
    protected String email;
    protected String login;
    protected String password;
    public static int tentatives;

    public Personne(String nom, String prenom, String email, String login, String password) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.login = login;
        this.password = password;
        tentatives = 0;
    }

    public Personne() {
        // Constructeur par défaut
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

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Personne{" +
                "nom='" + nom + ',' +
                ", prenom='" + prenom + ',' +
                ", email='" + email + ',' +
                ", login='" + login + ',' +
                ", password='" + password;
    }

    public void afficher() {
        System.out.println(this.toString());
    }

    public Boolean sauthentifier1(String login, String password) {
        if (tentatives > 1) {
            tentatives++;
            return false;
        }
        if (this.login.equals(login) && this.password.equals(password)) {
            tentatives = 0;
            return true;
        }
        tentatives++;
        return false;
    }

    public Boolean sauthentifier2(String login, String password) {
        if (tentatives > 3) {
            tentatives++;
            return false;
        }
        if (this.login.equals(login) && this.password.equals(password)) {
            tentatives = 0;
            return true;
        }
        tentatives++;
        return false;
    }
}
