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

      int aux=0;

    public static int sigIdOrden(int idOrden,int aux) {
         return aux + idOrden;
    }


    public Orden(int idOrden) {
       Orden.sigIdOrden(idOrden,aux);
       aux+=idOrden;
        this.idOrden = idOrden;
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

    public Orden(int idOrden, Date FechaOrden, double PrecioEnvio, double Total, String Envio, String Estado, int DiasEnvio) {
        this(idOrden);
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
        return 0;
      
      
        
    }
   
    
    
    
    
    
    
}
