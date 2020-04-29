package examen.preg5;


import org.junit.Assert;
import org.junit.Test;

public class testItems extends TestBaseexamen{
    private MainPageexamen mainPage = new MainPageexamen();
    private LoginPageexamen loginPage = new LoginPageexamen();
    private itemsPage itemsPage = new itemsPage();

    @Test
    public void testItems() throws InterruptedException {
        String itemName="hola";
        String updateItem = "abc";

        mainPage.loginImage.click();

        loginPage.loginTodoLy("jurgenruegenberg@gmail.com","60109269Jurg");
        Thread.sleep(3000);

        itemsPage.item.type(itemName);
        itemsPage.add.click();
        Assert.assertTrue("ERROR ! El proyecto no fue creado",itemsPage.isDisplayedProject(itemName));

        itemsPage.itemEdit.click();
        itemsPage.nItem.type(updateItem);
        itemsPage.save.click();
        Thread.sleep(5000);
        Assert.assertTrue("ERROR ! El proyecto no fue creado",itemsPage.isDisplayedProject(updateItem));
    }

}
