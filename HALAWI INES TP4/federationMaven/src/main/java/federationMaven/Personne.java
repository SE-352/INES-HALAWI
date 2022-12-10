package federationMaven;
import javax.persistence.Column;
//import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.MappedSuperclass;
import federationMaven.Personne;

import lombok.AllArgsConstructor;
import lombok.Data;
@MappedSuperclass
@Data
@AllArgsConstructor
//@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
//@DiscriminatorColumn(name = "type")
public class Personne extends BaseEntity{

    @Column(name="nom", length=60, nullable=false)
    protected String nom;

    @Column(name="prenom", length=60, nullable=false)
    protected String prenom;

    @Column(name="email", length=60)
    protected String email;

    public Personne()
    {

    }

}
