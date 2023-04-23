package common;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseClass {
    public static void launchApplication() {
        ChromeOptions c=new ChromeOptions();
        c.addArguments("--remote-allow-origins=*");
        WebDriver driver=new ChromeDriver(c);
        driver.get("https://www.google.com");
    }
}
