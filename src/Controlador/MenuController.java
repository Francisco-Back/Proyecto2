/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Clases.Cliente;
import java.net.URL;
import java.util.ResourceBundle;

import Data.DataSistema;
import static Data.DataSistema.Array1;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.Pane;

/**
 * FXML Controller class
 *
 * @author Francisco Back
 */
public class MenuController implements Initializable {
    public Button Mostrar;
    public Pane Individual;
    public Pane MostrarEmpresa;
    @FXML
    private TableColumn Descuento;
    @FXML
    private TableColumn dpicodigo;
    @FXML
    private TableColumn idcliente;
    @FXML
    private TableColumn nombre;
    @FXML
    private TableColumn codgio;
    @FXML
    private TableColumn empres;
    @FXML
    private TableColumn funcion;
    @FXML
    private TableView tabla;
    
    private ObservableList<Cliente> mostrar;
   
    @FXML
    private Button Buscar;
    @FXML
    private TableColumn ID;
    @FXML
    private TableColumn EMPRESA;
    @FXML
    private TableColumn CONTACTO;
    @FXML
    private TableColumn CODIGO;
    @FXML
    private TableColumn AREA;
    @FXML
    private TableColumn FUNCION;
    @FXML
    private TableView tablaEmpresa;
    @FXML
    private TableColumn  DESCUEN;
    private ObservableList<Cliente> Mostraremp;
    
    

    /**
     * Initializes the controller clas s.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        mostrar = FXCollections.observableArrayList(DataSistema.Array1());
        this.dpicodigo.setCellValueFactory(new PropertyValueFactory<Cliente, String>("Dpi"));
        this.Descuento.setCellValueFactory(new PropertyValueFactory<Cliente, Integer>("Descuento"));
        this.idcliente.setCellValueFactory(new PropertyValueFactory<Cliente, Integer>("IdCliente"));
        this.nombre.setCellValueFactory(new PropertyValueFactory<Cliente, String>("NombreCliente"));
        this.codgio.setCellValueFactory(new PropertyValueFactory<Cliente, String>("Codigo"));
        this.empres.setCellValueFactory(new PropertyValueFactory<Cliente, String>("Empresa"));
        this.funcion.setCellValueFactory(new PropertyValueFactory<Cliente, String>("Funcion"));
        Mostraremp=FXCollections.observableArrayList(DataSistema.Array2());
        this.EMPRESA.setCellValueFactory(new PropertyValueFactory<Cliente,String>("Dpi"));
        this.ID.setCellValueFactory(new PropertyValueFactory<Cliente,Integer>("IdCliente"));
        this.DESCUEN.setCellValueFactory(new PropertyValueFactory<Cliente,Integer>("Descuento"));
        this.AREA.setCellValueFactory(new PropertyValueFactory<Cliente,String>("Empresa"));
        this.FUNCION.setCellValueFactory(new PropertyValueFactory<Cliente,String>("Funcion"));
        this.CONTACTO.setCellValueFactory(new PropertyValueFactory<Cliente,String>("NombreCliente"));
        this.CODIGO.setCellValueFactory(new PropertyValueFactory<Cliente,String>("Codigo"));
    }
    
    public void initialize(){

      
    }

    @FXML
    public void Buscar(ActionEvent actionEvent) {

    }
    @FXML
    public void BuscarEmpresa(ActionEvent actionEvent) {

    }
    @FXML
    public void Mostrar(ActionEvent actionEvent) {

        this.tabla.setItems(mostrar);
    }
    @FXML
     public void MostrarEmpresa(ActionEvent actionEvent) {
 this.tablaEmpresa.setItems(Mostraremp);
    }

    @FXML
    public void verIndividual(ActionEvent actionEvent) {
       Individual.setVisible(true);
        MostrarEmpresa.setVisible(false);
    }
     public void verempresa(ActionEvent actionEvent) {
         Individual.setVisible(false);
       MostrarEmpresa.setVisible(true);
    }
     
     
     
     
     
     
    @FXML
     public void ingreso(ActionEvent actionEvent) {
       //empresa.setVisible(true);
    }
    @FXML
     public void catalogo(ActionEvent actionEvent) {
       //empresa.setVisible(true);
    }
    @FXML
     public void Ingresop(ActionEvent actionEvent) {
       //empresa.setVisible(true);
    }
    @FXML
     public void OrdCompra(ActionEvent actionEvent) {
       //empresa.setVisible(true);
    }
    @FXML
     public void IngresoCom(ActionEvent actionEvent) {
       //empresa.setVisible(true);
    }

    @FXML
    private void empresa(ActionEvent event) {
    }
    
}
