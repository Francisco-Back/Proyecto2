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
//se crea la clase producto
public class Producto {
    // se crea los atributos

    public static int correlativoCodigo = 2000;
    private int IdProducto;
    private String NombreParte;
    private String Codigo;
    private String Marca;
    private String Funcion;
    private int precio;

    // se instancian los metodos constructores   

    public Producto(int IdProducto) {
        this.IdProducto = 0;
    }

    public Producto() {
        this.IdProducto = 0;
        this.NombreParte = "";
        this.Codigo = "";
        this.Marca = "";
        this.Funcion = "";
        this.precio = 0;
    }

    public Producto(int IdProducto, String NombreParte, String Codigo, String Marca, String Funcion, int precio) {
        this.IdProducto = correlativoCodigo++;
        this.NombreParte = NombreParte;
        this.Codigo = Codigo;
        this.Marca = Marca;
        this.Funcion = Funcion;
        this.precio = precio;
    }
// se crean lso metodos get y set de la clase
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
// se sobreescribe el metodo toString
    @Override
    public String toString() {
        Utileria utileria = new Utileria();
        return "[" + utileria.getNombreClase(this.getClass().getSimpleName()) + "]" + "IdProducto=" + IdProducto + ", NombreParte=" + NombreParte + ", Codigo=" + Codigo + ", Marca=" + Marca + ", Funcion=" + Funcion + ", aux=" + aux + ",Precio" + precio;
    }

}
