package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactCreationTests extends TestBase {

  @Test
  public void testContactCreation() throws Exception {
    app.sessionHelper.login("admin","secret");
    app.contactHelper.gotoContactPage();
    app.contactHelper.fillContactForm(new ContactData("Inna", "middlename", "Makarenko", "imakarenko", "Vintelligent,Inc", "1567 Brooklyne MA", "123842", "inna.makarenko@gmail.com", "3", "March", "1980","test1"),true);
    app.contactHelper.submitContactForm();
    app.contactHelper.returnToHomePage();
  }


}
