package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.stqa.pft.addressbook.model.GroupData;

public class GroupHelper extends HelperBase {

  public GroupHelper(WebDriver wd) {
    super(wd);
  }

  public void fillGroupFrom(GroupData groupData) {
    type(By.name("group_name"),groupData.getName());
    type(By.name("group_header"),groupData.getHeader());
    type(By.name("group_footer"),groupData.getFooter());



  }


  public void submitGroupCreation() {
    click(By.name("submit"));
  }

  public void initGroupCreation(String s) {
    click(By.xpath("//input[@name='new']"));
  }

  public void DeleteSelectedGroups() {
    click(By.name("delete"));
  }

  public void SelectGroup(By name) {
    click(By.name("selected[]"));
  }

  public void initGroupModification() {
    click(By.name("edit"));
  }

  public void gotoGroupPage(){

      if (isElementPresent(By.tagName("h1"))
              && wd.findElement(By.tagName("h1")).getText().equals("Groups")
              && isElementPresent(By.name("new"))){
        return;
      }
      click(By.linkText("groups"));
      }

  public void submitGroupModification() {
    click(By.name("update"));
  }

  public void createGroup(GroupData group) {
    initGroupCreation("new");
    fillGroupFrom(group);
    submitGroupCreation();
    gotoGroupPage();
  }

  public boolean isThereAGroup() {
    return isElementPresent(By.name("selected[]"));
  }
}
