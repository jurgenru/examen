package examen.preg4;

import org.junit.Assert;
import org.junit.Test;

public class examenTest extends todoistpage {
    private loginTodoist login = new loginTodoist();
    private paginaPrincipal iniciar = new paginaPrincipal();
    private editName edit = new editName();

    @Test
    public void testProjects() throws InterruptedException {
        String name = "Jurgen";
        iniciar.iniciarsesion.click();
        login.loginTodoist("jurgenruegnberg@gmail.com", "jurgen123");
        Thread.sleep(5000);

        edit.settings.click();
        edit.config.click();
        edit.edit.click();
        edit.name.type(name);
        edit.guardar.click();
        edit.cerrar.click();
        Thread.sleep(5000);
        Assert.assertTrue("ERROR ! El nobre no se cambio",edit.isDisplayedName(name));
//        edit.settings.click();
//        edit.fullname.type(name);
//        edit.ok.click();
//        Thread.sleep(3000);
//        Assert.assertFalse("Error no se cambio el nombre", edit.isDisplayedName(name));
    }
}
