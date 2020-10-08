package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;

public class GroupCreationTests extends TestBase {

  @Test
  public void testGroupCreation() throws Exception {
    app.groupHelper.gotoGroupPage("groups");
    app.groupHelper.initGroupCreation("new");
    app.groupHelper.fillGroupFrom(new GroupData("test", "test", "group11"));
    app.groupHelper.submitGroupCreation("submit");
    app.groupHelper.gotoGroupPage("groups");

  }


}
