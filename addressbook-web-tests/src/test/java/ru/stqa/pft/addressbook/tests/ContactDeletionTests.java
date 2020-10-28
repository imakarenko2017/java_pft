package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

import java.util.Comparator;
import java.util.List;

public class ContactDeletionTests extends TestBase {

  @Test
  public void testContactDeletion(){
    app.contactHelper.gotoContactPage();
    if (!app.contactHelper.isThereAContact()) {
      app.contactHelper.createContact(new ContactData("Inna", "middlename", "Makarenko", "imakarenko", "Vintelligent,Inc", "1567 Brooklyne MA", "123842", "inna.makarenko@gmail.com", "3", "March", "1980","[none]"));
    }
    List<ContactData> before = app.contactHelper.getContactList();
    app.contactHelper.selectFirstContact();
    app.contactHelper.deleteContact();
    app.contactHelper.returnToHomePage();
    List<ContactData> after = app.contactHelper.getContactList();
    //comparing size
    Assert.assertEquals(after.size(),before.size()-1);
    //comparing lists
    before.remove(before.size()-1);
    Comparator<? super ContactData> byId = (c1, c2) -> Integer.compare(c1.getId(), c2.getId()) ;
    before.sort(byId);
    after.sort(byId);
    Assert.assertEquals(before,after);
  }

}
