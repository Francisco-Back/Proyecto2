/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Clases.Cliente;
import Clases.Producto;
import java.net.URL;
import java.util.ResourceBundle;

import Data.DataSistema;
import Herencia.Empresa;
import Herencia.Individual;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.Pane;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author Francisco Back
 */
public class MenuController implements Initializable {

    public Button Mostrar;
    public Pane Individual;
    public Pane MostrarEmpresa;
    public Pane PaneIngresoCliente;
    public Pane PaneIngresoProducto;
    public TextField txtNombreCliente;
    public TextField txtContacto;
    public TextField txtEmpresa;
    public TextField txtCodigo;
    public TextField txtFuncion;
    public boolean IND = false;
    public boolean EMP = false;
    public TextField txtNombreParte;
    public TextField txtFuncionParte;
    public TextField txtMarcaParte;
    public TextField txtCodigoParte;
    public TextField txtPrecioParte;
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
    private TableColumn DESCUEN;
    private ObservableList<Cliente> Mostraremp;

    @FXML
    private Pane PanePartes;

    @FXML
    private TableColumn IDP;
    @FXML
    private TableColumn NPARTE;
    @FXML
    private TableColumn PCODIGO;
    @FXML
    private TableColumn PAMRCA;
    @FXML
    private TableColumn PFUNCION;
    @FXML
    private TableColumn PRECIO;
    private ObservableList<Producto> Catalogo;

    @FXML
    private TableView TablaPartes;

    @FXML
    private Pane PaneCLientes;

    @FXML
    private TableColumn IDCliente;
    @FXML
    private TableColumn EMPRESACliente;
    @FXML
    private TableColumn CONTACTOCliente;
    @FXML
    private TableColumn CODIGOCliente;
    @FXML
    private TableColumn AREACliente;
    @FXML
    private TableColumn FUNCIONcliente;
    @FXML
    private TableColumn DESCUENcliente;

    private ObservableList<Cliente> Todos;

    @FXML
    private TableView tablaEmpresa1;
    @FXML
    private TableColumn ID1;
    @FXML
    private TableColumn EMPRESA1;
    @FXML
    private TableColumn CONTACTO1;
    @FXML
    private TableColumn CODIGO1;
    @FXML
    private TableColumn AREA1;
    @FXML
    private TableColumn FUNCION1;
    @FXML
    private TableColumn DESCUEN1;

    @FXML
    private TableView tablaEmpresaCliente;
    private ObservableList<Cliente> MostraInd;

    /**
     * Initializes the controller clas s.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        MostraInd = FXCollections.observableArrayList(DataSistema.Array1());
        this.EMPRESA1.setCellValueFactory(new PropertyValueFactory<Cliente, String>("Dpi"));
        this.ID1.setCellValueFactory(new PropertyValueFactory<Cliente, Integer>("IdCliente"));
        this.DESCUEN1.setCellValueFactory(new PropertyValueFactory<Cliente, Integer>("Descuento"));
        this.AREA1.setCellValueFactory(new PropertyValueFactory<Cliente, String>("Empresa"));
        this.FUNCION1.setCellValueFactory(new PropertyValueFactory<Cliente, String>("Funcion"));
        this.CONTACTO1.setCellValueFactory(new PropertyValueFactory<Cliente, String>("NombreCliente"));
        this.CODIGO1.setCellValueFactory(new PropertyValueFactory<Cliente, String>("Codigo"));

        Mostraremp = FXCollections.observableArrayList(DataSistema.Array2());
        this.EMPRESA.setCellValueFactory(new PropertyValueFactory<Cliente, String>("Dpi"));
        this.ID.setCellValueFactory(new PropertyValueFactory<Cliente, Integer>("IdCliente"));
        this.DESCUEN.setCellValueFactory(new PropertyValueFactory<Cliente, Integer>("Descuento"));
        this.AREA.setCellValueFactory(new PropertyValueFactory<Cliente, String>("Empresa"));
        this.FUNCION.setCellValueFactory(new PropertyValueFactory<Cliente, String>("Funcion"));
        this.CONTACTO.setCellValueFactory(new PropertyValueFactory<Cliente, String>("NombreCliente"));
        this.CODIGO.setCellValueFactory(new PropertyValueFactory<Cliente, String>("Codigo"));
        Catalogo = FXCollections.observableArrayList(DataSistema.Arrayp1());
        this.IDP.setCellValueFactory(new PropertyValueFactory<Cliente, Integer>("IdProducto"));
        this.NPARTE.setCellValueFactory(new PropertyValueFactory<Cliente, String>("NombreParte"));
        this.PCODIGO.setCellValueFactory(new PropertyValueFactory<Cliente, String>("Codigo"));
        this.PAMRCA.setCellValueFactory(new PropertyValueFactory<Cliente, String>("Marca"));
        this.PFUNCION.setCellValueFactory(new PropertyValueFactory<Cliente, String>("Funcion"));
        this.PRECIO.setCellValueFactory(new PropertyValueFactory<Cliente, Integer>("precio"));
        Todos = FXCollections.observableArrayList(DataSistema.Todos());
        this.EMPRESACliente.setCellValueFactory(new PropertyValueFactory<Cliente, String>("Dpi"));
        this.DESCUENcliente.setCellValueFactory(new PropertyValueFactory<Cliente, Integer>("Descuento"));
        this.IDCliente.setCellValueFactory(new PropertyValueFactory<Cliente, Integer>("IdCliente"));
        this.CONTACTOCliente.setCellValueFactory(new PropertyValueFactory<Cliente, String>("NombreCliente"));
        this.CODIGOCliente.setCellValueFactory(new PropertyValueFactory<Cliente, String>("Codigo"));
        this.AREACliente.setCellValueFactory(new PropertyValueFactory<Cliente, String>("Empresa"));
        this.FUNCIONcliente.setCellValueFactory(new PropertyValueFactory<Cliente, String>("Funcion"));

    }

    @FXML
    public void Mostrar(ActionEvent actionEvent) {

        this.tablaEmpresa1.setItems(MostraInd);

    }

    @FXML
    public void MostrarEmpresa(ActionEvent actionEvent) {

        this.tablaEmpresa.setItems(Mostraremp);
    }

    @FXML
    private void MostrarPartes(ActionEvent actionevent) {

        this.TablaPartes.setItems(Catalogo);
    }

    @FXML
    private void MostarTodosClientes(ActionEvent event) {

        this.tablaEmpresaCliente.setItems(Todos);

    }

    @FXML
    public void verIndividual(ActionEvent actionEvent) {
        Individual.setVisible(true);
        MostrarEmpresa.setVisible(false);
        PanePartes.setVisible(false);
        PaneCLientes.setVisible(false);
        PaneIngresoCliente.setVisible(false);
        PaneIngresoProducto.setVisible(false);

    }

    @FXML
    public void verempresa(ActionEvent actionEvent) {
        Individual.setVisible(false);
        PanePartes.setVisible(false);
        MostrarEmpresa.setVisible(true);
        PaneCLientes.setVisible(false);
        PaneIngresoCliente.setVisible(false);
        PaneIngresoProducto.setVisible(false);
    }

    @FXML
    private void VerTodos(ActionEvent event) {
        Individual.setVisible(false);
        PanePartes.setVisible(false);
        MostrarEmpresa.setVisible(false);
        PaneCLientes.setVisible(true);
        PaneIngresoCliente.setVisible(false);
        PaneIngresoProducto.setVisible(false);
    }

    @FXML
    public void IngresoCliente(ActionEvent actionEvent) {
        PaneIngresoCliente.setVisible(true);
        Individual.setVisible(false);
        PanePartes.setVisible(false);
        MostrarEmpresa.setVisible(false);
        PaneCLientes.setVisible(false);
        PaneIngresoProducto.setVisible(false);
    }

    @FXML
    public void catalogo(ActionEvent actionEvent) {
        Individual.setVisible(false);
        MostrarEmpresa.setVisible(false);
        PanePartes.setVisible(true);
        PaneCLientes.setVisible(false);
        PaneIngresoCliente.setVisible(false);
        PaneIngresoProducto.setVisible(false);

    }

    @FXML
    public void Ingresop(ActionEvent actionEvent) {
       PaneIngresoProducto.setVisible(true);
        Individual.setVisible(false);
        MostrarEmpresa.setVisible(false);
        PanePartes.setVisible(false);
        PaneCLientes.setVisible(false);
        PaneIngresoCliente.setVisible(false);
       
    }

    @FXML
    public void PaneIngresosalir(ActionEvent actionEvent) {

        PaneIngresoCliente.setVisible(false);
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
    public void GrabarCliente(ActionEvent actionEvent) {
          String Dpi = txtNombreCliente.getText();
        String Empresa = txtEmpresa.getText();
        String Contacto = txtContacto.getText();
        String Codigo = txtCodigo.getText();
        String Funcion = txtFuncion.getText();
       
        if (IND == true) {
             Individual e = new Individual(Dpi, 5, 1, Contacto, Codigo, Empresa, Funcion);
            Global.Global.Ingreso(e);
        }if(EMP=true){
            Empresa e = new Empresa(Dpi, 10, 1, Contacto, Codigo, Empresa, Funcion);
        Global.Global.Ingreso2(e);
        }else {
             JOptionPane.showMessageDialog(null, "Infomracion No grabada", "error", JOptionPane.ERROR_MESSAGE);
        }
        txtNombreCliente.setText("");
        txtFuncion.setText("");
        txtEmpresa.setText("");
        txtContacto.setText("");
        txtCodigo.setText("");
    }

    @FXML
    public boolean GrabarIndividual(ActionEvent actionEvent) {

      return IND=true;

    }

    @FXML
    public boolean GrabarEmpresa(ActionEvent actionEvent) {
     return EMP=true;
    }

    public void GrabarParte(ActionEvent actionEvent) {
        try{
        String Nombreparte=txtNombreParte.getText();
        String Marca=txtMarcaParte.getText();
        String Funcion=txtFuncionParte.getText();
        String Codigo=txtCodigoParte.getText();
        int Precio= Integer.parseInt(txtPrecioParte.getText());
        Producto e=new Producto(1,Nombreparte,Codigo,Marca,Funcion,Precio);
        Global.Global.IngresoPro(e);
        }catch(Exception e){
            System.out.println(e);
        }
    }

    public void PaneParteSalir(ActionEvent actionEvent) {
        PaneIngresoProducto.setVisible(false);
    }
}
