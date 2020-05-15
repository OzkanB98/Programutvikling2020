package org.openjfx.controllers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import org.openjfx.models.BeansKomponent;
import org.openjfx.models.Komponent;

public class KomponentTableViewHandler {

    private TableView<BeansKomponent> komponentTableView;

    private TableColumn<BeansKomponent, String> merkeStringTableColumn;
    private TableColumn<BeansKomponent, String> typeStringTableColumn;
    private TableColumn<BeansKomponent, String> kategoriStringTableColumn;
    private TableColumn<BeansKomponent, String> detaljerStringTableColumn;
    private TableColumn<BeansKomponent, Double> prisDoubleTableColumn;

    private ObservableList<BeansKomponent> list;

    public KomponentTableViewHandler(TableView<BeansKomponent> komponentTableView, TableColumn<BeansKomponent, String> merkeStringTableColumn, TableColumn<BeansKomponent, String> typeStringTableColumn, TableColumn<BeansKomponent, String> kategoriStringTableColumn, TableColumn<BeansKomponent, String> detaljerStringTableColumn, TableColumn<BeansKomponent, Double> prisDoubleTableColumn, ObservableList<BeansKomponent> list) {
        this.komponentTableView = komponentTableView;
        this.merkeStringTableColumn = merkeStringTableColumn;
        this.typeStringTableColumn = typeStringTableColumn;
        this.kategoriStringTableColumn = kategoriStringTableColumn;
        this.detaljerStringTableColumn = detaljerStringTableColumn;
        this.prisDoubleTableColumn = prisDoubleTableColumn;
        this.list = FXCollections.observableArrayList();
        settOppKolonner();
        //settOppTableView();
    }

    private void settOppTableView(){
        komponentTableView.getColumns().add(merkeStringTableColumn);
        komponentTableView.getColumns().add(typeStringTableColumn);
        komponentTableView.getColumns().add(kategoriStringTableColumn);
        komponentTableView.getColumns().add(detaljerStringTableColumn);
        komponentTableView.getColumns().add(prisDoubleTableColumn);

    }

    private void settOppKolonner(){
        cellValueFactory(merkeStringTableColumn, "merke");
        cellValueFactory(typeStringTableColumn, "type");
        cellValueFactory(kategoriStringTableColumn, "produktKategori");
        cellValueFactory(detaljerStringTableColumn, "produktDetaljer");
        prisDoubleTableColumn.setCellValueFactory(new PropertyValueFactory<>("pris"));
        System.out.println("Setter cell value factory fra tableViewHandler");
    }

    private void cellValueFactory(TableColumn<BeansKomponent, String> kolonne, String value){
        kolonne.setCellValueFactory(new PropertyValueFactory<>(value));
    }

    public void attachTableView(TableView tv){
        tv.setItems(list);
    }



}
