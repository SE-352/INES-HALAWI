package federationMaven;

import java.util.Set;

import javax.persistence.*;
import lombok.*;

@Entity
@Table(name = "professeurs")
//@DiscriminatorValue(value = "PROFESSEUR")
@Data
@AllArgsConstructor
public class Professeur extends Personne{

    @Column(name = "grade", nullable = true)
    private String grade;

    //Ajout de la relation ManyToMany entre la Classe Professeur et Cours
    @ManyToMany()
    @JoinTable(name = "dispenses",
            joinColumns = @JoinColumn(name = "professeur_id"),
            inverseJoinColumns = @JoinColumn(name = "cours_id")
    )
    private Set<Cours> cours;

    //Ajout de la relation ManyToMany entre la Classe Professeur et Departement
    @ManyToMany()
    @JoinTable(name = "interventions",
            joinColumns = @JoinColumn(name = "professeur_id"),
            inverseJoinColumns = @JoinColumn(name = "departement_id")
    )
    private Set<Departement> departements;

    public Professeur() {

    }

    public Professeur(String nom, String prenom, String email, String grade) {
        super();
        this.grade = grade;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public Set<Cours> getCours() {
        return cours;
    }

    public void setCours(Set<Cours> cours) {
        this.cours = cours;
    }

    public Set<Departement> getDepartements() {
        return departements;
    }

    public void setDepartements(Set<Departement> departements) {
        this.departements = departements;
    }

}