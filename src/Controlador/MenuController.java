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
    @FXML
    private TableColumn Descuento;
    @FXML
    private TableColumn id;
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
    private TextField IDcliente;
    @FXML
    private TableView tabla;
    private ObservableList<Cliente> mostrar;

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

    }

    public void Buscar(ActionEvent actionEvent) {

    }

    @FXML
    public void initialize() {

    }

    @FXML
    public void Mostrar(ActionEvent actionEvent) {

        this.tabla.setItems(mostrar);
    }

    public void verIndividual(ActionEvent actionEvent) {
       Individual.setVisible(true);
    }
}
