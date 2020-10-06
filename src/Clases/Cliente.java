/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;
import Global.VentanaNew;
import java.util.List;

/**
 *
 * @author Francisco Back
 */
public class Cliente {
private static int correlativoCodigo=1;
    private int IdCliente;
    private String NombreCliente;
    private String Codigo;
    private String Empresa;
    private String Funcion;
    //private List<Cliente>cliente;
    
    
   

  

    public Cliente(int IdCliente) {
        this.IdCliente = 0;
    }
    
      public Cliente() {
        this.IdCliente = 0;
        this.NombreCliente = "no-nombre";
        this.Codigo = "";
        this.Empresa = "";
        this.Funcion = "";
    }

    public Cliente(int IdCliente, String NombreCliente, String Codigo, String Empresa, String Funcion) {
        this.IdCliente=correlativoCodigo++;
        this.NombreCliente = NombreCliente;
        this.Codigo = Codigo;
        this.Empresa = Empresa;
        this.Funcion = Funcion;
    }

 
    public String getCliente() {
        return NombreCliente;
    }

    public void setCliente(String Cliente) {
        this.NombreCliente = Cliente;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public String getEmpresa() {
        return Empresa;
    }

    public void setEmpresa(String Empresa) {
        this.Empresa = Empresa;
    }

    public String getFuncion() {
        return Funcion;
    }

    public void setFuncion(String Funcion) {
        this.Funcion = Funcion;
    }

    public String getNombreCliente() {
        return NombreCliente;
    }

    public void setNombreCliente(String NombreCliente) {
        this.NombreCliente = NombreCliente;
    }

    public int getIdCliente() {
        return IdCliente;
    }
    

    @Override
    public String toString() {
        Utileria utileria=new Utileria();
        return "["+ utileria.getNombreClase(this.getClass().getName())+"]" + "IdCliente=" + IdCliente + ", NombreCliente=" + NombreCliente + ", Codigo=" + Codigo + ", Empresa=" + Empresa + ", Funcion=" + Funcion;
    }

    


}
