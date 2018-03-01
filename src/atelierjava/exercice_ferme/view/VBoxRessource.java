/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atelierjava.exercice_ferme.view;

import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;

/**
 *
 * @author Formation
 */
public class VBoxRessource extends VBox{
    private Label lNbRessource = new Label ("0");
    private ImageView iImages = new ImageView ("file:C:\\Users\\Formation.M2I-JAV5-04\\Documents\\NetBeansProjects\\atelier_java_m2i\\images\\ble.jpeg");

    public VBoxRessource(long nbRessource, String urlImages) {
        
        this.iImages = new ImageView(urlImages);
        
        this.iImages.setFitWidth(150);
        this.iImages.setPreserveRatio(true);
        this.getChildren().add(this.iImages);
        this.getChildren().add(this.lNbRessource);
    }
    
    
}
