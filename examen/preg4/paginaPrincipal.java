package examen.preg4;

import controlSelenium.Button;
import controlSelenium.Imagen;
import org.openqa.selenium.By;

public class paginaPrincipal {
    public Button iniciarsesion;

    public paginaPrincipal(){
        iniciarsesion = new Button(By.xpath("//a[text()='Iniciar sesión']"));

    }

}
