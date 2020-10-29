package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;

import java.util.List;

public class GroupDeletionTests extends TestBase {

  @BeforeMethod
  public void ensure_preconditions()  {
    app.group().gotoGroupPage();
    if (app.group().list().size()==0) {
      app.group().create(new GroupData("test1",null,null));
    }
  }


  @Test
  public void TestGroupDeletion() throws Exception {

    List<GroupData> before = app.group().list();
    int ind=before.size()-1;
    app.group().delete(ind);
    List<GroupData> after = app.group().list();
    Assert.assertEquals(after.size(),before.size()-1);
    before.remove(before.size()-1);
    Assert.assertEquals(before,after);
    }


  }





