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
public class IncrisptionView extends GridPane {
    
    private Label lPseudo = new Label("Pseudo");
    private TextField tfpseudo = new TextField();
    private Label lMdp = new Label("Mot de passe");
    private PasswordField pfMdp = new PasswordField();
    private Button bInscription = new Button(" Inscirption");
    
    public IncrisptionView(BorderPane borderPaneDuParents) {
        // Place des composants dans ma vue
        this.add(lPseudo, 0, 0);
        this.add(tfpseudo, 1, 0);
        this.add(lMdp, 0, 1);
        this.add(pfMdp, 1, 1);
        this.add(bInscription, 1, 2);
        
        // Définir mon contrôleurs  sur le clic bouton
        bInscription.setOnAction(e -> {
            try {
        // Récupère le pseudo et mdp entrée par l'utilisateur 
            String pseudoEntre = pfMdp.getText();
            String mdpEntre = pfMdp.getText();
        // Appel du service d'inscriptions 
            JoueurService service = new JoueurService();
            service.inscription(pseudoEntre, mdpEntre);
         // Renplace le centre du parent par un texte vide 
            borderPaneDuParents.setCenter(new Label ("Inscrptions réussie") );
            }catch(Exception Exeption) {
                Alert alert = new Alert (Alert.AlertType.WARNING);
                alert.setTitle("Erreur");
                alert.setHeaderText("Il s'est produit une erreur");
                alert.setContentText(Exeption.getMessage());
                
                alert.showAndWait();
            }
            
        });
        
        
    }
    
}









