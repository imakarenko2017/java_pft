package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;

import java.util.Comparator;
import java.util.List;

public class GroupModificationTests extends TestBase {


  @BeforeMethod
  public void ensure_preconditions()  {
    app.navigationHelper.gotoGroupPage();
    if (!app.groupHelper.isThereAGroup()) {
      app.groupHelper.createGroup(new GroupData("test1",null,null));
    }
  }


  @Test
  public void testGroupModification()
  {

    List<GroupData> before = app.groupHelper.getGroupList();
    GroupData group = new GroupData(before.get(before.size()-1).getId(),"2323","2323",null);
    int index = before.size()-1;
    app.groupHelper.modifyGroup(group, index);
    List<GroupData> after = app.groupHelper.getGroupList();
    Assert.assertEquals(after.size(),before.size());

    before.remove(index);
    before.add(group);
    Comparator<? super GroupData> byId = (g1,g2) -> Integer.compare(g1.getId(), g2.getId()) ;
    before.sort(byId);
    after.sort(byId);
    Assert.assertEquals(before,after);
  }


}
