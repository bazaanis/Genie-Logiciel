package TP3;

import java.util.Date;
import java.util.Vector;

public class Equipement {
    private int numSérie;
    private String désignation;
    private Type typeEquip;
    private Vector<Composant> listeComposants = new Vector<Composant>();
    private Vector<Fournisseur> listeFournisseur = new Vector<Fournisseur>();

    public Equipement(int numSérie, String désignation, Type typeEquip, Vector<Composant> listeComposants) {
        this.numSérie = numSérie;
        this.désignation = désignation;
        this.typeEquip = typeEquip;
        this.listeComposants = listeComposants;
    }

    public Equipement(int numSérie, String désignation, Type typeEquip) {
        this.numSérie = numSérie;
        this.désignation = désignation;
        this.typeEquip = typeEquip;
    }

    public Equipement() {
        this.numSérie = 0;
        this.désignation = "";
        this.typeEquip = Type.Rien;
    }

    public int getNumSérie() {
        return numSérie;
    }

    public void setNumSérie(int numSérie) {
        this.numSérie = numSérie;
    }

    public String getDésignation() {
        return désignation;
    }

    public void setDésignation(String désignation) {
        this.désignation = désignation;
    }

    public Type getTypeEquip() {
        return typeEquip;
    }

    public void setTypeEquip(Type typeEquip) {
        this.typeEquip = typeEquip;
    }

    public void ajouterComposant(Composant c) {
        listeComposants.add(c);
    }

    public void supprimerComposant(Composant c) {
        listeComposants.remove(c);
    }

    public void afficherListeComposants() {
        for (Composant c : listeComposants) {
            System.out.println(c);
        }
    }

    public void ajouterFournisseur(Fournisseur f) {
        listeFournisseur.add(f);
    }

    public void supprimerFournisseur(Fournisseur f) {
        listeFournisseur.remove(f);
    }

    public class Composant {
        private int réfComposant;
        private String nomComposant;
        private Date dateFabrication;
        private int duréeVie;
        private double prixComposant;
        private Etat etatComposant;

        public Composant(int réfComposant, String nomComposant, Date dateFabrication, int duréeVie,
                double prixComposant, Etat etatComposant) {
            this.réfComposant = réfComposant;
            this.nomComposant = nomComposant;
            this.dateFabrication = dateFabrication;
            this.duréeVie = duréeVie;
            this.prixComposant = prixComposant;
            this.etatComposant = etatComposant;
        }

        public Composant() {
            this.réfComposant = 0;
            this.nomComposant = "";
            this.dateFabrication = new Date();
            this.duréeVie = 0;
            this.prixComposant = 0.0;
            this.etatComposant = Etat.Fonctionnel;
        }

        public void remplacer(Composant c) {
            this.réfComposant = c.réfComposant;
            this.nomComposant = c.nomComposant;
            this.dateFabrication = c.dateFabrication;
            this.duréeVie = c.duréeVie;
            this.prixComposant = c.prixComposant;
            this.etatComposant = c.etatComposant;
        }

        public boolean estFonctionnel() {
            return this.etatComposant == Etat.Fonctionnel;
        }

        @Override
        public String toString() {
            return "Composant [réfComposant=" + réfComposant + ", nomComposant=" + nomComposant + ", dateFabrication="
                    + dateFabrication + ", duréeVie=" + duréeVie + ", prixComposant=" + prixComposant
                    + ", etatComposant=" + etatComposant + ", fournisseur=" + listeFournisseur + "]";
        }
    }
}
