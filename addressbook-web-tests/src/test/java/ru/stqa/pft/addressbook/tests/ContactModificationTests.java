package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactModificationTests extends TestBase {

  @Test
  public void contactModificationTest() {

    app.contactHelper.gotoContactPage();
    if (!app.contactHelper.isThereAContact()) {
      app.contactHelper.createContact(new ContactData("Inna", "middlename", "Makarenko", "imakarenko", "Vintelligent,Inc", "1567 Brooklyne MA", "123842", "inna.makarenko@gmail.com", "3", "March", "1980","[none]"));
    }
    app.contactHelper.editFirstContact();
    app.contactHelper.fillContactForm(new ContactData ("new name","dsfjksdhfk","Makarenko","sdsdf","VT","Brookline","1232131","inna@vintellligent.com","3","March","1980",null),false);
    app.contactHelper.ModifyContactForm();
    app.contactHelper.returnToHomePage();

  }
}
