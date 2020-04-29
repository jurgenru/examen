package examen.preg7;

import controlSelenium.Button;
import controlSelenium.Imagen;
import controlSelenium.TextBox;
import org.openqa.selenium.By;

public class logoutPage {
    public Button logout;
    public Imagen login;

    public logoutPage(){
        logout = new Button(By.id("ctl00_HeaderTopControl1_LinkButtonLogout"));
    }

    public boolean logout(){
        login = new Imagen(By.xpath("//img[@src='/Images/design/pagelogin.png']"));
        return login.isDisplayed();
    }
}
