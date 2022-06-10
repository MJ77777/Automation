package newproject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;


public class newclass {
    public static void main(String[] args) throws InterruptedException {
        int hello1 =(int)(1+Math.random()*100);
        int hello2 =(int)(10+Math.random()*79);
String firstname="mike ";
        String lastname="fisher";
String username=firstname+lastname+hello1+hello2;
            String usernameverfiy=firstname.trim()+lastname.trim()+hello1+hello2;
String pass="Duotech2020";
        System.setProperty("webdriver.chrome.driver","C:\\Users\\majd1\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("http://qa-duotify.us-east-2.elasticbeanstalk.com/register.php");


        Assert.assertEquals(driver.getTitle(),"Welcome to Duotify!");
//        Thread.sleep(2000);
        driver.findElement(By.id("hideLogin")).click();
        driver.findElement(By.id("username")).sendKeys(username);
        driver.findElement(By.id("firstName")).sendKeys(firstname);
        driver.findElement(By.id("lastName")).sendKeys(lastname);
        driver.findElement(By.id("email")).sendKeys(hello2+"mike"+hello1+"fishe@gmail.com");
        driver.findElement(By.id("email2")).sendKeys(hello2+"mike"+hello1+"fishe@gmail.com");
        driver.findElement(By.id("password")).sendKeys(pass);
        driver.findElement(By.id("password2")).sendKeys(pass);
        driver.findElement(By.name("registerButton")).click();
        Assert.assertEquals(driver.getCurrentUrl(),"http://qa-duotify.us-east-2.elasticbeanstalk.com/browse.php?");

        String name=driver.findElement(By.id("nameFirstAndLast")).getText();
        if (name.equalsIgnoreCase(firstname+lastname)){
            System.out.print("Name on the left is matching ");}
        else{ throw new RuntimeException();}
        driver.findElement(By.id("nameFirstAndLast")).click();
        String name2=driver.findElement(By.className("userInfo")).getText();
        if (name2.equalsIgnoreCase(firstname+lastname)){
            System.out.print("Name on the main is matching");}
        else{ throw new RuntimeException();}
        driver.findElement(By.id("rafael")).click();
//        Assert.assertEquals(driver.getCurrentUrl(),"http://duotifyapp.us-east-2.elasticbeanstalk.com/register.php");
            Thread.sleep(2000);
            Assert.assertEquals(driver.getCurrentUrl(),"http://qa-duotify.us-east-2.elasticbeanstalk.com/register.php");
            driver.findElement(By.id("loginUsername")).sendKeys(usernameverfiy);
            driver.findElement(By.id("loginPassword")).sendKeys(pass);
            driver.findElement(By.name("loginButton")).click();
            String title=driver.findElement(By.className("pageHeadingBig")).getText();
            if (title.equalsIgnoreCase("You Might Also Like")){
                    System.out.print(" title on the main is matching");}
            else{ throw new RuntimeException();}
            driver.findElement(By.id("nameFirstAndLast")).click();
            driver.findElement(By.id("rafael")).click();
//            //

driver.quit();





////        driver.quit();




    }
}
