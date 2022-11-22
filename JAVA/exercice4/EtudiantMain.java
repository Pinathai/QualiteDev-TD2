package exercice4;

public class EtudiantMain {

    public static void main(String[] args) {
        Etudiant e1 = new Etudiant.BuilderEtudiant("0013A", "06025518IO", "DaCosta", "Gaetan")
                .partDomicile("ville").build();
        System.out.println(e1.toString());
    }
}
