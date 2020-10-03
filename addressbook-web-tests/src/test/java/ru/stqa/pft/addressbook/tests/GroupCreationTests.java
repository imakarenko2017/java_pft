package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.tests.model.GroupData;

public class GroupCreationTests extends TestBase {

  @Test
  public void testGroupCreation() throws Exception {
    app.gotoGroupPage("groups");
    app.initGroupCreation("new");
    app.fillGroupFrom(new GroupData("test", "test", "group11"));
    app.initGroupCreation("submit");
    app.gotoGroupPage("groups");

  }


}
