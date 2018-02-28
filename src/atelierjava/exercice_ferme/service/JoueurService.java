package atelierjava.exercice_ferme.service;

import atelierjava.exercice_ferme.entite.Joueur;
import atelierjava.exercice_ferme.dao.JoueurDAO;
import atelierjava.exercice_ferme.dao.RessourceDAO;
import atelierjava.exercice_ferme.entite.Ressource;
import atelierjava.exercice_ferme.exeption.PseudoExisteDejaException;
import javax.xml.bind.ValidationException;

public class JoueurService {

    public void ajouterRessource(
            long joueurid,
            Ressource.TypeRessource typeRessource,
            long quantite) {

        JoueurDAO dao = new JoueurDAO();
        Joueur joueur = dao.recherche(joueurid);

        for (int i = 0; i < quantite; i++) {
            Ressource ressource = new Ressource();
            ressource.setDesignation(typeRessource);
            ressource.setJoueur(joueur);
            joueur.getRessourcePossedees().add(ressource);

            RessourceDAO ressourceDAO = new RessourceDAO();
            ressourceDAO.ajouter(ressource);
        }
    }

    public void rejoinrdePartie(long idJoueur) {
        // Génére les ressource SI aucune ressource pour ce joueur 
        JoueurDAO dao = new JoueurDAO();
        Joueur joueur = dao.recherche(idJoueur);
        if (joueur.getRessourcePossedees().size() == 0) {
            // Ajouter nos 5 carrotes 
            this.ajouterRessource(idJoueur, Ressource.TypeRessource.CAROTTE, 5);
            this.ajouterRessource(idJoueur, Ressource.TypeRessource.BLE, 5);
            this.ajouterRessource(idJoueur, Ressource.TypeRessource.CHEVRE, 5);
            this.ajouterRessource(idJoueur, Ressource.TypeRessource.FERMIER, 2);
            // Ajouter nos 5 blés

            // Ajouter nos 5 fermiers
        }
    }

    public void inscription(String pseudo, String mdp) throws ValidationException, PseudoExisteDejaException {
        if (pseudo.length() < 3 || pseudo.length() > 8) /* Pseudo entre 3 et 8 lettre */ {
            throw new ValidationException(" L'identifiant doit contenire enrre 3 et 8 lettres ");
        }

        // Vérifier que le psuedo est encore existant
        // Erreur si si mdp <5 pu > 10
        if (!mdp.matches(".{5,10}")) {
            /* Le Mot de pzsse comporte entre 5 et 10 lettre */
            throw new RuntimeException("Une majusucle et un chiffre doit-être présent ");
        }

        if (!mdp.matches(".*[0-9].*")) {
            throw new RuntimeException("Le mot de passe requiert au moins un chiffre");
        }

        if (!mdp.matches(".*[A-Z].*")) {
            /* Il  y a au moins une lettre majucule dans la Mot de passe */
            throw new RuntimeException("Le mot de passe n'est pas valide");
            /*     .* = Veut dire qu'il peut y en avoir plusieures  */
        }

        // Verifier que le pseudo est encore didponible
        JoueurDAO dao = new JoueurDAO();
        if (dao.existe(pseudo)) {
             throw new PseudoExisteDejaException(mdp);
        }
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

    public Joueur connection(String psuedo, String mdp) {
        JoueurDAO dao = new JoueurDAO();
        Joueur j = dao.rechercher(psuedo, mdp);
        return j;

    }
}
