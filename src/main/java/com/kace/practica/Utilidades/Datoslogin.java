package com.kace.practica.Utilidades;

import java.util.ResourceBundle;

public class Datoslogin {
    public static ResourceBundle resourceBundle() {
        if (System.getProperties() != null) {
            return ResourceBundle.getBundle(System.getProperties("env"));
        } else {
            return ResourceBundle.getBundle("datos.usuario");
        }

    }

    public static String getdatos(String llave) {
        return resourceBundle().getString(llave);
    }


}
