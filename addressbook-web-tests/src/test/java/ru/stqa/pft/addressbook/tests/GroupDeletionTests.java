package ru.stqa.pft.addressbook.tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class GroupDeletionTests extends TestBase {


  @Test
  public void TestGroupDeletion() throws Exception {
    app.navigationHelper.gotoGroupPage();
    app.groupHelper.SelectGroup(By.name("selected[]"));
    app.groupHelper.DeleteSelectedGroups(By.xpath("(//input[@name='delete'])[2]"));
    app.navigationHelper.gotoGroupPage();

  }


}
