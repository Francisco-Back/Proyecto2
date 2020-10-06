/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Clases.Cliente;
import java.util.Date;
import Herencia.Empresa;
import Herencia.Individual;
import Data.DataSistema;

/**
 *
 * @author Francisco Back
 */
public class Orden {
    private static int correlativo=1;
    private int idOrden;
    Cliente cliente;
    ItemOrden item1;
    ItemOrden item2;
    private Date FechaOrden;
    private double PrecioEnvio;
    private double Total;
    private String Envio;
    private String Estado;
    static int sigldOrden;
    private int DiasEnvio;

  


    public Orden(int idOrden) {

        this.idOrden = correlativo++;
    }
    public Orden(){
        
        Total=0.0;
        FechaOrden=new Date();
       
       
    }
    
    public Orden(Date pfecha) {
     this();
     FechaOrden=pfecha;
     
    }
    public Orden(int pCliente,Date Pfecha){
        this(Pfecha);
        idOrden=pCliente; 
    }

    public Orden(int idOrden, Cliente cliente, ItemOrden item1, ItemOrden item2, Date FechaOrden, double PrecioEnvio, double Total, String Envio, String Estado, int DiasEnvio) {
        this.idOrden = correlativo++;
        this.cliente = cliente;
        this.item1 = item1;
        this.item2 = item2;
        this.FechaOrden = FechaOrden;
        this.PrecioEnvio = PrecioEnvio;
        this.Total = Total;
        this.Envio = Envio;
        this.Estado = Estado;
        this.DiasEnvio = DiasEnvio;
        
    }

  
   
    int total;
    public double getTotalOrden(){
      total+=item1.TotalItem();
        return total;
      
      
        
    }

    public int getIdOrden() {
        return idOrden;
    }

    public void setIdOrden(int idOrden) {
        this.idOrden = idOrden;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ItemOrden getItem1() {
        return item1;
    }

    public void setItem1(ItemOrden item1) {
        this.item1 = item1;
    }

    public ItemOrden getItem2() {
        return item2;
    }

    public void setItem2(ItemOrden item2) {
        this.item2 = item2;
    }

    public Date getFechaOrden() {
        return FechaOrden;
    }

    public void setFechaOrden(Date FechaOrden) {
        this.FechaOrden = FechaOrden;
    }

    public double getPrecioEnvio() {
        return PrecioEnvio;
    }

    public void setPrecioEnvio(double PrecioEnvio) {
        this.PrecioEnvio = PrecioEnvio;
    }

    public double getTotal() {
        return Total;
    }

    public void setTotal(double Total) {
        this.Total = Total;
    }

    public String getEnvio() {
        return Envio;
    }

    public void setEnvio(String Envio) {
        this.Envio = Envio;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public static int getSigldOrden() {
        return sigldOrden;
    }

    public static void setSigldOrden(int sigldOrden) {
        Orden.sigldOrden = sigldOrden;
    }

    public int getDiasEnvio() {
        return DiasEnvio;
    }

    public void setDiasEnvio(int DiasEnvio) {
        this.DiasEnvio = DiasEnvio;
    }

    @Override
    public String toString() {
        return "Orden{" + "idOrden=" + idOrden + ", cliente=" + cliente + ", item1=" + item1 + ", item2=" + item2 + ", FechaOrden=" + FechaOrden + ", PrecioEnvio=" + PrecioEnvio + ", Total=" + Total + ", Envio=" + Envio + ", Estado=" + Estado + ", DiasEnvio=" + DiasEnvio + '}';
    }
   
    
    
    
    
    
    
}
