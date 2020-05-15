package org.openjfx.controllers;

import javafx.collections.ObservableList;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import org.openjfx.models.Komponent;

public class KomponentTableViewHandler {

    private TableView<Komponent> komponentTableView;

    private TableColumn<Komponent, String> merkeStringTableColumn;
    private TableColumn<Komponent, String> typeStringTableColumn;
    private TableColumn<Komponent, String> kategoriStringTableColumn;
    private TableColumn<Komponent, String> detaljerStringTableColumn;
    private TableColumn<Komponent, Double> prisDoubleTableColumn;

    public KomponentTableViewHandler(TableView<Komponent> komponentTableView, TableColumn<Komponent, String> merkeStringTableColumn, TableColumn<Komponent, String> typeStringTableColumn, TableColumn<Komponent, String> kategoriStringTableColumn, TableColumn<Komponent, String> detaljerStringTableColumn, TableColumn<Komponent, Double> prisDoubleTableColumn) {
        this.komponentTableView = komponentTableView;
        this.merkeStringTableColumn = merkeStringTableColumn;
        this.typeStringTableColumn = typeStringTableColumn;
        this.kategoriStringTableColumn = kategoriStringTableColumn;
        this.detaljerStringTableColumn = detaljerStringTableColumn;
        this.prisDoubleTableColumn = prisDoubleTableColumn;
        //settOppKolonner();
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

    private void cellValueFactory(TableColumn<Komponent, String> kolonne, String value){
        kolonne.setCellValueFactory(new PropertyValueFactory<>(value));
    }

    public void attachTableView(ObservableList<Komponent> list){
        komponentTableView.setItems(list);
    }



}
