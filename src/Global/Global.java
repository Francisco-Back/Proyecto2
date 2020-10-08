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
// se crea un clase Global para almacenar crea objetos
public class Global {
    
    // metodo que agrega un elemento  nuevo a arrayList
       public static void Ingreso(Cliente e){
             
          DataSistema.Array1().add(e);
          
    }
        // metodo que agrega un elemento  nuevo a arrayList
        public static void Ingreso2(Cliente e){
             
          DataSistema.Array2().add(e);
          
    }
         // metodo que agrega un elemento  nuevo a arrayList
        public static void IngresoPro(Producto e){
             
          DataSistema.Arrayp1().add(e);
          
    }

  
       
       
      
       
}
