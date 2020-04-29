package examen.preg5;

import org.junit.After;
import org.junit.Before;
import sessionManager.DriverManager;

public class TestBaseexamen {

    @Before
    public void before(){
        DriverManager.getInstance().getBrowser().get("http://todo.ly/");
        DriverManager.getInstance().getBrowser().manage().window().maximize();
    }
    @After
    public void after(){
        DriverManager.getInstance().closeBrowser();
    }


    public void waitTime(int seconds) throws InterruptedException {
        Thread.sleep(1000 *seconds);
    }
}
