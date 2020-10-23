package ru.stqa.pft.addressbook.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;

public class GroupModificationTests extends TestBase {

  @Test
  public void testGroupModification()
  {

    app.navigationHelper.gotoGroupPage();
    if (!app.groupHelper.isThereAGroup()) {
      app.groupHelper.createGroup(new GroupData("test1",null,null));
    }
    int before = app.groupHelper.getGroupCount();
    app.groupHelper.SelectGroup(By.name("selected[]"));
    app.groupHelper.initGroupModification();
    app.groupHelper.fillGroupFrom(new GroupData("2323","2323","234234"));
    app.groupHelper.submitGroupModification();
    app.navigationHelper.gotoGroupPage();
    int after = app.groupHelper.getGroupCount();
    Assert.assertEquals(after,before);
  }
}
