package atelierjava.exercice_ferme.dao;

import competence.atelier_java.exercice_ferme.entite.Joueur;
import java.util.ArrayList;

/**
 *
 * @author Formation
 */
public class JoueurDAO {

    private static ArrayList<Joueur> joueur = new ArrayList<>();

    public void ajouter(Joueur joueur) {
        joueur.add(joueur);
    }

    public Joueur recherche(String login) {
        for ( Joueur joueureAct : joueur ) {
            if ( joueureAct.getPseudo().equals(login)) {
                return joueureAct;
            }
        }
        return null; 
    }

    public boolean existe(String login) {
        for ( Joueur joueurActu : joueur) {
            if ( joueurActu.equals(login)) 
                return true;
        }
        return false;
    }
    
    public boolean existe (String login, String mdp) {
        for ( Joueur joueurActu: joueur) {
            if (joueurActu.getPseudo().equals(login) && 
                joueurActu.getPseudo().equals(mdp)) {
                return true;
            }
        }
        return false;
    }
}