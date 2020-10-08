/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencia;

import Clases.Cliente;

/**
 *
 * @author Francisco Back
 */
// se crea la clase Individual que hereda de Cliente
public class Individual extends Cliente {
// se crea los atributos
    private String Dpi;
    private int Descuento;
    
    // se crea el metodo constructor
    public Individual(String Dpi, int Descuento, int IdCliente, String NombreCliente, String Codigo, String Empresa, String Funcion) {
        super(IdCliente, NombreCliente, Codigo, Empresa, Funcion);
        this.Dpi = Dpi;
        this.Descuento = Descuento;
    }
//se crea los metodos get y set
    public Individual( int IdCliente) {
        super(IdCliente);
       
    }
    

    public String getDpi() {
        return Dpi;
    }

    public void setDpi(String Dpi) {
        this.Dpi = Dpi;
    }

    public int getDescuento() {
        return Descuento;
    }

    public void setDescuento(int Descuento) {
        this.Descuento = Descuento;
    }
//se crea el metodo toString
    @Override
    public String toString() {
        return  "Individual{" + "Dpi=" + Dpi + ", Descuento=" + Descuento + '}'+super.toString(); 
    }

    

   
   

}
