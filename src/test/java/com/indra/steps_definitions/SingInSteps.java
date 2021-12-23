package com.indra.steps_definitions;

import com.indra.actions.SingInActions;
import com.indra.models.FormularioContacto;
import com.indra.models.FormularioSingIn;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class SingInSteps {

    @Managed
    WebDriver driver;
    SingInActions singInActions = new SingInActions(driver);

    @Given("^el usuario esta  en la seccion Login$")
    public void elUsuarioEstaEnLaSeccionLogin() {
        singInActions.open();

    }


    @When("^introduce un correo no registrado$")
    public void introduceUnCorreoNoRegistrado(List<FormularioSingIn> formularioSingIns) {

        //singInActions.llenarCorreoValido(formularioSingIns.get(0));
        singInActions.hacerClickEnBotonRegistrarse(formularioSingIns.get(0));




    }

    @When("^el usuario envia los datos obligatorios requeridos del formulario$")
    public void elUsuarioEnviaLosDatosObligatoriosRequeridosDelFormulario(List<FormularioSingIn> formularioSingIns) {
        //singInActions.llenarFormulario(formularioSingIns.get(0));
        singInActions.hacerClickEnBotonRegistrarseEnElFormulario(formularioSingIns.get(0));

    }

    @Then("^el usuario deberia poder ver la seccion MY ACCOUNT$")
    public void elUsuarioDeberiaPoderVerLaSeccionMYACCOUNT() {

        MatcherAssert.assertThat("El mensaje debe coincidir",
                singInActions.ValidacionConNombre(),
                Matchers.equalTo("manuel leon")
        );


    }
}
