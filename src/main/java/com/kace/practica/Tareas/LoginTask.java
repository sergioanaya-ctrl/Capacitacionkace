package com.kace.practica.Tareas;

import com.kace.practica.Interacciones.LoginInteractions;
import com.kace.practica.Modelos.LoginModel;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

@AllArgsConstructor
public class LoginTask implements Task {
    private final LoginModel model;
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(LoginInteractions.datos(model));

    }
    public static LoginTask datos1(LoginModel model){
        return new LoginTask(model);
    }
}
