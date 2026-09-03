package com.kace.practica.Interacciones;

import com.kace.practica.Modelos.LoginModel;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.time.Duration;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static com.kace.practica.Interfaces.LoginPage.*;

@AllArgsConstructor
public class LoginInteractions implements Interaction {
    private final LoginModel model;
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(model.getUsuario()).into(Nombre_Usuario),
                Click.on(Boton_Next),
                WaitUntil.the(Contrasena, isVisible()).forNoMoreThan(Duration.ofSeconds(10)),
                Enter.theValue(model.getPassword()).into(Contrasena),
                Click.on(Boton_continue)
        );
    }
    public static LoginInteractions datos(LoginModel model){
        return new LoginInteractions(model);
    }
}
