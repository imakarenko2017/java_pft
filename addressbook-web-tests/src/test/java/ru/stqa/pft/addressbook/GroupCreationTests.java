package ru.stqa.pft.addressbook;

import org.testng.annotations.Test;

public class GroupCreationTests extends TestBase {

  @Test
  public void testGroupCreation() throws Exception {
    gotoGroupPage("groups");
    initGroupCreation("new");
    fillGroupFrom(new GroupData("test", "test", "group11"));
    submitGroupCreation("submit");
    gotoGroupPage("groups");

  }


}
