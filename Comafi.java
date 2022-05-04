package EscuelitaTGV.Automatizacion01;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Comafi {

	public static void main( String[] args ) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "..\\Automatizacion01\\Driver\\chromedriver.exe");
		
		RemoteWebDriver navegador = new ChromeDriver();
		
		navegador.get("http://192.168.41.22:8085/rating/?token=Y2xpZW50SXA9MTkyLjE2OC4yNTIuMzEmdGltZXN0YW1wPTIwMjAtMDgtMTcgMTc6NTY6MDguMTMyJnVzZXJpZD00MTI1JnVzZXJuYW1lPURhbmllbCBDb25kb3JpJnBlcmZpbD1BbmFNb2RlbA==");
		Thread.sleep(1500);
		
		navegador.findElement(By.xpath("/html/body/app-root/div[2]/div/app-inicio/div/div/a[1]/i")).click();
		Thread.sleep(1500);
		
		navegador.findElement(By.xpath("/html/body/app-root/div[2]/div/app-listado-plan-de-cuentas/form/div[3]/table/thead/tr/th[4]/button/i")).click();
		Thread.sleep(1500);
		
		navegador.findElement(By.xpath("/html/body/app-root/div[2]/div/app-plan-de-cuentas/table/thead/tr/th[6]/button/i")).click();
		
		navegador.findElement(By.xpath("/html/body/app-root/div[2]/div/app-plan-de-cuentas/form/div[3]/div[1]/div/input")).sendKeys("9999999999");
		
		navegador.findElement(By.xpath("/html/body/app-root/div[2]/div/app-plan-de-cuentas/form/div[3]/div[2]/div[1]/input")).sendKeys("159753");
		
		navegador.findElement(By.xpath("/html/body/app-root/div[2]/div/app-plan-de-cuentas/form/div[3]/div[2]/div[2]/input")).sendKeys("Algo");
		
		navegador.findElement(By.xpath("//*[@id=\"selectTipoDeCuenta\"]")).sendKeys("simple");
		
		navegador.findElement(By.xpath("/html/body/app-root/div[2]/div/app-plan-de-cuentas/form/div[3]/div[3]/label[2]/input")).click();
		Thread.sleep(1500);
		
		navegador.findElement(By.xpath("/html/body/app-root/div[2]/div/app-plan-de-cuentas/form/div[3]/div[3]/div[2]/button[2]")).click();
		
	}
}
