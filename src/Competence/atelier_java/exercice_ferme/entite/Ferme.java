
package competence.atelier_java.exercice_ferme.entite;

import java.util.ArrayList;

/**
 *
 * @author Formation
 */
public class Ferme {
    private String motDePasse;

    public String getMotDePasse() {
        return motDePasse;
    }

    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }
    private double budget;
    private String nom;
    private ArrayList<Terrain> terrains = new ArrayList <> ();
    private ArrayList<Ressource> ressourcePossede= new ArrayList <> ();

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public ArrayList<Terrain> getTerrains() {
        return terrains;
    }

    public void setTerrains(ArrayList<Terrain> terrains) {
        this.terrains = terrains;
    }

    public ArrayList<Ressource> getRessourcePossede() {
        return ressourcePossede;
    }

    public void setRessourcePossede(ArrayList<Ressource> ressourcePossede) {
        this.ressourcePossede = ressourcePossede;
    }
    
    
    
} 