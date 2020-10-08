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

    wd.findElement(By.name("group_header")).sendKeys(groupData.getHeader());
    wd.findElement(By.name("group_footer")).clear();
    wd.findElement(By.name("group_footer")).sendKeys(groupData.getFooter());
    submitGroupCreation("group_name");

  }
  public void gotoGroupPage(String groups) {
    click(By.linkText("groups"));
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
