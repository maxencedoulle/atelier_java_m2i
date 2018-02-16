
package Competence.Atelier.exercice_ferme;

import java.util.ArrayList;

/**
 *
 * @author Formation
 */
public class Terrain {
    private double tailleEnHa;
    private ArrayList<Ressource> ressourcesContenue = new ArrayList<>();

    public double getTailleEnHa() {
        return tailleEnHa;
    }

    public void setTailleEnHa(double tailleEnHa) {
        this.tailleEnHa = tailleEnHa;
    }

    public ArrayList<Ressource> getRessourcesContenue() {
        return ressourcesContenue;
    }

    public void setRessourcesContenue(ArrayList<Ressource> ressourcesContenue) {
        this.ressourcesContenue = ressourcesContenue;
    }
    
    
    
    
 
}