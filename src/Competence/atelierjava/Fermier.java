
package competence.atelierjava;


public class Fermier {
    private String Nom;
    private String Prenom;
    private String Specialite;

    
    // Insertion des Gets et des Sets 
    public String getNom() {
        return Nom;
    }
    public void setNom(String Nom) {
        this.Nom = Nom;
    }
    public String getPrenom() {
        return Prenom;
    }
    public void setPrenom(String Prenom) {
        this.Prenom = Prenom;
    }
    public String getSpecialite() {
        return Specialite;
    }
    public void setSpecialite(String Specialite) {
        this.Specialite = Specialite;
    } // clique droit / insert code / Override Methode / To string 

    @Override
    public String toString() {
        return this.Nom + ", "+ this.Prenom +", "+ this.Specialite; // ATTENTION : Enlever le "super.ToSring"
    }
    
   
    
}