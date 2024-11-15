module es.aritzherrero.ejercicicion {
    requires javafx.controls;
    requires javafx.fxml;


    opens es.aritzherrero.ejercicicion to javafx.fxml;
    exports es.aritzherrero.ejercicicion;
    opens es.aritzherrero.ejercicicion.Control to javafx.fxml,javafx.base;
}