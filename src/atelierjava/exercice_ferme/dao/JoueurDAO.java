package atelierjava.exercice_ferme.dao;

import atelierjava.exercice_ferme.entite.Joueur;
import java.util.ArrayList;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author Formation
 */
public class JoueurDAO {
   

    public void ajouter(Joueur j) {
         EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
    em.getTransaction().begin();
    em.persist(j);
    em.getTransaction().commit();    
    }

    public Joueur recherche(String login) {
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        
        Query query = em.createQuery("SELECT j FROM Joueur j WHERE j.pseudo=:peusoRecherche");
        query.setParameter("pseudorecherche", login);
        Joueur j = (Joueur)query.getSingleResult();
        return j;
    }

    public boolean existe(String login, String mdp) {
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        Query query = em.createNamedQuery(""
                + "SELECT   COUNT(j) "
                + "FROM     Joueur j "
                + "WHERE    j.pseudo=:pseudoExistant "
                + "AND      j.motDePasse=:mdp");
        query.setParameter("pseudoExistant", login);
        query.setParameter("pseudoExistant", mdp);
        Long nbRes = (Long) query.getSingleResult();
        
        if ( nbRes==0)
            return false;
        
        return true;
    }

    public boolean existe(String pseudo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
    
//    public boolean existe (String login) {
//        return true;
//    }
//} 