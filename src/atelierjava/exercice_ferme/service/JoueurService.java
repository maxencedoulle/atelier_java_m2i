package atelierjava.exercice_ferme.service;

import atelierjava.exercice_ferme.entite.Joueur;
import atelierjava.exercice_ferme.dao.JoueurDAO;

public class JoueurService {

    public void inscription(String pseudo, String mdp) {
        if (pseudo.length() < 3 || pseudo.length() > 8) /* Pseudo entre 3 et 8 lettre */ {
            throw new RuntimeException(" L'identifiant doit contenire enrre 3 et 8 lettres");
        }

        // Vérifier que le psuedo est encore existant
        // Erreur si si mdp <5 pu > 10
        if (!mdp.matches(".{5,10}")) {
            /* Le Mot de pzsse comporte entre 5 et 10 lettre */
            throw new RuntimeException("Une majusucle et un chiffre doit-être présent ");
        }

        if (!mdp.matches(".*[1,9].*")) {
            throw new RuntimeException("Le mot de passe requiert au moins un chiffre");
        }

        if (!mdp.matches(".*[A-Z].*")) {
            /* Il  y a au moins une lettre majucule dans la Mot de passe */
            throw new RuntimeException("Le mot de passe n'est pas valide");
            /*     .* = Veut dire qu'il peut y en avoir plusieures  */
        }

        // Verifier que le pseudo est encore di
        JoueurDAO dao = new JoueurDAO();
//        if (dao.existe(pseudo)) {
//            throw new RuntimeException("Ce Pseudo exsite déja ");
//        }
        // Ajoute la ferme en BD
        Joueur ferme = new Joueur();
        ferme.setMotDePasse(mdp);
        ferme.setPseudo(pseudo);
        dao.ajouter(ferme);

        // Connection        
        // Connection        
        // Connection        
        // Connection
    }

    public void connection(String psuedo, String mdp) {
        JoueurDAO dao= new JoueurDAO();
        if (!dao.existe(psuedo, mdp)) {
            throw new RuntimeException("Connexion échouée");
        }
        
        
        
        
    }
}
