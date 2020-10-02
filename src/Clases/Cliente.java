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
public class Cliente {

    private int IdCliente;
    private String NombreCliente;
    private String Codigo;
    private String Empresa;
    private String Funcion;

    public static int sigIdCliente(int IdCliente) {

        return IdCliente + 1;

    }

    public Cliente(int IdCliente) {
        this.IdCliente = IdCliente;
    }

    public Cliente(int IdCliente, String NombreCliente, String Codigo, String Empresa, String Funcion) {
        Cliente.sigIdCliente(IdCliente);
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

    @Override
    public String toString() {
        return "Cliente{" + "IdCliente=" + IdCliente + ", Cliente=" + NombreCliente + ", Codigo=" + Codigo + ", Empresa=" + Empresa + ", Funcion=" + Funcion + '}';
    }

}
