package com.indra.steps_definitions;

import com.indra.actions.FalabellaActions;
import com.indra.models.FalabellaDatos;
import com.indra.models.FormularioSingIn;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class FalabellaSteps {
    @Managed
    WebDriver driver;
    FalabellaActions falabellaActions = new FalabellaActions(driver);

    @Given("^el usuario esta  en la seccion Home$")
    public void elUsuarioEstaEnLaSeccionHome() {
        falabellaActions.open();


    }


    @Given("^el usuario introduce un nombre de articulo$")
    public void elUsuarioIntroduceUnNombreDeArticulo(List<FalabellaDatos> falabellaDatos) {
        falabellaActions.ponerNombre(falabellaDatos.get(0));




    }

    @When("^aparecen los resultados segun criterio  de busqueda$")
    public void aparecenLosResultadosSegunCriterioDeBusqueda() {
        falabellaActions.buscarConsola();

    }

    @Then("^el usuario deberia poder agregar el articulo al carrito de compras$")
    public void elUsuarioDeberiaPoderAgregarElArticuloAlCarritoDeCompras() {
        falabellaActions.todo();







    }
}
