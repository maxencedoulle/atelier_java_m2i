
package Competence.Atelier;

/**
 *
 * @author Formation
 */
public class Animal {
    
    static int nbAnimaux; // static : propre à la class 
    
    String genre;
    String espece;
    int tailleEnCm;
    double poidsEnKg;
    
//    public void afficher (){ // Function affichage 
//        System.out.println(this.espece + ", " + this.genre + ", " + this.poidsEnKg + ", " + this.tailleEnCm);
//
//    } 

    @Override
    public String toString() {
        return this.espece + ", " + this.genre + ", " + this.poidsEnKg + ", " + this.tailleEnCm;
    }
    
    public Animal () {
        nbAnimaux ++; 
    }
}

