package TP2;

public class Pièce {

    private int réf;
    private String nom;
    private int quantité;
    private int quantitéStock;
    private double prix;

    public Pièce() {
        this.réf = 0;
        this.nom = "";
        this.quantité = 0;
        this.quantitéStock = 0;
        this.prix = 0.0;
    }

    public Pièce(Pièce p) {
        this.réf = p.getRéf();
        this.nom = p.getNom();
        this.quantité = p.getQuantité();
        this.quantitéStock = p.getQuantitéStock();
        this.prix = p.getPrix();
    }

    public Pièce(int réf, String nom, int quantité, int quantitéStock, double prix) {
        this.réf = réf;
        this.nom = nom;
        this.quantité = quantité;
        this.quantitéStock = quantitéStock;
        this.prix = prix;
    }

    public int getRéf() {
        return réf;
    }

    public String getNom() {
        return nom;
    }

    public int getQuantité() {
        return quantité;
    }

    public double getPrix() {
        return prix;
    }

    public int getQuantitéStock() {
        return quantitéStock;
    }

    public void setRéf(int réf) {
        this.réf = réf;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setQuantité(int quantité) {
        this.quantité = quantité;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public void setQuantitéStock(int quantitéStock) {
        this.quantitéStock = quantitéStock;
    }

    public void entrerStock(int quantité) {
        this.quantité += quantité;
    }

    public double calculerMontantPièce() {
        return quantité * prix;
    }

    @Override
    public String toString() {
        return "Pièce{" +
                "réf=" + réf +
                ", nom='" + nom + '\'' +
                ", quantité=" + quantité +
                ", quantitéStock=" + quantitéStock +
                ", prix=" + prix +
                '}';
    }
}