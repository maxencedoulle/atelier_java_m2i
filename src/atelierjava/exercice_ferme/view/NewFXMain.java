
package atelierjava.exercice_ferme.view;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Formation
 */
public class NewFXMain extends Application {
    
    private Button bInsctiption = new Button("Incription");
    private Button bConnexion = new Button (" Conection");
    
    @Override
    public void start(Stage primaryStage) {
        
        BorderPane root = new BorderPane ();
        HBox hbox = new HBox();
        hbox.getChildren().add( bInsctiption);
        hbox.getChildren().add( bConnexion );
        
        bInsctiption.setOnAction(  e -> {
            root.setTop(new IncrisptionView(root));
        } );
   
        root.setTop (hbox);
        root.setBottom(new Label("Copyright 2018 M2I"));
       
        Scene scene = new Scene(root, 600, 250);
        
        primaryStage.setTitle(" Celui qui lis ce message est un imbécile ");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
