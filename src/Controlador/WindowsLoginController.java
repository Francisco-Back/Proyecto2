/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.property.ObjectProperty;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author Francisco Back
 */
public class WindowsLoginController implements Initializable {


    public PasswordField txtpassword;
    public TextField txtUsuario;

    public void ValidarIngreso(ActionEvent actionEvent) {
        
       if(txtUsuario.getText().equals("francisco") && txtpassword.getText().equals("123")) {
           JOptionPane.showMessageDialog(null, "Usuario correcto", "Ingreso", JOptionPane.INFORMATION_MESSAGE);
       }else{
           JOptionPane.showMessageDialog(null, "Usuario incorrecto", "error", JOptionPane.ERROR_MESSAGE);
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
