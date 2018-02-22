package atelierjava.exercice_ferme.test;

import atelierjava.exercice_ferme.service.JoueurService;
import org.junit.Test;

/**
 *
 * @author Formation
 */
public class JoueurServiceTest {

    @Test
    public void inscriptionOK() {
        JoueurService FermeService = new JoueurService();
        FermeService.inscription("abcd", "A1aa123");
    }

    @Test(expected = RuntimeException.class)
    public void inscriptionKO() {
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
    public void connexionOK() {
        // 1. Inscrire util
        JoueurService service = new JoueurService();
        service.inscription("Maxence", "Doul123");

        // 2. Connexion avec son login et son mdp
        service.connection("Maxence", "Doul123");
    }
}
