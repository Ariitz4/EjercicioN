package es.aritzherrero.ejercicicion.Control;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Controlador para el formulario de ingreso de datos de una persona.
 *
 */
public class ControlEjercicioN {

    @FXML
    private Button btCancelar;

    @FXML
    private Button btGuardar;

    @FXML
    private Label lblNombre;

    @FXML
    private Label lblApellido1;

    @FXML
    private Label lblApellido2;

    @FXML
    private Label lblProfesion;

    @FXML
    private Label lblTitulo;

    @FXML
    private HBox panelNombre;

    @FXML
    private HBox panelApellido1;

    @FXML
    private HBox panelApellido2;

    @FXML
    private HBox panelProfesion;

    @FXML
    private HBox panelBotones;

    @FXML
    private VBox rootPane;

    @FXML
    private TextField txtNombre;

    @FXML
    private TextField txtApellido1;

    @FXML
    private TextField txtApellido2;

    @FXML
    private TextField txtProfesion;

    /**
     * Evento que se dispara al hacer clic en el botón de cancelar.
     * Cierra la ventana actual.
     *
     * @param event Evento de acción generado por el clic en el botón.
     */
    @FXML
    void cancelar(ActionEvent event) {
        Stage stage = (Stage) btCancelar.getScene().getWindow();
        stage.close();
    }

    /**
     * Evento que se dispara al hacer clic en el botón de guardar.
     * Verifica que todos los campos de texto estén completados antes de guardar.
     * Si los campos están completos, muestra una ventana de confirmación y limpia los campos.
     * Si falta algún campo, muestra una alerta indicando que todos los campos son obligatorios.
     *
     * @param event Evento de acción generado por el clic en el botón.
     */
    @FXML
    void guardar(ActionEvent event) {
        if (validarCampos()) {
            mostrarVentanaOK();

            // Limpia todos los campos de texto
            txtNombre.clear();
            txtApellido1.clear();
            txtApellido2.clear();
            txtProfesion.clear();
        } else {
            mostrarAlertaCamposIncompletos();
        }
    }

    /**
     * Verifica que todos los campos de texto requeridos no estén vacíos.
     *
     * @return true si todos los campos están completados, false de lo contrario.
     */
    private boolean validarCampos() {
        return !txtNombre.getText().isEmpty() &&
                !txtApellido1.getText().isEmpty() &&
                !txtApellido2.getText().isEmpty() &&
                !txtProfesion.getText().isEmpty();
    }

    /**
     * Muestra una ventana de alerta informativa cuando se guarda una persona correctamente.
     */
    private void mostrarVentanaOK() {
        Alert alerta = new Alert(Alert.AlertType.INFORMATION);
        alerta.initOwner(btGuardar.getScene().getWindow());
        alerta.setHeaderText(null);
        alerta.setTitle("Info");
        alerta.setContentText("Persona guardada correctamente.");
        alerta.showAndWait();
    }

    /**
     * Muestra una alerta de advertencia indicando que todos los campos son obligatorios.
     */
    private void mostrarAlertaCamposIncompletos() {
        Alert alerta = new Alert(Alert.AlertType.WARNING);
        alerta.initOwner(btGuardar.getScene().getWindow());
        alerta.setHeaderText(null);
        alerta.setTitle("Advertencia");
        alerta.setContentText("Todos los campos son obligatorios. Por favor, complete todos los campos.");
        alerta.showAndWait();
    }
}
