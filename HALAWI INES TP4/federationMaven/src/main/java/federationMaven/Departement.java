package federationMaven;
import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Entity
@Table(name = "departements")
public class Departement extends BaseEntity implements Serializable{

    private static final long serialVersionUID = 1L;

    @Column(name="nom", length=60)
    private String nom;

    @Column(name="adresseWeb", length=60)
    private String adresseWeb;

    //Ajout de la relation OneToMany entre Departement et Etudiant
    @OneToMany(mappedBy = "departement",fetch = FetchType.LAZY)
    private Set<Etudiant> etudiants;

    //Ajout de la relation ManyToMany entre la Classe Departement et Professeur
    @ManyToMany(mappedBy="departements", cascade=CascadeType.ALL)
    private Set<Professeur> professeurs;

    public Departement() {
    }

    public Departement(String nom, String adresseWeb) {
        this.nom = nom;
        this.adresseWeb = adresseWeb;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdresseWeb() {
        return adresseWeb;
    }

    public void setAdresseWeb(String adresseWeb) {
        this.adresseWeb = adresseWeb;
    }

    public Set<Etudiant> getEtudiants() {
        return etudiants;
    }

    public void setEtudiants(Set<Etudiant> etudiants) {
        this.etudiants = etudiants;
    }

    public Set<Professeur> getProfesseurs() {
        return professeurs;
    }

    public void setProfesseurs(Set<Professeur> professeurs) {
        this.professeurs = professeurs;
    }


}