package examen.preg4;

import org.junit.After;
import org.junit.Before;
import sessionManager.DriverManager;

public class todoistpage {
    @Before
    public void before(){
        DriverManager.getInstance().getBrowser().get("https://todoist.com/es");
    }
    @After
    public void after(){
        DriverManager.getInstance().closeBrowser();
    }


    public void waitTime(int seconds) throws InterruptedException {
        Thread.sleep(1000 *seconds);

    }
}
