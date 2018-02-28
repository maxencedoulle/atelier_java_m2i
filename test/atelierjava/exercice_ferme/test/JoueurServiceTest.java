package atelierjava.exercice_ferme.test;

import atelierjava.exercice_ferme.entite.Joueur;
import atelierjava.exercice_ferme.exeption.PseudoExisteDejaException;
import atelierjava.exercice_ferme.service.JoueurService;
import javax.xml.bind.ValidationException;
import org.junit.Test;

/**
 *
 * @author Formation
 */
public class JoueurServiceTest {
    
    @Test 
    public void rejoindrePartieOK() throws ValidationException, PseudoExisteDejaException{
        JoueurService service = new JoueurService();
        service.inscription("vince", "Bourg5");
        Joueur joueur = service.connection("vince", "Bourg5");
        service.rejoinrdePartie( joueur.getId ());
    }

    @Test
    public void inscriptionOK() throws ValidationException, PseudoExisteDejaException {
        JoueurService FermeService = new JoueurService();
        FermeService.inscription("abcd", "A1aa123");
    }

    @Test(expected = RuntimeException.class)
    public void inscriptionKO() throws ValidationException, PseudoExisteDejaException {
        JoueurService FermeService = new JoueurService();
        FermeService.inscription("abcd", "a3");
    }

    @Test(expected = RuntimeException.class)
    public void connectionKO() {
        // 1. Inscrire util
        JoueurService service = new JoueurService();
        service.connection("Maxence", "123456789");
    }

    @Test
    public void connexionOK() throws ValidationException, PseudoExisteDejaException {
        // 1. Inscrire util
        JoueurService service = new JoueurService();
        service.inscription("Maxence", "Doul123");

        // 2. Connexion avec son login et son mdp
        service.connection("Maxence", "Doul123");
    }
}
