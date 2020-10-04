/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Clases.Cliente;
import Clases.Producto;
import Clases.Utileria;

/**
 *
 * @author Francisco Back
 */
public class ItemOrden {
    private int Nolinea;
    private int Cantidad;
    Producto producto;

    int aux=2000;

    public static int sigIdOrden(int pNolinea,int aux) {
         return aux + pNolinea;
    }

    public ItemOrden(int pNolinea) {
       Cliente.sigIdCliente(pNolinea,aux);
       aux=pNolinea;
        this.Nolinea = pNolinea;
    }
    public ItemOrden(int pNolinea, int pCantidad, int pldproducto) {
       this(pNolinea);
       Cantidad = pCantidad;
       pldproducto=producto.getIdProducto();
    }

    public int getNolinea() {
        return Nolinea;
    }

    public void setNolinea(int Nolinea) {
        this.Nolinea = Nolinea;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }
    
    public int TotalItem(){
        return producto.getPrecio()*Cantidad;
    }

    @Override
    public String toString() {
        Utileria utileria=new Utileria();
        return "["+utileria.getNombreClase(this.getClass().getName())+"]" + "Nolinea=" + Nolinea + ", Cantidad=" + Cantidad + ", producto=" + producto + '}';
    }
    
    
    
    
    
}
