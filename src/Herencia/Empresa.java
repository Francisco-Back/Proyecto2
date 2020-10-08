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
 * 
 */
// se crea la clase empresa que hereda de Cliente
public class Empresa extends Cliente{
    private String Dpi;
    private int Descuento;
// se crea el metodo constructor con los atibutos de la clase super
        public Empresa(String Dpi, int Descuento, int IdCliente, String NombreCliente, String Codigo, String Empresa, String Funcion) {
        super(IdCliente, NombreCliente, Codigo, Empresa, Funcion);
        this.Dpi = Dpi;
        this.Descuento = Descuento;
    }
        // se crea lso metodos get y set

    public String getDpi() {
        return Dpi;
    }

    public void getDpi(String Dpi) {
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
        return "Empresa{" + "Contacto=" + Dpi + ", Descuento=" + Descuento + '}'+super.toString();
    }

   

    

  

   

  


    
   
    
    
}
