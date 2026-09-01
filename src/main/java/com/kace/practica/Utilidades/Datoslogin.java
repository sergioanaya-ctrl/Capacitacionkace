package com.kace.practica.Utilidades;

import com.kace.practica.Modelos.LoginModel;
import java.util.ResourceBundle;

public class Datoslogin {

    private static final ResourceBundle BUNDLE =
            ResourceBundle.getBundle("datos.usuario");

    public static String getdatos(String llave) {
        return BUNDLE.getString(llave);
    }

    public static LoginModel datoslogin() {
        LoginModel login = new LoginModel();
        login.setUsuario(getdatos("usuario"));
        login.setPassword(getdatos("contrasena"));
        return login;
    }
}