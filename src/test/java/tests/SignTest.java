package tests;

import static org.junit.Assert.*;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class SignTest {
    @Test
    public void testFazerLogin() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\lucas\\Downloads\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.get("file:///C:/Users/lucas/Desktop/login%20test/index.html");

        driver.findElement(By.id("username")).sendKeys("username1");
        driver.findElement(By.id("password")).sendKeys("123456");

        driver.findElement(By.id("submit")).click();

        String mensagem = driver.findElement(By.className("title-page-logado")).getText();

        assertEquals("Login feito com sucesso!", mensagem);

        driver.quit();


    }

    @Test
    public void testFazerLoginUsernameVazio() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\lucas\\Downloads\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.get("file:///C:/Users/lucas/Desktop/login%20test/index.html");

        driver.findElement(By.id("username")).sendKeys("");
        //driver.findElement(By.id("password")).sendKeys("123456");

        driver.findElement(By.id("submit")).click();

        String mensagem = driver.switchTo().alert().getText();

        assertEquals("Enter username", mensagem );

        driver.quit();

    }

    @Test
    public void testFazerLoginSenhaVazio() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\lucas\\Downloads\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.get("file:///C:/Users/lucas/Desktop/login%20test/index.html");

        driver.findElement(By.id("username")).sendKeys("username1");
        driver.findElement(By.id("password")).sendKeys("");

        driver.findElement(By.id("submit")).click();

        String mensagem = driver.switchTo().alert().getText();

        assertEquals("Enter password", mensagem);

        driver.quit();
    }
}
