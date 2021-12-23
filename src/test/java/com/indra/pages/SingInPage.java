package com.indra.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebDriver;

@DefaultUrl("http://automationpractice.com/index.php?controller=authentication&back=my-account")

public class SingInPage extends BasePage{
    public SingInPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "email_create")
    private WebElementFacade mcajacorreoRegistro;

    @FindBy(id = "SubmitCreate")
    private WebElementFacade btncrear;

    @FindBy(id = "id_gender1")
    private WebElementFacade checbox1;

    @FindBy(id = "customer_firstname")
    private WebElementFacade mmnombre;

    @FindBy(id = "customer_lastname")
    private WebElementFacade mapellido;

    @FindBy(id = "passwd")
    private WebElementFacade mcontrasena;

    @FindBy(id = "address1")
    private WebElementFacade mdireccion;

    @FindBy(id = "city")
    private WebElementFacade mciudad;

    @FindBy(id = "id_state")
    private WebElementFacade mestado;



    @FindBy(id = "id_country")
    private WebElementFacade mpais;

   @FindBy(id = "phone_mobile")
   private WebElementFacade campotelefono;

    @FindBy(id = "submitAccount")
    private WebElementFacade mcrear;

    public WebElementFacade getCampotelefono() {
        return campotelefono;
    }

    public WebElementFacade getMmnombre() {
        return mmnombre;
    }

    @FindBy(id = "postcode")
    private WebElementFacade mpostalcodigo;

    @FindBy(xpath = "//span[contains(.,'manuel leon')]")
    private WebElementFacade variablevalidar;

    //__________________________________________________________\\

    public WebElementFacade getVariablevalidar() {
        return variablevalidar;
    }



    public WebElementFacade getMpostalcodigo() {
        return mpostalcodigo;
    }





    public WebElementFacade getMcajacorreoRegistro() {
        return mcajacorreoRegistro;
    }

    public WebElementFacade getBtncrear() {
        return btncrear;
    }

    public WebElementFacade getChecbox1() {
        return checbox1;
    }






    public WebElementFacade getMapellido() {
        return mapellido;
    }

    public WebElementFacade getMcontrasena() {
        return mcontrasena;
    }

    public WebElementFacade getMdireccion() {
        return mdireccion;
    }

    public WebElementFacade getMciudad() {
        return mciudad;
    }

    public WebElementFacade getMestado() {
        return mestado;
    }


    public WebElementFacade getMpais() {
        return mpais;
    }



    public WebElementFacade getMcrear() {
        return mcrear;
    }
}
