/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Clases.Cliente;
import Clases.Producto;
import static Data.DataSistema.Array1;
import Herencia.Empresa;
import Herencia.Individual;
import java.util.ArrayList;


/**
 *
 * @author Francisco Back
 * 
 */
// se crea la clase DataSistema 
public class DataSistema {
  
    // se crea los arraylist de tipo stactic y se retorna su valor
    public static ArrayList<Cliente> Array1(){
          ArrayList<Cliente> Arrcliente = new ArrayList<>();
        Arrcliente.add(new Individual("2548794565845",5,1,"Francisco Back","5645","Acabados","Compras"));
        Arrcliente.add(new Individual("2564876425465",5,1,"Edgar Lopez","5478","Mecanica","Compras"));
        Arrcliente.add(new Individual("2256484648465",5,1,"Juan Chulc","6897","Distribuidor","Compras"));
        Arrcliente.add(new Individual("2542546758349",5,1,"Pedro Alvarado","2546","Banco","Compras"));
        Arrcliente.add(new Individual("2542546758349",5,1,"Pedro Alvarado","2546","Banco","Compras"));
        
        return Arrcliente;
    }
  // se crea los arraylist de tipo stactic y se retorna su valor
    
     public static ArrayList<Cliente> Array2(){
          ArrayList<Cliente> Arrcliente = new ArrayList<>();
        Arrcliente.add(new Empresa("Servicel Guatemala",10,1,"Flor Garcia","7894","Servicel","Compras"));
        Arrcliente.add(new Empresa("The People Company",10,1,"Carlos Reyes","5464","Reparto","Compras"));
        Arrcliente.add(new Empresa("Azteca Partes",10,1,"Carlos Salay","6938","Logistica","Compras"));
        Arrcliente.add(new Empresa("Proyection Shock Guatemala",10,1,"Marcos Lopez","1247","Envio","Compras"));
        return Arrcliente;
    }
       // se crea los arraylist de tipo stactic y se retorna su valor
         

public static ArrayList<Producto> Arrayp1(){
    
    ArrayList<Producto> Arrproducto=new ArrayList<>();
    Arrproducto.add(new Producto(1,"Disco de Freno","12345","Bajaj","Moto",500));
    Arrproducto.add(new Producto(1,"Cable de freno","13546","Bajaj","Moto",600));
    Arrproducto.add(new Producto(1,"Liquido de freno","36589","Bajaj","Moto",1000));
    Arrproducto.add(new Producto(1,"Pastilla de freno","35798","Mazda","Carro",650));
    Arrproducto.add(new Producto(1,"Aceite de motor","54789","Toyota","Carro",1547));
    Arrproducto.add(new Producto(1,"LLantas de moto","36547","Bajaj","Moto",2547));
    Arrproducto.add(new Producto(1,"llanta de Carro","56789","Suzuki","Carro",2548));
    Arrproducto.add(new Producto(1,"Filtro de Aceite","5698","Mazda","Carro",258));
        return Arrproducto;

}
 // se crea los arraylist de tipo stactic y se retorna su valor
     public static ArrayList<Cliente> Todos(){
          ArrayList<Cliente> Todos = new ArrayList<>();
     Todos.addAll(DataSistema.Array1());
     Todos.addAll(DataSistema.Array2());
        return Todos;
    }
      
/*
public static ArrayList<Orden> ArrayO1(){
    
    ArrayList<Orden> ArrOrden=new ArrayList<>();
    ArrOrden.add(new Orden());
    ArrOrden.add(new Orden(1,;
        return ArrOrden;

}*/
}
