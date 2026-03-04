public class Main {
    public static void main(String[] args) {
        Chef_Atelier c1 = Chef_Atelier.getInstance(1, null, null, null);
        Chef_Atelier c2 = Chef_Atelier.getInstance(5, null, null, null);
        Chef_Atelier c3 = Chef_Atelier.getInstance(10, null, null, null);

        c1.afficher();
        c2.afficher();
        c3.afficher();
    }
}
