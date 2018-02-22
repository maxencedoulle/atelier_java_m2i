package atelierjava.exercice_ferme.test;

import atelierjava.exercice_ferme.entite.Joueur;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.junit.Test;

/**
 *
 * @author Formation
 */
public class JPATest {
    
    @Test
    public void demarreJPA () {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("PU"); 
        EntityManager em = factory.createEntityManager();
        
        em.getTransaction().begin();
        
        Joueur j = new Joueur();
        j.setPseudo("maxence");
        j.setMotDePasse("1234");
        em.persist(j);
        em.getTransaction().commit(); // Permet d'enregsitré un joueur 
        
    }
    
}
