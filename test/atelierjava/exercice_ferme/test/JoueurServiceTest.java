
package atelierjava.exercice_ferme.test;

import atelierjava.exercice_ferme.service.JoueurService1;
import org.junit.Test;


/**
 *
 * @author Formation
 */
public class JoueurServiceTest {
    
    @Test 
    public void inscriptionOK () {
        JoueurService1 FermeService = new JoueurService1();
        FermeService.inscription("abcd", "A1aa123");
    }
    
    @Test (expected = RuntimeException.class)
    public void inscriptionKO () {
        JoueurService1 FermeService = new JoueurService1();
        FermeService.inscription("abcd","a3");
        
    
    }
}
 