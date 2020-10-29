package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;

import java.util.List;

public class GroupDeletionTests extends TestBase {

  @BeforeMethod
  public void ensure_preconditions()  {
    app.navigationHelper.gotoGroupPage();
    if (!app.groupHelper.isThereAGroup()) {
      app.groupHelper.createGroup(new GroupData("test1",null,null));
    }
  }


  @Test
  public void TestGroupDeletion() throws Exception {

    List<GroupData> before = app.groupHelper.getGroupList();
    app.groupHelper.selectGroup(before.size()-1);
    app.groupHelper.DeleteSelectedGroups();
    app.groupHelper.gotoGroupPage();
    List<GroupData> after = app.groupHelper.getGroupList();
    Assert.assertEquals(after.size(),before.size()-1);
    before.remove(before.size()-1);
    Assert.assertEquals(before,after);
    }

  }



