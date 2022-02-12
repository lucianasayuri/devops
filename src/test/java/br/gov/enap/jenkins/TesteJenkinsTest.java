package br.gov.enap.jenkins;

import java.time.Duration;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteJenkinsTest {

	WebDriver driver;

	@Test
	public void abrirNavegador() {
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "/dependencias/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com.br/");
		}

	@After
	public void fecharNavegador() {
	driver.quit();
}
}

