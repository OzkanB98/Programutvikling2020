package org.openjfx.controllers;

import javafx.collections.ObservableList;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
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
    }

    public void attachTableView(ObservableList<Komponent> list){
        komponentTableView.setItems(list);
    }


}
