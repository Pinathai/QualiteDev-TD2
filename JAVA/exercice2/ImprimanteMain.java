package exercice2;

import exercice1.Identifiant;

public class ImprimanteMain {

    public static void main(String[] args) {
        Imprimante i1 = Imprimante.getInstance();
        Imprimante i2 = Imprimante.getInstance();
        i1.imprimer(2);
        System.out.println(i1.getNbPages());
        i1.imprimer(7);
        i2.imprimer(4);
        System.out.println(i2.getNbPages());
    }
}
