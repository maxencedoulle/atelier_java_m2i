
package atelierjava.exercice_ferme.view;

import atelierjava.exercice_ferme.service.JoueurService;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;

/**
 *
 * @author Formation
 */
public class ConnectionView extends GridPane{
    private Label lPseudo = new Label(" Pseudo");
    private TextField tpseudo = new TextField();
    private Label lmdp = new Label (" Mot de passe");
    private PasswordField pfmdp = new PasswordField();
    private Button bconnection = new Button (" Connexion ");
    
    public ConnectionView (BorderPane BorderPaneDuParents) {
        // Place des composants dans ma vue 
        this.add (lPseudo, 0, 0);
        this.add (tpseudo, 1, 0);
        this.add(lmdp, 0, 1);
        this.add(pfmdp, 1, 1);
        this.add(bconnection, 1, 2);
        // Récupère le pseudo et mdp entrée de l'utilisateur 
        bconnection.setOnAction(e -> {
            try { 
                // Récupère le psuedo et mdp entré par l'utilisateur 
                String pseudoEntre = tpseudo.getText();
                String mdpEntre = pfmdp.getText();
                // Appel du service de connecxion
                JoueurService service = new JoueurService();
                service.connection(pseudoEntre, mdpEntre);
                // Affiche l'écran de jeu
                BorderPaneDuParents.setCenter(new EcranJeuView());
            } catch (Exception Exemption) {  // Connexion échoué 
                Alert alert = new Alert (Alert.AlertType.WARNING);
                alert.setContentText("Conncetion échoué");
                alert.setHeaderText(Exemption.getMessage());
                
                Exemption.printStackTrace();
                
                alert.showAndWait();
            }
        });
    }
}
