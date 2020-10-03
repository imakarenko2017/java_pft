package ru.stqa.pft.addressbook.tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class GroupDeletionTests extends TestBase {


  @Test
  public void TestGroupDeletion() throws Exception {
    app.gotoGroupPage("groups");
    app.SelectGroup(By.name("selected[]"));
    app.DeleteSelectedGroups(By.xpath("(//input[@name='delete'])[2]"));
    app.gotoGroupPage("groups");

  }


}
