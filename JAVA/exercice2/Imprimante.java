package exercice2;

public class Imprimante {

    private int incr = 0;

    private static Imprimante gen = null;

    private Imprimante() {
        gen = null;
    }

    public static Imprimante getInstance() {
        if (gen == null) {
            gen = new Imprimante();
        }
        return gen;
    }

    public void imprimer(int nbPages) {
        this.incr += nbPages;
    }

    public String getNbPages() {
        return "Pages imprimées : " + this.incr;
    }
}