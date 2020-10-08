package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import ru.stqa.pft.addressbook.model.ContactData;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class ContactHelper extends HelperBase {


  public ContactHelper(WebDriver wd) {
    super(wd);
  }

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
    wd = new WebDriver() {
      @Override
      public void get(String url) {

      }

      @Override
      public String getCurrentUrl() {
        return null;
      }

      @Override
      public String getTitle() {
        return null;
      }

      @Override
      public List<WebElement> findElements(By by) {
        return null;
      }

      @Override
      public WebElement findElement(By by) {
        return null;
      }

      @Override
      public String getPageSource() {
        return null;
      }

      @Override
      public void close() {

      }

      @Override
      public void quit() {

      }

      @Override
      public Set<String> getWindowHandles() {
        return null;
      }

      @Override
      public String getWindowHandle() {
        return null;
      }

      @Override
      public TargetLocator switchTo() {
        return null;
      }

      @Override
      public Navigation navigate() {
        return null;
      }

      @Override
      public Options manage() {
        return null;
      }
    };
    wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  public void returnToHomePage() {
    wd.findElement(By.linkText("home")).click();
  }

  public void submitContactForm() {
    wd.findElement(By.xpath("(//input[@name='submit'])[2]")).click();
  }

  public void fillContactForm(ContactData contactData) {

    wd.findElement(By.name("firstname")).click();
    wd.findElement(By.name("firstname")).clear();
    wd.findElement(By.name("firstname")).sendKeys(contactData.getName());
    wd.findElement(By.name("middlename")).clear();
    wd.findElement(By.name("middlename")).sendKeys(contactData.getMiddlename());
    wd.findElement(By.name("lastname")).clear();
    wd.findElement(By.name("lastname")).sendKeys(contactData.getLastname());
    wd.findElement(By.name("nickname")).clear();
    wd.findElement(By.name("nickname")).sendKeys(contactData.getNick());
    wd.findElement(By.name("company")).clear();
    wd.findElement(By.name("company")).sendKeys(contactData.getCompany());
    wd.findElement(By.name("address")).click();
    wd.findElement(By.name("address")).clear();
    wd.findElement(By.name("address")).sendKeys(contactData.getAddress());
    wd.findElement(By.name("home")).click();
    wd.findElement(By.name("home")).clear();
    wd.findElement(By.name("home")).sendKeys(contactData.getPhone());
    wd.findElement(By.name("email")).click();
    wd.findElement(By.name("email")).clear();
    wd.findElement(By.name("email")).sendKeys(contactData.getEmail());
    wd.findElement(By.name("bday")).click();
    new Select(wd.findElement(By.name("bday"))).selectByVisibleText(contactData.getDbirth());
    wd.findElement(By.xpath("//option[@value='3']")).click();
    wd.findElement(By.name("bmonth")).click();
    new Select(wd.findElement(By.name("bmonth"))).selectByVisibleText(contactData.getDmonth());
    wd.findElement(By.xpath("//option[@value='March']")).click();
    wd.findElement(By.name("byear")).click();
    wd.findElement(By.name("byear")).clear();
    wd.findElement(By.name("byear")).sendKeys(contactData.getDyear());
  }

  public void modifyRandomContact(ContactData contactData) {
    wd.findElement(By.xpath("(//img[@alt='Edit'])")).click();
    wd.findElement(By.name("firstname")).click();
    wd.findElement(By.name("firstname")).clear();
    wd.findElement(By.name("firstname")).sendKeys(contactData.getName());
    wd.findElement(By.name("middlename")).clear();
    wd.findElement(By.name("middlename")).sendKeys(contactData.getMiddlename());
    wd.findElement(By.name("lastname")).clear();
    wd.findElement(By.name("lastname")).sendKeys(contactData.getLastname());
    wd.findElement(By.name("nickname")).clear();
    wd.findElement(By.name("nickname")).sendKeys(contactData.getNick());
    wd.findElement(By.name("company")).clear();
    wd.findElement(By.name("company")).sendKeys(contactData.getCompany());
    wd.findElement(By.name("address")).click();
    wd.findElement(By.name("address")).clear();
    wd.findElement(By.name("address")).sendKeys(contactData.getAddress());
    wd.findElement(By.name("home")).click();
    wd.findElement(By.name("home")).clear();
    wd.findElement(By.name("home")).sendKeys(contactData.getPhone());
    wd.findElement(By.name("email")).click();
    wd.findElement(By.name("email")).clear();
    wd.findElement(By.name("email")).sendKeys(contactData.getEmail());
    wd.findElement(By.name("bday")).click();
    new Select(wd.findElement(By.name("bday"))).selectByVisibleText(contactData.getDbirth());
    wd.findElement(By.xpath("//option[@value='3']")).click();
    wd.findElement(By.name("bmonth")).click();
    new Select(wd.findElement(By.name("bmonth"))).selectByVisibleText(contactData.getDmonth());
    wd.findElement(By.xpath("//option[@value='March']")).click();
    wd.findElement(By.name("byear")).click();
    wd.findElement(By.name("byear")).clear();
    wd.findElement(By.name("byear")).sendKeys(contactData.getDyear());

  }


  public void gotoContactPage() {
    //wd.get("http://localhost/addressbook/");
    returnToHomePage();
  }

  public void editFirstContact(){
    wd.findElement(By.xpath("//img[@alt='Edit']")).click();
  }

  @AfterClass(alwaysRun = true)
  public void tearDown() throws Exception {
    wd.quit();

  }

  private boolean isElementPresent(By by) {
    try {
      wd.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      wd.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }


  public void ModifyContactForm() {
    wd.findElement(By.xpath("//input[@name='update'][2]")).click();
  }

  public void selectFirstContact() {
    wd.findElement(By.name("selected[]")).click();
  }

  public void deleteContact() {
    wd.findElement(By.xpath("//input[@value='Delete']")).click();
    wd.switchTo().alert().accept();
  }
}
