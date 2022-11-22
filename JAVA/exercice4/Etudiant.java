package exercice4;

/**
 * 
 */
public class Etudiant {

    /**
     * 
     */
    private String code_nip;

    /**
     * 
     */
    private String code_ine;

    /**
     * 
     */
    private String nom;

    /**
     * 
     */
    private String nom_usuel;

    /**
     * 
     */
    private String prenom;

    /**
     * 
     */
    private String date_naissance;

    /**
     * 
     */
    private String lieu_naissance;

    /**
     * 
     */
    private int annee_bac;

    /**
     * 
     */
    private String email;

    /**
     * 
     */
    private String domicile;

    /**
     * 
     */
    private String telephone;

    /**
     * Default constructor
     */


    public Etudiant(BuilderEtudiant b) {
        this.code_nip = b.code_nip;
        this.code_ine = b.code_ine;
        this.nom = b.nom;
        this.nom_usuel = b.nom_usuel;
        this.prenom = b.prenom;
        this.date_naissance = b.date_naissance;
        this.lieu_naissance = b.lieu_naissance;
        this.annee_bac = b.annee_bac;
        this.email = b.email;
        this.domicile = b.domicile;
        this.telephone = b.telephone;
    }

    @Override
    public String toString() {
        return "Etudiant{" +
                "code_nip='" + code_nip + '\'' +
                ", code_ine='" + code_ine + '\'' +
                ", nom='" + nom + '\'' +
                ", nom_usuel='" + nom_usuel + '\'' +
                ", prenom='" + prenom + '\'' +
                ", date_naissance='" + date_naissance + '\'' +
                ", lieu_naissance='" + lieu_naissance + '\'' +
                ", annee_bac=" + annee_bac +
                ", email='" + email + '\'' +
                ", domicile='" + domicile + '\'' +
                ", telephone='" + telephone + '\'' +
                '}';
    }

    public static class BuilderEtudiant {

        private String code_nip;
        private String code_ine;
        private String nom;
        private String nom_usuel;
        private String prenom;
        private String date_naissance;
        private String lieu_naissance;
        private int annee_bac;
        private String email;
        private String domicile;
        private String telephone;

        public BuilderEtudiant(String code_nip, String code_ine, String nom, String prenom) {
            this.code_nip = code_nip;
            this.code_ine = code_ine;
            this.nom = nom;
            this.prenom = prenom;
        }

        /**
         * @param nom_usuel
         */
        public BuilderEtudiant partNomUsuel(String nom_usuel) {
            this.nom_usuel = nom_usuel;
            return this;
        }

        /**
         * @param date_naissance
         */
        public BuilderEtudiant partDateNaissance(String date_naissance) {
            this.date_naissance = date_naissance;
            return this;
        }

        /**
         * @param lieu_naissance
         */
        public BuilderEtudiant partLieuNaissance(String lieu_naissance) {
            this.lieu_naissance = lieu_naissance;
            return this;
        }

        /**
         * @param annee_bac
         */
        public BuilderEtudiant partAnneeBac(int annee_bac) {
            this.annee_bac = annee_bac;
            return this;
        }

        /**
         * @param email
         */
        public BuilderEtudiant partEmail(String email) {
            this.email = email;
            return this;
        }

        /**
         * @param domicile
         */
        public BuilderEtudiant partDomicile(String domicile) {
            this.domicile = domicile;
            return this;
        }

        /**
         * @param num_telephone
         */
        public BuilderEtudiant partTelephone(String num_telephone) {
            this.telephone = num_telephone;
            return this;
        }

        public Etudiant build() {
            return new Etudiant(this);
        }

    }
}