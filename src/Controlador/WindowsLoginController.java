/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.property.ObjectProperty;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author Francisco Back
 */
public class WindowsLoginController implements Initializable {


    public PasswordField txtpassword;
    public TextField txtUsuario;

    public void ValidarIngreso(ActionEvent actionEvent)  {
        
       if(txtUsuario.getText().equals("francisco") && txtpassword.getText().equals("123")) {
           JOptionPane.showMessageDialog(null, "Usuario correcto", "Ingreso", JOptionPane.INFORMATION_MESSAGE);
             FXMLLoader loader=new FXMLLoader();
        loader.setLocation(Main.class.getResource("/Ventanas/Menu.fxml")); 
        try{
        Pane ventana=(Pane) loader.load();
        Stage stage=new Stage();
          stage.setTitle("Menu Auto Partes");
         Scene scene = new Scene(ventana);
         stage.setScene(scene);
         
         stage.show();
            }catch(IOException e){
            e.printStackTrace();
        }
       }else{
           JOptionPane.showMessageDialog(null, "Usuario incorrecto", "error", JOptionPane.ERROR_MESSAGE);
           txtpassword.setText("");
           txtUsuario.setText("");
       }
     
            
            }

    

    public void salir(ActionEvent actionEvent) {
        JOptionPane.showMessageDialog(null, "Gracias por Utilizar Nuestra App");
        System.exit(0);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
      }

   

}
