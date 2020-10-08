/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Global;

import Clases.Cliente;
import Clases.Producto;
import Data.DataSistema;


/**
 *
 * @author uservit37
 */
public class Global {
    
    
       public static void Ingreso(Cliente e){
             
          DataSistema.Array1().add(e);
          
    }
        public static void Ingreso2(Cliente e){
             
          DataSistema.Array2().add(e);
          
    }
        public static void IngresoPro(Producto e){
             
          DataSistema.Arrayp1().add(e);
          
    }

  
       
       
      
       
}
