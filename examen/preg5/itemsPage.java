package examen.preg5;

import controlSelenium.Button;
import controlSelenium.Imagen;
import controlSelenium.Label;
import controlSelenium.TextBox;
import org.openqa.selenium.By;

public class itemsPage {
    public TextBox item;
    public Button add;
    public Label nameItem;
    //public Imagen menu;
    //public Button edit;
    public TextBox nItem;
    public Button itemEdit;
    public Button save;
// and text()='jurgenr'
    public itemsPage(){
        item = new TextBox(By.id("NewItemContentInput"));
        add = new Button(By.id("NewItemAddButton"));
        //menu = new Imagen(By.xpath("//img[@class = 'ItemMenu' and @style='display: inline;' and @title='Options']"));
        //edit = new Button(By.xpath("//*[@id='itemContextMenu']/li[1]"));
        itemEdit = new Button(By.xpath("//div[@id='ItemListPlaceHolder']//ul[@id='mainItemList']//li[last()]"));
        nItem = new TextBox(By.id("ItemEditTextbox"));
        save = new Button(By.id("ItemEditSubmit"));
    }

    public boolean isDisplayedProject(String itemName){
        nameItem= new Label(By.xpath("//div[@class = 'ItemContentDiv' and text()='"+itemName+"']"));
        return nameItem.isDisplayed();
    }
}
