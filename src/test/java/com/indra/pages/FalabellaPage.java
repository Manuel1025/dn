package com.indra.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebDriver;

@DefaultUrl("https://www.falabella.com.co/")

public class FalabellaPage extends BaseFalabella{
    public FalabellaPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "(//input[contains(@type,'text')])[1]")
    private WebElementFacade cajaBusqueda;

    @FindBy(xpath = "//img[@src='https://images.contentstack.io/v3/assets/blt088e6fffbba20f16/blte9c20b98d24f1a25/60376c9a4a75a66ee92262d6/searcher-glass.svg']")
    private WebElementFacade bntBuscar;





    @FindBy(xpath = "//img[contains(@alt,'Xbox - Consola Xbox Series S 512 GB')]")
    private WebElementFacade consolaAgregar;

    @FindBy(xpath = "(//div[@class='jsx-3704877324 cmr-icon-container']//span[1])[1]")
    private  WebElementFacade precioConsola;


    @FindBy(xpath = "//button[@id='testId-Pod-action-9461744']")
    private WebElementFacade botonAgregar;

    @FindBy(xpath = "//button[@type='button'][contains(.,'No, gracias')]")
    private WebElementFacade btnNoGracias;

    public WebElementFacade getBntVerCarrito() {
        return bntVerCarrito;
    }

    @FindBy(id = "linkButton")
    private WebElementFacade bntVerCarrito;

    public WebElementFacade getPrecioEnCarritoDeCompras() {
        return precioEnCarritoDeCompras;
    }

    @FindBy(xpath = "//section[@class='fb_product-body']//div[@class='fb-pod__prices']//span[1]")
    private WebElementFacade precioEnCarritoDeCompras;

    public WebElementFacade getBtnNoGracias() {
        return btnNoGracias;
    }

    public WebElementFacade getBotonAgregar() {
        return botonAgregar;
    }

    public WebElementFacade getCajaBusqueda() {
        return cajaBusqueda;
    }

    public WebElementFacade getBntBuscar() {
        return bntBuscar;
    }

    public WebElementFacade getConsolaAgregar() {
        return consolaAgregar;
    }

    public WebElementFacade getPrecioConsola() {
        return precioConsola;
    }
}
