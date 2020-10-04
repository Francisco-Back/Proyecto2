/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Clases.Cliente;
import Clases.Producto;
import Herencia.Empresa;
import Herencia.Individual;
import java.util.ArrayList;


/**
 *
 * @author Francisco Back
 */
public class DataSistema {
    public static ArrayList<Cliente> Array1(){
          ArrayList<Cliente> Arrcliente = new ArrayList<>();
        Arrcliente.add(new Individual("2548794565845",5,0,"Francisco Back","5645","Acabados","Compras"));
        Arrcliente.add(new Individual("2564876425465",5,1,"Edgar Lopez","5478","Mecanica","Compras"));
        Arrcliente.add(new Individual("2256484648465",5,1,"Juan Chulc","6897","Distribuidor","Compras"));
        Arrcliente.add(new Individual("2542546758349",5,1,"Pedro Alvarado","2546","Banco","Compras"));
        Arrcliente.add(new Empresa("Servicel Guatemala",10,1,"Flor Garcia","7894","Servicel","Compras"));
        Arrcliente.add(new Empresa("The People Company",10,1,"Carlos Reyes","5464","Reparto","Compras"));
        Arrcliente.add(new Empresa("Azteca Partes",10,1,"Carlos Salay","6938","Logistica","Compras"));
        Arrcliente.add(new Empresa("Proyection Shock Guatemala",10,1,"Marcos Lopez","1247","Envio","Compras"));
        return Arrcliente;
    }

public static ArrayList<Producto> Array2(){
    
    ArrayList<Producto> Arrproducto=new ArrayList<>();
    Arrproducto.add(new Producto(1,"Disco de Freno","12345","Bajaj","Moto"));
    Arrproducto.add(new Producto(1,"Cable de freno","13546","Bajaj","Moto"));
    Arrproducto.add(new Producto(1,"Liquido de freno","36589","Bajaj","Moto"));
    Arrproducto.add(new Producto(1,"Pastilla de freno","35798","Mazda","Carro"));
    Arrproducto.add(new Producto(1,"Aceite de motor","54789","Toyota","Carro"));
    Arrproducto.add(new Producto(1,"LLantas de moto","36547","Bajaj","Moto"));
    Arrproducto.add(new Producto(1,"llanta de Carro","56789","Suzuki","Carro"));
    Arrproducto.add(new Producto(1,"Filtro de Aceite","5698","Mazda","Carro"));
        return Arrproducto;

}
}
