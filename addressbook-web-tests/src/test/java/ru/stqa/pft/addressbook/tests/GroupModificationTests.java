package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;

import java.util.HashSet;
import java.util.List;

public class GroupModificationTests extends TestBase {

  @Test
  public void testGroupModification()
  {

    app.navigationHelper.gotoGroupPage();
    if (!app.groupHelper.isThereAGroup()) {
      app.groupHelper.createGroup(new GroupData("test1",null,null));
    }
    List<GroupData> before = app.groupHelper.getGroupList();
    app.groupHelper.selectGroup(before.size()-1);
    app.groupHelper.initGroupModification();
    GroupData group = new GroupData(before.get(before.size()-1).getId(),"2323","2323",null);
    app.groupHelper.fillGroupFrom(group);
    app.groupHelper.submitGroupModification();
    app.navigationHelper.gotoGroupPage();
    List<GroupData> after = app.groupHelper.getGroupList();
    Assert.assertEquals(after.size(),before.size());

    before.remove(before.size()-1);
    before.add(group);
    Assert.assertEquals(new HashSet<Object>(before),new HashSet<Object>(after));
  }
}
