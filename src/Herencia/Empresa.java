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
public class Empresa extends Cliente{
    private String Contacto;
    private int Descuento;

    public Empresa(String Contacto, int Descuento, int IdCliente, String NombreCliente, String Codigo, String Empresa, String Funcion) {
        super(IdCliente, NombreCliente, Codigo, Empresa, Funcion);
        this.Contacto = Contacto;
        this.Descuento = Descuento;
    }

    public String getContacto() {
        return Contacto;
    }

    public void setContacto(String Contacto) {
        this.Contacto = Contacto;
    }

    public int getDescuento() {
        return Descuento;
    }

    public void setDescuento(int Descuento) {
        this.Descuento = Descuento;
    }



    @Override
    public String toString() {
        return "Empresa{" + "Contacto=" + Contacto + ", Descuento=" + Descuento + '}'+super.toString();
    }

   

    

  

   

  


    
   
    
    
}
