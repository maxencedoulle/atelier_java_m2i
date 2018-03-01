/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atelierjava.exercice_ferme.view;

import javafx.scene.layout.GridPane;

/**
 *
 * @author Formation
 */
public class EcranJeuView extends GridPane{
    private VBoxRessource vbrCaroote = new VBoxRessource (0, "file:C:\\Users\\Formation.M2I-JAV5-04\\Documents\\NetBeansProjects\\atelier_java_m2i\\images\\carootes.jpeg");
    private VBoxRessource vbBle = new VBoxRessource(0, "file:C:\\Users\\Formation.M2I-JAV5-04\\Documents\\NetBeansProjects\\atelier_java_m2i\\images\\ble.jpeg");
    private VBoxRessource VBChevre = new VBoxRessource(0, "file:C:\\Users\\Formation.M2I-JAV5-04\\Documents\\NetBeansProjects\\atelier_java_m2i\\images\\chevre.png");
    private VBoxRessource VBFromage = new VBoxRessource(0, "file:C:\\Users\\Formation.M2I-JAV5-04\\Documents\\NetBeansProjects\\atelier_java_m2i\\images\\fromage.png");
    private VBoxRessource VBFermiere = new VBoxRessource(0, "file:C:\\Users\\Formation.M2I-JAV5-04\\Documents\\NetBeansProjects\\atelier_java_m2i\\images\\paysage_ferme.jpeg");
    
    public EcranJeuView () {
        this.add(vbrCaroote, 0, 0);
        this.add(VBChevre, 1, 0);
        this.add(VBFermiere, 2, 0);
        this.add(VBFromage, 3, 0);
        this.add(vbBle, 4, 0);
    }
}
