module es.dylanhurtado.projectfrontdesktop {
    requires javafx.controls;
    requires javafx.fxml;
    requires retrofit2;
    requires retrofit2.converter.gson;


    requires org.kordamp.ikonli.javafx;

    opens es.dylanhurtado.projectfrontdesktop to javafx.fxml;
    opens es.dylanhurtado.projectfrontdesktop.controllers to javafx.fxml;
    exports es.dylanhurtado.projectfrontdesktop;
}