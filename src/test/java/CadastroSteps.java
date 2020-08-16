import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import util.AccessAndConfig;

import static java.lang.Thread.sleep;


public class CadastroSteps extends AccessAndConfig {

  @Test
  @cucumber.api.java.pt.Quando("^preencho o formulário$")
  public void preenchoOFormulário()  throws InterruptedException {

            System.setProperty("webdriver.gecko.driver", "/usr/local/bin/geckodriver");
            WebDriver driver = new FirefoxDriver();
            driver.get(URL);
            driver.findElement(By.linkText("Cadastre-se")).click();
            sleep(3000);
            driver.findElement(By.id("txtFName")).sendKeys("Rodrigo");
            driver.findElement(By.id("txtMName")).sendKeys("Carlos de");
            driver.findElement(By.id("txtLName")).sendKeys("Souza");
            driver.findElement(By.id("txtEmailAddr")).sendKeys("rodrigo@union2.com");
            driver.findElement(By.id("password")).sendKeys("123deOliveir@4");
      sleep(3000);
      driver.findElement(By.id("button-continue")).click();

            sleep(3000);

      System.out.println("Cadastro realizado com sucesso");
            driver.quit();


        }

}
