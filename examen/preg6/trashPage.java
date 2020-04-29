package examen.preg6;

import controlSelenium.Button;
import controlSelenium.Imagen;
import controlSelenium.Label;
import controlSelenium.TextBox;
import org.openqa.selenium.By;

public class trashPage {
    public Button trashProject;
    public Imagen trash;
    public Button confirm;
    public TextBox message;
    public trashPage(){
        trashProject = new Button(By.xpath("//td[text()='Recycle Bin']"));
        trash = new Imagen(By.xpath("//div[@id='OtherListPlaceHolder']//td[@class='ItemIndicator']/div[@class='ProjItemMenu']/img[@src='/Images/dropdown.png']"));
        confirm = new Button(By.id("recycleContextMenu"));
    }
    public boolean messageDisplayed(){
        message = new TextBox(By.xpath("//span[@id='InfoMessageText' and text()='Recycle Bin has been Emptied.']"));
        return message.isDisplayed();
    }
}
