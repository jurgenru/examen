package examen.preg7;


import examen.preg5.LoginPageexamen;
import examen.preg5.MainPageexamen;
import examen.preg5.TestBaseexamen;
import examen.preg5.itemsPage;
import org.junit.Assert;
import org.junit.Test;

public class testLogout extends TestBaseexamen {
    private MainPageexamen mainPage = new MainPageexamen();
    private LoginPageexamen loginPage = new LoginPageexamen();
    private logoutPage logoutPage = new logoutPage();

    @Test
    public void testLogout() throws InterruptedException {

        mainPage.loginImage.click();

        loginPage.loginTodoLy("jurgenruegenberg@gmail.com","60109269Jurg");
        Thread.sleep(3000);

        logoutPage.logout.click();
        Assert.assertTrue("ERROR ! no pudo haber un logout",logoutPage.logout());
        Thread.sleep(5000);
    }

}
