module org.openjfx {
    requires javafx.controls;
    requires javafx.fxml;
    requires opencsv;

    opens org.openjfx.controllers to javafx.fxml;
    opens org.openjfx.models to opencsv, javafx.base;

    exports org.openjfx;
}