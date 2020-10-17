package ru.stqa.pft.addressbook.tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;

public class GroupDeletionTests extends TestBase {


  @Test
  public void TestGroupDeletion() throws Exception {
    app.navigationHelper.gotoGroupPage();
    if (!app.groupHelper.isThereAGroup()) {
      app.groupHelper.createGroup(new GroupData("test1",null,"test1"));
    }
    app.groupHelper.SelectGroup(By.name("selected[]"));
    app.groupHelper.DeleteSelectedGroups();
    app.groupHelper.gotoGroupPage();

  }


}
