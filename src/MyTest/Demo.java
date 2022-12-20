package MyTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
    public static void main(String[] args) throws InterruptedException {
        // code for successfully connect to  the chrome driver
        System.setProperty("web driver.chrome.driver","D:\\selenium\\selenium  jarsand drivers\\drivers\\chrome driver\\chromedriver.exe" );
        // name my reference variable and assign  it with  a object of a class chrome
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.gmail.com/");
        driver.manage().window().maximize();
        // find web element and send some text to  it
        driver.findElement(By.id("identifierId")).sendKeys("chapzchnz@gmail.com");
        driver.findElement(By.id("identifierNext")).click();

        driver.wait(200);

//
//        driver.findElement(By.className("whsOnd")).sendKeys("chapzchnz@gmail.com");
//        driver.findElement(By.id("passwordNext")).click();

        String at = driver.getTitle();
        String et ="gmail";
        driver.close();
        if (at.equalsIgnoreCase(et)) {
            System.out.println("Test Successful");
}
        else {
           System.out.println("Text failure");

        }
}
}