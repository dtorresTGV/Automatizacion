package EscuelitaTGV.Automatizacion01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CrearCuenta {
	
	public static void main( String[] args ) throws InterruptedException {
		
		System.out.println( "Hello World!" );
	    
	    System.setProperty("webdriver.chrome.driver","..\\Automatizacion01\\Driver\\chromedriver.exe");
	            
	    WebDriver navegador = new ChromeDriver();
	    
	    //abre la pag
	    navegador.get("http://automationpractice.com/index.php");
	    
	    //Busca "sign in" ingresa y cliquea
	    navegador.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")).click();
	    Thread.sleep(5000);	    
	    
	    //Busca el  campo del mail y agrega un mail.
	    navegador.findElement(By.xpath("//*[@id=\"email_create\"]")).sendKeys("sosa@asdasd.com");
	    
	    //Busca el boton para confirmar el mail
	    navegador.findElement(By.xpath("//*[@id=\"SubmitCreate\"]/span")).click();
	    Thread.sleep(5000);
	    
	    //Busca campo Title y cliquea
	    navegador.findElement(By.xpath("//*[@id=\"uniform-id_gender1\"]")).click();
	    
	    //Busca campo First name e ingrsa nombre
	    navegador.findElement(By.xpath("//*[@id=\"customer_firstname\"]")).sendKeys("Pepe");
	    
	    //Busca campo last name e ingresa apellido
	    navegador.findElement(By.xpath("//*[@id=\"customer_lastname\"]")).sendKeys("Sanchez");
	    
	    //Busca campo pass e ingresa pass
	    navegador.findElement(By.xpath("//*[@id=\"passwd\"]")).sendKeys("tgv123");
	    
	    //Busca campo fecha de cumple
	    navegador.findElement(By.xpath("//*[@id=\"days\"]")).click();
	    
	    //Ingrsa numero
	    navegador.findElement(By.xpath("//*[@id=\"days\"]")).sendKeys("17");
	    
	    //Busca campo meses y cliquea
	    navegador.findElement(By.xpath("//*[@id=\"months\"]")).click();
	    
	    //Busca campo meses ingresa mes
	    navegador.findElement(By.xpath("//*[@id=\"months\"]")).sendKeys("ap");
	    
	    //Busca campo año
	    navegador.findElement(By.xpath("//*[@id=\"years\"]")).click();
	    
	    //Busca campo año y ingresa año
	    navegador.findElement(By.xpath("//*[@id=\"years\"]")).sendKeys("1988");
	    
	    //Busca campo company y cliquea
	    navegador.findElement(By.xpath("//*[@id=\"company\"]")).click();
	    
	    //Busca campo company e ingresa un valor
	    navegador.findElement(By.xpath("//*[@id=\"company\"]")).sendKeys("TGV");
	    
	    //Busca campo address y cliquea
	    navegador.findElement(By.xpath("//*[@id=\"address1\"]")).click();
	    
	    //Busca campo address e ingresa un valor
	    navegador.findElement(By.xpath("//*[@id=\"address1\"]")).sendKeys("Calle falsa 123");
	    
	    //Busca campo city y cliquea
	    navegador.findElement(By.xpath("//*[@id=\"city\"]")).click();
	    
	    //Busca campo city e ingresa un valor
	    navegador.findElement(By.xpath("//*[@id=\"city\"]")).sendKeys("BS AS");
	    
	    //Busca campo state y cliquea
	    navegador.findElement(By.xpath("//*[@id=\"id_state\"]")).click();
	    
	    //Busca campo state e ingresa un valor
	    navegador.findElement(By.xpath("//*[@id=\"id_state\"]")).sendKeys("Mississippi");
	    
	    //Busca campo postcode y cliquea
	    navegador.findElement(By.xpath("//*[@id=\"postcode\"]")).click();
	    
	    //Busca campo postcode e ingresa un valor
	    navegador.findElement(By.xpath("//*[@id=\"postcode\"]")).sendKeys("56894");
	    
	    navegador.findElement(By.xpath("//*[@id=\"phone_mobile\"]")).click();
	    //Busca campo Phone mobile e ingresa un valor
	    navegador.findElement(By.xpath("//*[@id=\"phone_mobile\"]")).sendKeys("1155668879");
	    
	    //Busca campo alias y borra valor predeterminado
	    navegador.findElement(By.xpath("//*[@id=\"alias\"]")).clear();

	    //Busca campo alias e ingresa valor
	    navegador.findElement(By.xpath("//*[@id=\"alias\"]")).sendKeys("Sanchez");
	    
	    //Busca campo submitAccount y cliquea
	    navegador.findElement(By.xpath("//*[@id=\"submitAccount\"]/span")).click();
	    
	    
	    
	}
}
