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

    submitGroupCreation("group_name");

  }


  public void submitGroupCreation(String submit) {
    click(By.name(submit));
  }

  public void initGroupCreation(String s) {
    click(By.xpath("//input[@name='new']"));
  }

  public void DeleteSelectedGroups(By xpath) {
    click(By.name("delete"));
  }

  public void SelectGroup(By name) {
    click(By.name("selected[]"));
  }

  public void initGroupModification() {
    click(By.name("edit"));
  }

  public void submitGroupModification() {
    click(By.name("update"));
  }
}
