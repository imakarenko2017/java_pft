package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

import java.util.Comparator;
import java.util.List;

public class ContactModificationTests extends TestBase {

  @Test
  public void contactModificationTest() {

    app.contactHelper.gotoContactPage();
    if (!app.contactHelper.isThereAContact()) {
      app.contactHelper.createContact(new ContactData("Inna", "middlename", "Makarenko", "imakarenko", "Vintelligent,Inc", "1567 Brooklyne MA", "123842", "inna.makarenko@gmail.com", "3", "March", "1980","[none]"));
    }
    List<ContactData> before = app.contactHelper.getContactList();
    app.contactHelper.editFirstContact();
    app.contactHelper.fillContactForm(new ContactData ("new name","dsfjksdhfk","Makarenko","sdsdf","VT","Brookline","1232131","inna@vintellligent.com","3","March","1980",null),false);
    app.contactHelper.ModifyContactForm();
    List<ContactData> after = app.contactHelper.getContactList();
    Comparator<? super ContactData> byId = (c1, c2) -> Integer.compare(c1.getId(), c2.getId()) ;
    before.sort(byId);
    after.sort(byId);
    app.contactHelper.returnToHomePage();

  }
}
