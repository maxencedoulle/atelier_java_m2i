
package Competence.Atelier.exercice_ferme.entite;

/**
 *
 * @author Formation
 */
public class Ressource {
    public enum TypeRessource {
        ANIMAL_MOUTON, 
        ANIMAL_Vache,
        Culture_BLE, 
        CULTURE_MAIS,
    }
    
    private TypeRessource designation;
    private String nom;

    public TypeRessource getDesignation() {
        return designation;
    }

    public void setDesignation(TypeRessource designation) {
        this.designation = designation;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    
    
    
}