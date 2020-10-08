package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationHelper extends HelperBase {


  public NavigationHelper(WebDriver wd) {
    super(wd);
  }


  public void gotoHomePage(){
if (isElementPresent(By.id("maintable"))){
  return;
  }
  else {
    click(By.linkText("home"));
  }
  }
}
