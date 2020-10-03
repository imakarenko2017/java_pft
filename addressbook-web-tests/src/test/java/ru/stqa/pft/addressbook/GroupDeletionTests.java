package ru.stqa.pft.addressbook;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class GroupDeletionTests extends TestBase {


  @Test
  public void TestGroupDeletion() throws Exception {
    gotoGroupPage("groups");
    SelectGroup(By.name("selected[]"));
    DeleteSelectedGroups(By.xpath("(//input[@name='delete'])[2]"));
    gotoGroupPage("groups");

  }


}
