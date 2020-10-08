/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Global;

import Controlador.Main;
import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 *
 * @author Francisco Back
 */
// se crea la clase ventanas 
public class VentanaNew {
    // se crea el metodo  para poder realizar multiples ventanas si necesidad de reescribir el codigo 
    public static void CreadorWindows(String NombreV, String Titulo){
              try{
                  //
             FXMLLoader loader=new FXMLLoader();
        loader.setLocation(Main.class.getResource("/Ventanas/"+NombreV+".fxml")); 
            // se inicia la nueva ventana
        Pane ventana=(Pane) loader.load();
        Stage stage=new Stage();
          stage.setTitle(Titulo);
         Scene scene = new Scene(ventana);
        
         stage.setScene(scene);
         
        
         stage.show();
            }catch(IOException e){
            e.printStackTrace();
        }
    }
    
    // se crea un metod nuevo probando un tipo de estilo para ventanas
    public static void CreadorWindowsInterno(String NombreV, String Titulo){
              try{
                  //
             FXMLLoader loader=new FXMLLoader();
        loader.setLocation(Main.class.getResource("/Ventanas/"+NombreV+".fxml")); 
            // se inicia la nueva ventana
        Pane ventana=(Pane) loader.load();
        Stage stage=new Stage();
          stage.setTitle(Titulo);
         Scene scene = new Scene(ventana);
         stage.initStyle(StageStyle.UNDECORATED);
         stage.setScene(scene);
         
        
         stage.show();
            }catch(IOException e){
            e.printStackTrace();
        }
    }
    
    
}//fin de clase
