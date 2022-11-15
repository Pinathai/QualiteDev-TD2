public class Identifiant {

    private int incr = 0;

    private static Identifiant gen = null;

    private Identifiant() {
        gen = null;
    }

    public static Identifiant getInstance() {
        if (gen == null) {
            gen = new Identifiant();
        }
        return gen;
    }

    public String genererId() {
        this.incr++;
        return "ID_" + this.incr;
    }
}