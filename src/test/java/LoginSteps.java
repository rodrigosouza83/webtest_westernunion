import cucumber.api.java.pt.Então;
import io.cucumber.java.pt.Quando;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import util.AccessAndConfig;

import static java.lang.Thread.sleep;

public class LoginSteps extends AccessAndConfig {
    @Test
    @Então("^minha conta é carregada com sucesso$")
    public void minhaContaÉCarregadaComSucesso()  throws InterruptedException {


            System.setProperty("webdriver.gecko.driver", "/usr/local/bin/geckodriver");
            WebDriver driver = new FirefoxDriver();
            driver.get(URL);
            driver.findElement(By.linkText("Entre")).click();
            sleep(3000);
            driver.findElement(By.id("txtEmailAddr")).sendKeys(EMAIL);
            driver.findElement(By.id("txtKey")).sendKeys(PASS);
            driver.findElement(By.id("button-continue")).click();


            System.out.println("Login realizado com sucesso");

            sleep(3000);
            driver.quit();


    }
}
