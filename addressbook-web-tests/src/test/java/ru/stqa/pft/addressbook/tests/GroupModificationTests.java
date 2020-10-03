package ru.stqa.pft.addressbook.tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.tests.model.GroupData;

public class GroupModificationTests extends TestBase {

  @Test
  public void testGroupModification()
  {

    app.groupHelper.gotoGroupPage("groups");
    app.groupHelper.SelectGroup(By.name("selected[]"));
    app.groupHelper.initGroupModification();
    app.groupHelper.fillGroupFrom(new GroupData("2323","2323","234234"));
    app.groupHelper.submitGroupModification();
    app.groupHelper.gotoGroupPage("groups");
  }
}
