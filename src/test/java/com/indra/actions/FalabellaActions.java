package com.indra.actions;

import com.indra.models.FalabellaDatos;
import com.indra.models.FormularioSingIn;
import com.indra.pages.FalabellaPage;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


@DefaultUrl("/falabella-co/")

public class FalabellaActions extends FalabellaPage {

    String precio1, precio2;

    public FalabellaActions(WebDriver driver) {
        super(driver);
    }

    public  void ponerNombre(FalabellaDatos falabellaDatos){

        enter(falabellaDatos.getNombreArticuloF()).into(getCajaBusqueda());

    }

    public void buscarConsola(){
        getCajaBusqueda().sendKeys(Keys.ENTER);

    }


    public void irAlElemento(By by){

        WebElement elementoSeleccionar = getDriver() .findElement(by);
       // WebElement elementoSeleccionar = driver.findElement(By.xpath("//b[contains(.,'Consola Xbox Series S 512 GB')]"));
        Actions actionProvider = new Actions(getDriver());
        // Performs mouse move action onto the element
        actionProvider.moveToElement(elementoSeleccionar).build().perform();
        System.out.println("precio 1*******"+getPrecioConsola().getText());
        precio1 = getPrecioConsola().getText();
    }


    public void finalizar(){
        irAlElemento(By.xpath("//b[contains(.,'Consola Xbox Series S 512 GB')]"));
        getBotonAgregar().click();
        getBtnNoGracias().click();
        getBntVerCarrito().click();
        System.out.println("precio en carrito***"+getPrecioEnCarritoDeCompras().getText());

    }
  public void finalizaCompara(){
       MatcherAssert.assertThat("precios deben coincidir",
              precio1,
              Matchers.equalTo(getPrecioEnCarritoDeCompras().getText())
       );
    }

    public void todo(){
        finalizar();
        finalizaCompara();
    }



}
