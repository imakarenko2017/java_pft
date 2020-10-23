package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;

import java.util.List;

public class GroupDeletionTests extends TestBase {


  @Test
  public void TestGroupDeletion() throws Exception {
    app.navigationHelper.gotoGroupPage();
    if (!app.groupHelper.isThereAGroup()) {
      app.groupHelper.createGroup(new GroupData("test1",null,"test1"));
    }
    List<GroupData> before = app.groupHelper.getGroupList();
    app.groupHelper.selectGroup(before.size());
    app.groupHelper.DeleteSelectedGroups();
    app.groupHelper.gotoGroupPage();
    List<GroupData> after = app.groupHelper.getGroupList();
    Assert.assertEquals(after.size(),before.size()-1);

  }


}
