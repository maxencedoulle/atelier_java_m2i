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
   
    public Joueur recherchet (long idJoueur) {
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        Joueur j = em.find(Joueur.class, idJoueur);
        return j;
    }

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

    public Joueur rechercher(String login, String mdp) {
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        Query query = em.createQuery(""
                + "SELECT   j "
                + "FROM     Joueur j "
                + "WHERE    j.pseudo=:pseudoExistant "
                + "AND      j.motDePasse=:mdp");
        query.setParameter("pseudoExistant", login);
        query.setParameter("mdp", mdp);
        
        Joueur j = (Joueur) query.getSingleResult();
        return j;
        
        
    }

    public boolean existe(String pseudo) {
        // Eécupère EntityManager
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        
        // Vérifie
        Query query = em.createQuery("SELECT  COUNT (j) FROM Joueur j WHERE j.pseudo=:pseudoExistant");
        query.setParameter("PseudoExistant", pseudo);
        
        long nbJoueurs = (long) query.getSingleResult();
        
        if (nbJoueurs>0 )
            return true;
        
        return false;
    }

    public Joueur recherche(long idJoueur) {
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        
        Joueur j = em.find(Joueur.class, idJoueur);
        return j;
    }
}
    

