package com.example.todolist;

import javafx.beans.property.SimpleStringProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.CheckBoxTableCell;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Screen;
import javafx.stage.Stage;


public class ToDoListController {
    @FXML
    private TableView<TableRowData> tableView;

    @FXML
    private TextField klasyTextField;

    @FXML
    public void initialize() {
        tableView.setMaxSize(Screen.getPrimary().getVisualBounds().getWidth()*0.5, Screen.getPrimary().getVisualBounds().getHeight()*0.5);
        TableColumn<TableRowData, String> klasaColumn = new TableColumn<>("Klasy");
        klasaColumn.setMinWidth(tableView.getMaxWidth()*0.45);
        klasaColumn.setCellValueFactory(new PropertyValueFactory<>("klasy"));

        TableColumn<TableRowData, String> proponowaneColumn = new TableColumn<>("Proponowane");
        proponowaneColumn.setMinWidth(tableView.getMaxWidth()*0.1);
        proponowaneColumn.setCellValueFactory(new PropertyValueFactory<>("proponowane"));

        TableColumn<TableRowData, String> doOcenyColumn = new TableColumn<>("Do Oceny");
        doOcenyColumn.setMinWidth(tableView.getMaxWidth()*0.45);
        doOcenyColumn.setCellValueFactory(new PropertyValueFactory<>("doOceny"));

        tableView.getColumns().addAll(klasaColumn,proponowaneColumn,doOcenyColumn);
    }

    public void addRow(ActionEvent event) {
        if(!klasyTextField.getText().isBlank()){
            String klasy = klasyTextField.getText();
            tableView.getItems().add(new TableRowData(klasy));
            klasyTextField.clear();
        }
    }

    public static class TableRowData {
        final SimpleStringProperty klasy;
        final CheckBox proponowane;
        final TextField doOceny;

        public TableRowData(String klasy) {
            this.klasy = new SimpleStringProperty(klasy);
            this.proponowane =new CheckBox();
            this.doOceny=new TextField();
        }

        public String getKlasy() {
            return klasy.get();
        }


        public CheckBox getProponowane() {
            return proponowane;
        }

        public TextField getDoOceny() {
            return doOceny;
        }
    }
}