package federationMaven;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import federationMaven.BaseEntity;
import federationMaven.Etudiant;
import lombok.AllArgsConstructor;
import lombok.Data;
import federationMaven.Personne;
@Data
@AllArgsConstructor
@Entity
@Table(name = "cours")
public class Cours extends BaseEntity implements Serializable{

    private static final long serialVersionUID = 1L;

    @Column(name = "intitule", length = 60, nullable = false, unique = true)
    private String intitule;

    @Column(name = "date_creation")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateCreation;

    //Ajout de la relation ManyToMany entre la Classe Etudiant et Cours
    @ManyToMany()
    @JoinTable(name = "inscriptions",
            joinColumns = @JoinColumn(name = "cours_id"),
            inverseJoinColumns = @JoinColumn(name = "etudiant_id")
    )
    private Set<Etudiant> etudiants;

    //Ajout de la relation ManyToMany entre la Classe Professeur et Cours
    @ManyToMany(mappedBy="cours", cascade=CascadeType.ALL)
    private Set<Professeur> professeurs;

    public Cours() {
    }

    public Cours(String intitule, Date dateCreation) {
        this.intitule = intitule;
        this.dateCreation = dateCreation;
    }

    public String getIntitule() {
        return intitule;
    }

    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
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
