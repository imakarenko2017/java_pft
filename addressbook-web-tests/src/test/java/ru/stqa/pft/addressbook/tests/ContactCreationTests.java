package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

import java.util.Comparator;
import java.util.List;

public class ContactCreationTests extends TestBase {

  @Test
  public void testContactCreation() throws Exception {
    app.navigationHelper.gotoHomePage();
    List<ContactData> before = app.contactHelper.getContactList();
    ContactData contact = new ContactData("Chloe","Christine","McKinley","Ch","No","4 Sov 24","123-35-3","christina@mail.ru","01","January","2017","[none]");
    app.contactHelper.createContact(contact);
    List<ContactData> after = app.contactHelper.getContactList();
    //comparing size
    Assert.assertEquals(after.size(),before.size()+1);
    //comparing contacts (first, last name)
    contact.setId(after.stream().max((c1, c2) -> Integer.compare(c1.getId(),c2.getId())).get().getId());
    before.add(contact);
    Comparator<? super ContactData> byId = (c1, c2) -> Integer.compare(c1.getId(), c2.getId());
    before.sort(byId);
    after.sort(byId);
    Assert.assertEquals(before,after);
  }


}
