package EscuelitaTGV.Automatizacion01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {
        System.out.println( "Hello World!" );
        
        System.setProperty("webdriver.chrome.driver","..\\Automatizacion01\\Driver\\chromedriver.exe");
                
        WebDriver navegador = new ChromeDriver();
        
        //abre la pag
        navegador.get("https://www.selenium.dev/");
        
        //Thread.sleep(3000);
        
        //Busca elemento un elemento y lo clikea"
        navegador.findElement(By.xpath("//*[@id=\"main_navbar\"]/ul/li[4]/a/span")).click();
        
        
        
        
        
    }
}
