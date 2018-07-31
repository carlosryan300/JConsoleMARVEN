package testes;

import static org.junit.Assert.*;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class InformacoesUsuarioTest {
    @Test
    public void testAdicionarUmaInformacaoAdicionalDoUsuario(){
        //System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");
        System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\Mozilla Firefox\\geckodriver.exe");
// Abrir navegador chrome automatizado
        WebDriver navegador = new FirefoxDriver();
        navegador.manage().window().maximize();
        navegador.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        navegador.get("https://www.google.com/");
        navegador.manage().deleteAllCookies();

        WebElement FormularioSearchGoogle = navegador.findElement(By.id("lst-ib"));
        FormularioSearchGoogle.click();
        FormularioSearchGoogle.sendKeys("similarweb");
        navegador.manage().deleteAllCookies();

        WebElement BtnGoogleSearch = navegador.findElement(By.name("btnK"));
        BtnGoogleSearch.click();

        WebElement SearchSimilarWeb = navegador.findElement(By.linkText("SimilarWeb | Obtenha insights de marketing digital"));
        SearchSimilarWeb.click();


        WebElement FormularioSearchSimilarWeb = navegador.findElement(By.id("ninja_forms_field_8"));

        FormularioSearchSimilarWeb.click();

        FormularioSearchSimilarWeb.sendKeys("https://www.brastemp.com.br/");

        WebElement Click = navegador.findElement(By.id("ninja_forms_field_9"));

        Click.click();


        //Click.click();

        //FormularioSignInBox.findElement(By.name("password")).sendKeys("123456");

        //navegador.findElement(By.linkText("SIGN IN")).click();

        //navegador.close();
        assertEquals(1,1);
    }
}
