/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author Francisco Back
 */
public class Producto {
     private int IdProducto;
    private String NombreParte;
    private String Codigo;
    private String Marca;
    private String Funcion;
    private int precio;
    
    
      int aux=2000;

    public static int sigIdProducto(int IdProducto,int aux) {
         return aux + IdProducto;
    }

    public Producto(int IdProducto) {
       Cliente.sigIdCliente(IdProducto,aux);
       aux=IdProducto;
        this.IdProducto = IdProducto;
    }

    public Producto(int IdProducto, String NombreParte, String Codigo, String Marca, String Funcion,int precio) {
        this(IdProducto);
        this.IdProducto = IdProducto;
        this.NombreParte = NombreParte;
        this.Codigo = Codigo;
        this.Marca = Marca;
        this.Funcion = Funcion;
        this.precio=precio;
       }

    public int getIdProducto() {
        return IdProducto;
    }

    public void setIdProducto(int IdProducto) {
        this.IdProducto = IdProducto;
    }


    public String getNombreParte() {
        return NombreParte;
    }

    public void setNombreParte(String NombreParte) {
        this.NombreParte = NombreParte;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getFuncion() {
        return Funcion;
    }

    public void setFuncion(String Funcion) {
        this.Funcion = Funcion;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    

    @Override
    public String toString() {
        Utileria utileria=new Utileria();
        return "["+utileria.getNombreClase(this.getClass().getSimpleName())+"]" + "IdProducto=" + IdProducto + ", NombreParte=" + NombreParte + ", Codigo=" + Codigo + ", Marca=" + Marca + ", Funcion=" + Funcion + ", aux=" + aux + ",Precio"+precio;
    }
    
    
    
}