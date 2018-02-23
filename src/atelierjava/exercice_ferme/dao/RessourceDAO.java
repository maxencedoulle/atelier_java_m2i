
package atelierjava.exercice_ferme.dao;

import atelierjava.exercice_ferme.entite.Ressource;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

/**
 *
 * @author Formation
 */
public class RessourceDAO {
    public void ajouter(Ressource r) {
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        
        em.getTransaction().begin();
        em.persist(r);
        em.getTransaction().commit();
    }
}
