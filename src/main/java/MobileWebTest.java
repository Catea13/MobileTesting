import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;

public class MobileWebTest {
    @Test
    public void incorectLogin() throws MalformedURLException {
        URL serverUrl=new URL("http://127.0.0.1:4723/wd/hub");
        DesiredCapabilities desiredCapabilities=new DesiredCapabilities();//nastraivaet WebDriver
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,"android");
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,"10.3");
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"android7");
        desiredCapabilities.setCapability(MobileCapabilityType.BROWSER_NAME,"Android");
        desiredCapabilities.setCapability(MobileCapabilityType.FULL_RESET,true);//testi ne budut zavisiti drug o druga i budut perezapuscatisea
        AppiumDriver driver=new AndroidDriver(serverUrl,desiredCapabilities);
        WebDriverWait wait=new WebDriverWait(driver,30);
        driver.get("https://twitter.com/twitter");
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/a[1]/div[1]/span[1]/span[1]")).click();
        driver.findElement(By.xpath("//body/div[@id='react-root']/div[1]/div[1]/div[2]/main[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/label[1]/div[1]/div[2]/div[1]/input[1]")).sendKeys("TEST1");
        driver.findElement(By.xpath("//*[@id=\"react-root\"]/div/div/div[2]/main/div/div/div/div[2]/div[2]/div/div[3]/label/div/div[2]/div/input")).sendKeys("326529652");
        driver.findElement(By.xpath("//*[@id=\"react-root\"]/div/div/div[2]/main/div/div/div/div[2]/div[1]/div/div/div/div[3]/div/div/span/span")).click();


    }

}

