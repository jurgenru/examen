package examen.preg6;


import examen.preg5.LoginPageexamen;
import examen.preg5.MainPageexamen;
import examen.preg5.TestBaseexamen;
import examen.preg5.itemsPage;
import org.junit.Assert;
import org.junit.Test;

public class testTrash extends TestBaseexamen {
    private MainPageexamen mainPage = new MainPageexamen();
    private LoginPageexamen loginPage = new LoginPageexamen();
    private trashPage trashPage = new trashPage();

    @Test
    public void testTrash() throws InterruptedException {
        mainPage.loginImage.click();

        loginPage.loginTodoLy("jurgenruegenberg@gmail.com","60109269Jurg");
        Thread.sleep(3000);

        trashPage.trashProject.click();
        trashPage.trash.click();
        trashPage.confirm.click();
        Assert.assertTrue("ERROR ! no se borro nada",trashPage.messageDisplayed());
        Thread.sleep(6000);
    }

}
