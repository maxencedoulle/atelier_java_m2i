package atelierjava.test;

import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Formation
 */
public class ListTest {

    @Test
    public void addOk() {
        ArrayList<String> capitales = new ArrayList<>(); // ArrayList<string>, cela siginie que tous les élémenst seront des "STRING"
        capitales.add("Paris"); // add : Ajouter un élément à une liste
        capitales.add("New York");
        capitales.add("Londres");

        for (String cap : capitales) {
            System.out.println(cap);
        }
    }

    @Test
    public void addAvecIndiceOK() {
        ArrayList<Integer> nombresPremiers = new ArrayList<>();
        nombresPremiers.add(2);
        nombresPremiers.add(5);
        int a = 2;
        int b = 5;
    }

    @Test
    public void nbPremier() {
        ArrayList<Integer> nbPremier = new ArrayList<>();
        // Evaluer le nombre de 2->100, pour chercher si premier 
        for (int i = 2; i < 100; i++) {

            boolean premier = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {

                    premier = false;
                }
            }
            if (premier == true) {
                nbPremier.add(i);
            }
        }
        System.out.println(nbPremier);
    }

    public int factoriel (int n){
        int res = n;
        for (int i = n - 1; i > 1 ; i--) {          

            res = i * res;
        }
        return res;
}
    
    @Test
    public void factorielOK () { 
        int r=factoriel(5);
        System.out.println(r);
    }
    
    @Test
    public void deleteOk () {
        ArrayList <String> prenoms = new ArrayList<> ();
        prenoms.add("Guillaume");
        prenoms.add("Thomas");
        prenoms.add("David");
        prenoms.add("Thomas");
        
        prenoms.remove("Thomas"); // Le premier renplace le premier élément 
        
        for (String prenom: prenoms) 
             
            System.out.println(prenom);
        }
    
    
    @Test
    public void couleur () {
        ArrayList <String> couleur1 = new ArrayList<> ();
        couleur1.add("Rouge");
        couleur1.add("vert");
        couleur1.add("Jaune");
        couleur1.add("Rouge");
        
        ArrayList<String> couleur2 = new ArrayList<> ();
        couleur2.add("Rouge"); 
        couleur2.add("Jaune");
        
        couleur1.removeAll(couleur2); // Fusionne les classes
        
        for (String couleur: couleur1) {
            System.out.println( couleur);
        }
     
    }
    }
