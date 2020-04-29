package examen.preg4;

import controlSelenium.Button;
import controlSelenium.Label;
import controlSelenium.TextBox;
import org.openqa.selenium.By;

public class editName {
    public Button settings;
    public Button config;
    public Button edit;
    public TextBox name;
    public Button guardar;
    public Button cerrar;
    public Label fullname1;

    public editName(){
        settings = new Button(By.xpath("//button[@type='button' and @aria-label='Configuración']"));
        config = new Button(By.xpath("//div[@class='usermenu__row-label' and text()='Configuración']"));
        edit = new Button(By.xpath("//dd[@class = 'ajax_edit_cell']/a[@class='inline_edit_link' and text()='Editar']"));
        name = new TextBox(By.xpath("//dl[@id='personal_info']/dd[@class='ajax_edit_cell']/form/input[@type = 'text']"));
        guardar = new Button(By.xpath("//dd[@class = 'ajax_edit_cell']//a[text()='Guardar']"));
        cerrar = new Button(By.xpath("//a[@class = 'close_link fixed_pos']"));
    }

    public String nameChanged(String expected) {
        fullname1 = new Label(By.id("FullNameInput"));
        return fullname1.getValue();
    }

    public boolean isDisplayedName(String Nname){
        fullname1 = new Label(By.xpath("//dl[@id='personal_info']/dd[@class='ajax_edit_cell']/form/input[@type = 'text']"));
        return fullname1.isDisplayed();
    }

    public String valueChanged(String expected){
        fullname1 = new Label(By.id("FullNameInput"));
        return fullname1.getValueAttribute(expected);
    }
}
