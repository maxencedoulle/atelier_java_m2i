
package Ferme;

import com.sun.org.apache.xpath.internal.compiler.PsuedoNames;

/**
 *
 * @author Formation
 */
public class FermeService {
    /**
     * Pseudo
     * - mini 3 lettres, maxi 8
     * - unique
     * MDP : mini 5 lettres, maxi 10
     * - au moins une Mal et un chiifre 
     * @param pseudo
     * @param mdp 
     */
    public void inscription (String pseudo, String mdp) {
        if (pseudo.length () <3 || pseudo.length() >8)
            throw new RuntimeException (" Regarde les consignes imbéciles");
            
        if (mdp.length() <5 || mdp.length() >10)
            throw new RuntimeException (" Regarde les consignes imbéciles");
    }
    
}