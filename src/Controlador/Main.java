/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Root;
import java.awt.Image;
import java.io.IOException;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;





 // se crea le metodo main que da vida al programa
public class Main extends Application {

    // se hereda de application y se crea un instancia de tipo scene 
  @Override
    public void start(Stage stage) throws Exception {
        
        FXMLLoader loader=new FXMLLoader();
        loader.setLocation(Main.class.getResource("/Ventanas/WindowsLogin.fxml")); 
        Pane ventana=(Pane) loader.load();
       
          stage.setTitle("Auto Partes");
         Scene scene = new Scene(ventana);
         stage.setScene(scene);
         
         stage.show();
         
     
    }
    // se crea el lanzado de la ventana
 
    public static void main(String[] args) {
        launch(args);
       
    }

   
 
}

