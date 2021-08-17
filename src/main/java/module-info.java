module jfx.aplicacao {

    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;

    opens jfx.aplicacao to javafx.fxml;
    opens jfx.gui to javafx.fxml;

    exports jfx.gui;
    exports jfx.aplicacao;
}