package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactDeletionTests extends TestBase {

  @Test
  public void testContactDeletion(){
    app.contactHelper.gotoContactPage();
    if (!app.contactHelper.isThereAContact()) {
      app.contactHelper.createContact(new ContactData("Inna", "middlename", "Makarenko", "imakarenko", "Vintelligent,Inc", "1567 Brooklyne MA", "123842", "inna.makarenko@gmail.com", "3", "March", "1980","[none]"));
    }
    app.contactHelper.selectFirstContact();
    app.contactHelper.deleteContact();
    app.contactHelper.returnToHomePage();
  }

}
