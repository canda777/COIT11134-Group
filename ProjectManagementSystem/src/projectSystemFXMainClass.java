/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */

//Imports
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

//Made by Kai Mitchell (12160908), Francis Renzaho (12170110), Carlos Gomez Mendez-12116658 COIT11134 Assignment 3B
//This class runs the application
public class projectSystemFXMainClass extends Application {
    @Override
    public void start(Stage stage) {
        try{//try to load main menu as start scene
            Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (IOException ex) {
            Logger.getLogger(projectSystemFXMainClass.class.getName()).log(Level.SEVERE, null, ex);
        }        
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
        
    }
    
}
