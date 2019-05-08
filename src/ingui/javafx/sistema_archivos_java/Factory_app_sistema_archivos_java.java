/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ingui.javafx.sistema_archivos_java;

/**
 *
 * @author  Alberto & Itahisa
 */
public class Factory_app_sistema_archivos_java {
     public static App_sistema_archivos_java app_sistema_archivos_java = null;

    public static App_sistema_archivos_java getApp_sistema_archivos_java() {
        return app_sistema_archivos_java;
    }

    public static void setApp_sistema_archivos_java(App_sistema_archivos_java app_sistema_archivos_java) {
        Factory_app_sistema_archivos_java.app_sistema_archivos_java= app_sistema_archivos_java;
    }
    
}
