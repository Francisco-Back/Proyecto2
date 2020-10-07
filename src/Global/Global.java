/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Global;

import Clases.Cliente;
import Data.DataSistema;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 *
 * @author uservit37
 */
public class Global {
    
    
       public static void ingreso(Cliente e){
             
          DataSistema.Array1().add(e);
          
    }

  
       
       
      
       
}
