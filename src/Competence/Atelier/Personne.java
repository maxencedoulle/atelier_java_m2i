package Competence.Atelier;

public class Personne {

    private String nom;
    private int age;
    // nombre précis = bit

    //
    static private int ageMin = -1;
    static private int ageMaxi = 0;

    // Inclusion des Gets et des Sets
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;

        // Met à jour ageMaxi si age > ageMaxi
        if (age > Personne.ageMaxi) {
            Personne.ageMaxi = age;
        }
        
        // Maj ageMini SI age=-1
        // OU age<ageMini
        if ( Personne.ageMin==-1 ) {
             Personne.ageMin=age;
        }
        if ( age<Personne.ageMin)
            Personne.ageMin=age;
        }
        

    // Instancion des get de ageMani et de ageMaxi
    public static int getAgeMin() {
        return ageMin;
    }

    public static int getAgeMaxi() {
        return ageMaxi;
    }
}



