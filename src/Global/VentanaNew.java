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
public class VentanaNew {
    
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
         stage.initStyle(StageStyle.UTILITY);
         stage.setScene(scene);
         
        
         stage.show();
            }catch(IOException e){
            e.printStackTrace();
        }
    }
    
    
}
