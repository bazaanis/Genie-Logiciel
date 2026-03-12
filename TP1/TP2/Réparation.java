package TP2;

import java.util.Date;
import java.util.Iterator;
import java.util.Vector;

public class Réparation {

    private Date dateRep;
    private int nbHeure;
    private String travaux;
    private Vector<Pièce> listePièceRep = new Vector<Pièce>();
    private Iterator<Pièce> iter = listePièceRep.iterator();

    public Réparation(Date dateRéparation, int nombreHeure, String travaux) {
        this.dateRep = dateRéparation;
        this.nbHeure = nombreHeure;
        this.travaux = travaux;
    }

    public Réparation(Date dateRéparation, int nombreHeure, String travaux, Vector<Pièce> listePièceRep) {
        this.nbHeure = nombreHeure;
        this.dateRep = dateRéparation;
        this.travaux = travaux;
        this.listePièceRep = listePièceRep;
    }

    public double calculerMontantRéparation() {
        Pièce p;
        double T = 0;
        while (iter.hasNext()) {
            // p = ;
            T += iter.next().calculerMontantPièce();
        }
        return T;
    }

    public void ajouterPièce(int réf, String nom, int quantité, double prix) {
        Pièce p;
        while (iter.hasNext()) {
            p = iter.next();
            if (réf == p.getRéf()) {
                p.entrerStock(quantité);
                return;
            }
        }
        p = new Pièce(réf, nom, quantité, 0, prix);
        listePièceRep.add(p);
    }

    public void ajouterPièce(Pièce p) {
        Pièce p2;
        while (iter.hasNext()) {
            p2 = iter.next();
            if (p2.getRéf() == p.getRéf()) {
                p.entrerStock(p.getQuantité());
                return;
            }
        }
        listePièceRep.add(p);
    }

    public void modifierPièce(int réf, String nom, int quantité, double prix) {
        Pièce p;
        while (iter.hasNext()) {
            p = iter.next();
            if (réf == p.getRéf()) {
                p.setQuantité(quantité);
                p.setNom(nom);
                p.setPrix(prix);
                return;
            }
        }
    }

    public void modifierPièce(Pièce p) {
        Pièce p2;
        while (iter.hasNext()) {
            p2 = iter.next();
            if (p2.getRéf() == p.getRéf()) {
                p2.setQuantité(p.getQuantité());
                p2.setNom(p.getNom());
                p2.setPrix(p.getPrix());
                return;
            }
        }
    }

    public void supprimerPièce1(int réf) {
        Pièce p;
        while (iter.hasNext()) {
            p = iter.next();
            if (réf == p.getRéf()) {
                iter.remove();
                return;
            }
        }
    }

    public boolean isDispo(String nom) {
        Pièce p;
        while (iter.hasNext()) {
            p = iter.next();
            if (nom == p.getNom()) {
                return true;
            }
        }
        return false;
    }

    public boolean estRéformable() {
        Pièce p;
        double T = 0;
        while (iter.hasNext()) {
            p = iter.next();
            T = T + p.getPrix();
        }
        return T > calculerMontantRéparation();
    }

    public void afficherListePièces() {
        Pièce p;
        while (iter.hasNext()) {
            p = iter.next();
            System.out.println(p);
        }
    }
}