package atelierjava.exercice_ferme.entite;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Formation
 */
@Entity
public class Ressource implements Serializable {

    public enum TypeRessource {
        ANIMAL_MOUTON,
        ANIMAL_Vache,
        Culture_BLE,
        CULTURE_MAIS,
    }

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ressource)) {
            return false;
        }
        Ressource other = (Ressource) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "atelierjava.exercice_ferme.entity.Ressource[ id=" + id + " ]";
    }

}
