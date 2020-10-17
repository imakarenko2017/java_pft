package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactCreationTests extends TestBase {

  @Test
  public void testContactCreation() throws Exception {
    app.navigationHelper.gotoHomePage();
    app.contactHelper.createContact(new ContactData("Chloe","Christine","McKinley","Ch","No","4 Sov 24","123-35-3","christina@mail.ru","01","January","2017","234234"));

  }


}
