package com.kace.practica.Interfaces;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPage {

    public static final Target Nombre_Usuario=Target.the("Este campo es para escribir el nombre de usuario").located(By.name("username"));
    public static final Target Boton_Next=Target.the("Es boton es para pasar la siguiente pagina").locatedBy("//button[@type='submit' and .//span[text()='Next']]");
    public static final Target Contrasena =Target.the("Este campo es para escribir el la contraseña").located(By.name("password"));
    public static final Target Boton_continue=Target.the("Es boton es para pasar la siguiente pagina").locatedBy("//button[@type='submit' and .//span[text()='Continue']]");
}
