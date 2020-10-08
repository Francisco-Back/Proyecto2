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
// se crea la clase orden 
public class Orden {
    // se definen sus atributos

    private static int correlativo = 1;
    private int idOrden;
    private int idCliente;
    private String Ncliente;
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
    
    // se crea los metodos constructores

    public Orden(int idOrden) {

        this.idOrden = correlativo++;
    }

    public Orden() {

        Total = 0.0;
        FechaOrden = new Date();

    }

    public Orden(Date pfecha) {
        this();
        FechaOrden = pfecha;

    }

  
    
    

    public Orden(int pCliente, Date Pfecha) {
        this(Pfecha);
        idOrden = pCliente;
    }

    public Orden(int idOrden, Date FechaOrden,  String Envio,  ItemOrden item1, Cliente cliente, ItemOrden item2,  double PrecioEnvio, double Total,String Estado, int DiasEnvio) {
        this.idOrden = idOrden;
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

  
    

    
// no se crea los metodos get y set
 
    



//se crea el metodo toSring
    @Override
    public String toString() {
        return "Orden{" + "idOrden=" + idOrden + ", cliente=" + cliente + ", item1=" + item1 + ", item2=" + item2 + ", FechaOrden=" + FechaOrden + ", PrecioEnvio=" + PrecioEnvio + ", Total=" + Total + ", Envio=" + Envio + ", Estado=" + Estado + ", DiasEnvio=" + DiasEnvio + '}';
    }

}
