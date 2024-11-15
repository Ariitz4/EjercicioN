package es.aritzherrero.ejercicicion;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Clase principal de la aplicación de formulario.
 *
 * @version 1.0
 */
public class EjercicioN extends Application {

    /**
     * Este procedimiento se ejecuta al lanzar la aplicación y configura el
     * escenario principal (`Stage`) con la escena cargada desde un archivo FXML.
     * La ventana no es redimensionable, tiene un título definido como "FORMULARIO"
     * y muestra el formulario principal.
     *
     * @param stage el escenario principal de la aplicación.
     * @throws IOException si ocurre un error al cargar el archivo FXML.
     */
    @Override
    public void start(Stage stage) throws IOException {
        // Carga el archivo FXML que define la interfaz gráfica
        FXMLLoader fxmlLoader = new FXMLLoader(EjercicioN.class.getResource("ejercicioN_principal.fxml"));

        // Crea la escena a partir del archivo FXML
        Scene scene = new Scene(fxmlLoader.load());

        // Configura el escenario principal: fija el tamaño y título
        stage.setResizable(false);
        stage.setTitle("FORMULARIO");

        // Asocia la escena al escenario y lo muestra
        stage.setScene(scene);
        stage.show();
    }

    /**
     * Lanza la aplicación llamando al método `launch`, el cual inicia
     * la aplicación JavaFX y llama al método `start` para configurar la ventana.
     *
     * @param args los argumentos de línea de comandos, si los hay.
     */
    public static void main(String[] args) {
        // Lanza la aplicación JavaFX
        launch();
    }
}

