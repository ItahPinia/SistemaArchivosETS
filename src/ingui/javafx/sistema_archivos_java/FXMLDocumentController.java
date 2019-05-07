package ingui.javafx.sistema_archivos_java;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.beans.property.ReadOnlyStringProperty;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

/**
 *
 * @author Alberto & Itahisa
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private AnchorPane anchorPane;
    @FXML
    private WebView webView;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
       
        boolean ret = true;
            String[] error = {""};
            // Recuperar el objeto de la factoria
//            app_browser_java = Factory_app_browser_java.getApp_browser_java();
            WebEngine webEngine = webView.getEngine();
            ret = poner_escuchador_de_url(error);
            if (ret) {
                String texto=""; //??
//                String texto = app_browser_java.iniciar_contenido(this.getClass(), error);
                if (texto != null) {
                    webEngine.loadContent(texto);
                } else {
                    ret = false;
                }
            }
            if (ret == false) {
                poner_error(error[0]);
            }
        }
        /**
         * Pone el escuchador de cambio de URL en el objeto webView
         *
         * @param error Mensaje de error en la posición 0.
         * @return true si todo es correcto, false si hay algún error.
         */
    public boolean poner_escuchador_de_url(String[] error) {
        boolean ret = true;
        WebEngine webEngine = this.webView.getEngine();
        ReadOnlyStringProperty readOnlyStringProperty = webEngine.locationProperty();
//        Examen_banderas indexControladorChangeListener
//                = new Examen_banderas();
//        app_browser_java.setfXMLDocumentController(this);
//        readOnlyStringProperty.addListener(app_browser_java);
        return ret;
    }

    public boolean poner_error(String mensaje) {
        String[] error = {""};
        return cargar_contenido(mensaje, "text/html", error);
    }

    public boolean cargar_contenido(String contenido, String tipo_contenido, String[] error) {
        boolean ret = true;
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                WebEngine webEngine = webView.getEngine();
                webEngine.loadContent(contenido, tipo_contenido);
            }

        });
        return ret;
    }
}
