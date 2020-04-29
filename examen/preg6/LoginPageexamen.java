package examen.preg6;

import controlSelenium.Button;
import controlSelenium.TextBox;
import org.openqa.selenium.By;

public class LoginPageexamen {

    public TextBox emailTextBox;
    public TextBox passwordTextBox;
    public Button loginButton;

    public LoginPageexamen(){
        emailTextBox= new TextBox(By.id("ctl00_MainContent_LoginControl1_TextBoxEmail"));
        passwordTextBox = new TextBox(By.id("ctl00_MainContent_LoginControl1_TextBoxPassword"));
        loginButton = new Button(By.id("ctl00_MainContent_LoginControl1_ButtonLogin"));
    }

    public void loginTodoLy(String email, String pwd){
        this.emailTextBox.type(email);
        this.passwordTextBox.type(pwd);
        this.loginButton.click();

    }

}
