
package atelierjava.exercice_ferme.test;

import atelierjava.exercice_ferme.service.FermeService1;
import org.junit.Test;


/**
 *
 * @author Formation
 */
public class FermeServiceTest {
    
    @Test 
    public void inscriptionOK () {
        FermeService1 FermeService = new FermeService1();
        FermeService.inscription("abcd", "A1aa123");
    }
    
    @Test (expected = RuntimeException.class)
    public void inscriptionKO () {
        FermeService1 FermeService = new FermeService1();
        FermeService.inscription("abcd","a3");
        
    
    }
}
 