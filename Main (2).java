import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImageLinks {

	public static void main(String[] args) {
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_links_image");
	
	driver.switchTo().frame("iframeResult");
	
	driver.findElement(By.xpath("//img[@alt='HTML tutorial']")).click();
	
	driver.switchTo().defaultContent();
	
	try {
		Thread.sleep(2000);
	}
	catch(InterruptedException e) {
		e.printStackTrace();
	}
	
	if(driver.getTitle().equals("Image as a Link")) {
		System.out.println("Test is Passed");
	}
	else {
		System.out.println("Test is Failled");
	}
	driver.close();
	
	}
}
