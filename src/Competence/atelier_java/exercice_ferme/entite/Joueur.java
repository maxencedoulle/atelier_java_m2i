
package competence.atelier_java.exercice_ferme.entite;

import java.util.ArrayList;

/**
 *
 * @author Formation
 */
public class Joueur {
    private String motDePasse;

    public String getMotDePasse() {
        return motDePasse;
    }

    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }
    private double budget;
    private String pseudo;
    private ArrayList<Terrain> terrains = new ArrayList <> ();
    private ArrayList<Ressource> ressourcePossede= new ArrayList <> ();

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public String getPseudo() {
        return pseudo;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
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

    public void add(Joueur joueur) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
} 