package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;

public class GroupCreationTests extends TestBase {

  @Test
  public void testGroupCreation() throws Exception {
   app.navigationHelper.gotoGroupPage();
    int before = app.groupHelper.getGroupCount();
   app.groupHelper.createGroup(new GroupData("test1",null,"name"));
    int after = app.groupHelper.getGroupCount();
    Assert.assertEquals(after,before+1);
  }


}
