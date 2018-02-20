package atelierjava.exercice_ferme.dao;

import competence.atelier_java.exercice_ferme.entite.Ferme;
import java.util.ArrayList;

/**
 *
 * @author Formation
 */
public class FermeDAO {

    private static ArrayList<Ferme> fermes = new ArrayList<>();

    public void ajouter(Ferme ferme) {
        fermes.add(ferme);
    }

    public Ferme recherche(String login) {
        for ( Ferme fermeAct : fermes ) {
            if ( fermeAct.getNom().equals(login)) {
                return fermeAct;
            }
        }
        return null; 
    }

    public boolean existe(String login) {
        return true;
    }
}