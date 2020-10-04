/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Clases.Cliente;
import Herencia.Empresa;
import Herencia.Individual;
import java.util.ArrayList;


/**
 *
 * @author Francisco Back
 */
public class DataSistema {
    public static ArrayList<Cliente> Array(){
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
}
