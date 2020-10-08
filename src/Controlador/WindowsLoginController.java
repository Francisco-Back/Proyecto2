/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Global.VentanaNew;
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
// se crea el controlador de tipo WindowsLoginController
public class WindowsLoginController implements Initializable {


    public PasswordField txtpassword;
    public TextField txtUsuario;
// se crea le metod de validacion
    public void ValidarIngreso(ActionEvent actionEvent)  {
        // validamos ingreso usuario
       if(txtUsuario.getText().equals("francisco") && txtpassword.getText().equals("123")) {
           JOptionPane.showMessageDialog(null, "Usuario correcto", "Ingreso", JOptionPane.INFORMATION_MESSAGE);
           VentanaNew.CreadorWindows("Menu", "Menu Auto Partes");
           // cerramos ventana
           Stage stageMenu=(Stage)txtUsuario.getScene().getWindow();
           stageMenu.close();
       }else{
           JOptionPane.showMessageDialog(null, "Usuario incorrecto", "error", JOptionPane.ERROR_MESSAGE);
           txtpassword.setText("");
           txtUsuario.setText("");
       }
     
            
            }

    
// se crea el metodo para salir de la vetana
    public void salir(ActionEvent actionEvent) {
        JOptionPane.showMessageDialog(null, "Gracias por Utilizar Nuestra App");
        System.exit(0);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
      }

   

}
