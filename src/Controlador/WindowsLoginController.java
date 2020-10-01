/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import static java.lang.System.exit;
import java.net.URL;
import java.util.ResourceBundle;
import static javafx.application.Platform.exit;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javax.swing.JOptionPane;
import static jdk.nashorn.internal.objects.Global.exit;


/**
 * FXML Controller class
 *
 * @author Francisco Back
 */
public class WindowsLoginController implements Initializable {

     public TextField Ingreso;
     public PasswordField password;
     
     public void ValidarIngreso(ActionEvent actionEvent ){
         
             JOptionPane.showMessageDialog(null, "si funciona el ingreso");
        
         
     }
     public void salir(ActionEvent actionEvent){
           JOptionPane.showMessageDialog(null, "Gracias por Utilizar Nuestra App");
         System.exit(0);
     }
      @Override
    public void initialize(URL url, ResourceBundle rb) {
     
    }   
          @FXML
    private Label label;
    
     }
     
     
    

