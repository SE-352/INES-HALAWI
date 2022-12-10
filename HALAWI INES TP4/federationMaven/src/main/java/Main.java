

import federationMaven.Cours;
import federationMaven.Departement;
import federationMaven.Etudiant;
import federationMaven.Professeur;

import java.util.Date;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("universitePU");
        EntityManager em = emf.createEntityManager();

        EntityTransaction et = em.getTransaction();
        et.begin();

        Departement departement1 = new Departement("Biologie vétégale", "biologie.com");

        Departement departement2 = new Departement("Informatique", "informatique.com");

        Cours cours1 = new Cours("Bioligie Moléculaire", new Date());
        Cours cours2 = new Cours("Programmation Orientée Objet", new Date());
        Cours cours3 = new Cours("Analyse Numérique", new Date());

        Etudiant etudiant1 = new Etudiant("TOGBE", "Yawo Rita Manuela", "rita.togbe@ipnetinstitute.com", "Lomé - TOGO", "99270195");
        etudiant1.setDepartement(departement2);
        Etudiant etudiant2 = new Etudiant("AHADJITSE", "Yawo Florent Mathis", "yawo.ahadjitse@ipnetinstitute.com", "Lomé - TOGO", "97990638");
        etudiant2.setDepartement(departement1);
        Etudiant etudiant3 = new Etudiant("SOBO", "Paul Le Roi", "paul.sobo@ipnetinstitute.com", "Lomé - TOGO", "99000095");
        etudiant3.setDepartement(departement1);
        Etudiant etudiant4 = new Etudiant("KLOUTSE", "Emile", "emile.kloutse@ipnetinstitute.com", "Lomé - TOGO", "97372898");
        etudiant4.setDepartement(departement2);


        Professeur professeur1 = new Professeur("AYENA", "Adebayor", "adebayor.ayena@ipnetinstitute.com", "Enseignant");
        Professeur professeur2 = new Professeur("BATANA", "Ferdinand", "ferdinand.batana@ipnetinstitute.com", "Chef département");
        Professeur professeur3 = new Professeur("SOGNON", "Rosine", "tassivi.sognon@ipnetinstitute.com", "Enseignante");


        /*Set<Departement> departements1 = new HashSet<>();
        Set<Departement> departements2 = new HashSet<>();
        departements1.add(departement1);
        departements2.add(departement2);

        professeur1.setDepartements(departements1);*/
        em.persist(etudiant1);
        em.persist(etudiant2);
        em.persist(etudiant3);
        em.persist(etudiant4);
        /*em.persist(professeur1);
        em.persist(professeur2);
        em.persist(professeur3);*/
        et.commit();

    }
}
