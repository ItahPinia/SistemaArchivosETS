/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ingui.javafx.sistema_archivos_java;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;

/**
 *
 * @author Alberto & Itahisa
 */
public interface App_sistema_archivos_java extends ChangeListener<String>{
    
    void changed(ObservableValue<? extends String> observable, String oldValue, String newValue);
   
    String iniciar_contenido(Class clase, String [] error);
    
    FXMLDocumentController getfXMLDocumentController();
    
    void setfXMLDocumentController(FXMLDocumentController fXMLDocumentController);
}
