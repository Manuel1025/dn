package com.indra.actions;

import com.indra.models.FormularioContacto;
import com.indra.models.FormularioSingIn;
import com.indra.pages.SingInPage;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
@DefaultUrl("/index.php?controller=authentication&back=my-account")

public class SingInActions extends SingInPage {
    public SingInActions(WebDriver driver) {
        super(driver);
    }

    public void llenarCorreoValido(FormularioSingIn singin){
        enter(singin.getCorrenr()).into(getMcajacorreoRegistro());

    }

    public void hacerClickEnBotonRegistrarse (FormularioSingIn singin){
        llenarCorreoValido(singin);
        getBtncrear().click();



    }


    public void llenarFormulario(FormularioSingIn singin){
        enter(singin.getNombre()).into(getMmnombre());
        enter(singin.getApellido()).into(getMapellido());
        enter(singin.getContrasena()).into(getMcontrasena());
        enter(singin.getDireccion1()).into(getMdireccion());
        enter(singin.getCiudad()).into(getMciudad());
        selectOptionFromDropDown(By.id("id_state"),singin.getEstado());
        enter(singin.getCodigopostal()).into(getMpostalcodigo());
        selectOptionFromDropDown(By.id("id_country"),singin.getUsa());
        //enter(singin.getUsa()).into(getMpais());
        enter(singin.getTelefono1()).into(getCampotelefono());



    }

    public void hacerClickEnBotonRegistrarseEnElFormulario (FormularioSingIn singin){
        llenarFormulario(singin);
        getMcrear().click();



    }

    public String ValidacionConNombre(){
        return getVariablevalidar().getText();
    }



}
