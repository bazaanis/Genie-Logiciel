import TP3.*;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Equipement e1 = new Equipement(123, "Ordinateur", Type.Micro);
        Equipement.Composant c1 = e1.new Composant(1, "Processeur", null, 5, 200, Etat.Fonctionnel);
        Equipement.Composant c2 = e1.new Composant(2, "Carte mère", null, 5, 150, Etat.Fonctionnel);
        e1.ajouterComposant(c1);
        e1.ajouterComposant(c2);
        e1.afficherListeComposants();
        e1.supprimerComposant(c2);
        e1.afficherListeComposants();
        Fournisseur f1 = new Fournisseur("Fournisseur A");
        e1.ajouterFournisseur(f1);
        e1.ajouterFournisseur(new Fournisseur("Fournisseur B"));
        e1.afficherListeComposants();
        e1.supprimerFournisseur(f1);
        e1.afficherListeComposants();
    }
}

// import TP2.*;

// public class Main {
// public static void main(String[] args) {
// Pièce p1 = new Pièce(1, "Pneu", 2, 0, 100);
// Pièce p2 = new Pièce(2, "Frein", 4, 0, 50);
// Pièce p3 = new Pièce(3, "Moteur", 1, 0, 500);
// Réparation r1 = new Réparation(null, 5, "Changement de pneus");
// r1.ajouterPièce(p1);
// r1.ajouterPièce(p2);
// r1.ajouterPièce(p3);
// System.out.println("Montant de la réparation : " +
// r1.calculerMontantRéparation());
// System.out.println("isDispo = " + r1.isDispo("pneu"));
// r1.afficherListePièces();
// r1.modifierPièce(2, "Frein à disque", 4, 70);
// System.out.println("Montant de la réparation après modification : " +
// r1.calculerMontantRéparation());
// r1.supprimerPièce1(1);
// r1.afficherListePièces();
// }
// }
