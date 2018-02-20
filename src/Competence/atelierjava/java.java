package competence.atelierjava;

import java.util.ArrayList;

public class java {

    public static void mainAnimaux(String[] args) {

        Animal a1 = new Animal(); // Bien le mettre dans la fonction 
        Animal a2 = new Animal();

//        // Création du cochon et de la girafe 
//        a1.poidsEnKg = 12;
//        a1.espece = "cochon";
//
//        a2.poidsEnKg = 15;
//        a2.espece = "girafe";
        // Affichage caract des 2 bestioles 
        System.out.println(a1);
        System.out.println("Total :  " + Animal.nbAnimaux);
    }

    
    
    public static void mainFerme(String[] args) {
        Fermier ferrmier1 = new Fermier();
        ferrmier1.setNom("Brenard");
        ferrmier1.setPrenom("Doullé");
        ferrmier1.setSpecialite("Vigneron");
       
        System.out.println(ferrmier1);
    }

    
    
    public static void mainVerStatique(String[] args) {
        Personne perso1 = new Personne();
        perso1.setNom("Obama");
        perso1.setAge(56);

        Personne perso2 = new Personne();
        perso2.setNom("Churchill");
        perso2.setAge(90);

        Personne perso3 = new Personne();
        perso3.setNom("Trump");
        perso3.setAge(70);

        System.out.println("Age-mini : " + Personne.getAgeMin() + "Age-maxi" + Personne.getAgeMaxi());
    }
    
    public static void main(String[] args) {
        ArrayList<String> liste = new ArrayList <> ();
        liste.add("Bleue");
        liste.add("Blanc");
        liste.add("Rouge"); // Il faut dansser les francais 
        
        // Afficher avec la boucle chauqe élément de la boucle 
        for (int i=0 ; i<liste.size() ; i++) {
            System.out.println( liste.get(i) );
        }
        // For verssion Moderne 
        for (String couleur : liste ){
            System.out.println(couleur);
        }
    }
}
