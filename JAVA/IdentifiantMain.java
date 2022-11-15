public class IdentifiantMain {

    public static void main(String[] args) {
        Identifiant i1 = Identifiant.getInstance();
        Identifiant i2 = Identifiant.getInstance();
        System.out.println(i1.genererId());
        System.out.println(i2.genererId());
        System.out.println(i1.genererId());
    }
}