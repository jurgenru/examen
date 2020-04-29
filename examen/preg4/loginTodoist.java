package examen.preg4;

import controlSelenium.Button;
import controlSelenium.TextBox;
import org.openqa.selenium.By;

public class loginTodoist {
    public TextBox emailTextBox;
    public TextBox passwordTextBox;
    public Button iniciar;

    public loginTodoist(){
        emailTextBox= new TextBox(By.id("email"));
        passwordTextBox = new TextBox(By.id("password"));
        iniciar = new Button(By.xpath("//button[text()='Iniciar sesión']"));
    }

    public void loginTodoist(String email, String pwd){
        this.emailTextBox.type(email);
        this.passwordTextBox.type(pwd);
        this.iniciar.click();
    }
}
