/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ingui.javafx.sistema_archivos_java;

import java.io.InputStream;
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

/**
 *
 * @author Alberto & Itahisa
 */
public class SistemaArchivos extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        boolean ret = true;
        String [] error = { "" };
        ret = configurar(stage, error);
        if (ret) {
            Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
        if (ret == false) {
            System.out.println(error[0]);
        }
    }

    public boolean configurar(Stage stage, String [] error) {
        boolean ret = true;
        stage.setTitle("Sistema Archivos SALCA");
        ObservableList<Image> observableList = stage.getIcons();
        InputStream inputStream
                = SistemaArchivos.class.getResourceAsStream(
                "/ingui/javafx/sistema_archivos_java/recursos/icono_archivo.png");
        Image image = new Image(inputStream);
        observableList.add(image);        
        return ret;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Examen_banderas examen_bandera = new Examen_banderas(); 
//        Factory_app_browser_java.setApp_browser_java(examen_bandera);
        launch(args);
    }
    
}
