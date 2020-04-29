package examen.preg6;

import controlSelenium.Imagen;
import org.openqa.selenium.By;

public class MainPageexamen {
    public Imagen loginImage;

    public MainPageexamen(){
        loginImage = new Imagen(By.xpath("//img[@src='/Images/design/pagelogin.png']"));

    }

}
