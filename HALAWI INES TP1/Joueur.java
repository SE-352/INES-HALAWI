package tp1;

public class Joueur {
	private String nom;
    private String prenom;
    private String numeroLicence;
    private int nombrePoint=0;
    
    public Joueur(String nom, String prenom, String numeroLicence, int nombrePoint) {
        this.nom = nom;
        this.prenom = prenom;
        this.numeroLicence = numeroLicence;
        this.nombrePoint = nombrePoint;
    }
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNumeroLicence() {
        return numeroLicence;
    }

    public void setNumeroLicence(String numeroLicence) {
        this.numeroLicence = numeroLicence;
    }

    public int getNombrePoint() {
        return nombrePoint;
    }

    public void setNombrePoint(int nombrePoint) {
        this.nombrePoint = nombrePoint;
    }


}
