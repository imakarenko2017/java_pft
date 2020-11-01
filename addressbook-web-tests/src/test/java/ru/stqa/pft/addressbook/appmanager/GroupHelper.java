package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ru.stqa.pft.addressbook.model.GroupData;
import ru.stqa.pft.addressbook.model.Groups;

import java.util.List;

public class GroupHelper extends HelperBase {

  public GroupHelper(WebDriver wd) {
    super(wd);
  }

  public void fillGroupFrom(GroupData groupData) {
    type(By.name("group_name"), groupData.getName());
    type(By.name("group_header"), groupData.getHeader());
    type(By.name("group_footer"), groupData.getFooter());


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

   public void initGroupModification() {
    click(By.name("edit"));
  }

  public void gotoGroupPage() {

    if (isElementPresent(By.tagName("h1"))
            && wd.findElement(By.tagName("h1")).getText().equals("Groups")
            && isElementPresent(By.name("new"))) {
      return;
    }
    click(By.linkText("groups"));
  }

  public void submitGroupModification() {
    click(By.name("update"));
  }

  public void create(GroupData group) {
    initGroupCreation("new");
    fillGroupFrom(group);
    submitGroupCreation();
    gotoGroupPage();
  }

  public boolean isThereAGroup() {
    return isElementPresent(By.name("selected[]"));
  }

  public int getGroupCount() {
    return wd.findElements(By.name("selected[]")).size();

  }


  public Groups all() {
    Groups groups = new Groups();
    List<WebElement> elements = wd.findElements(By.cssSelector("span.group"));
    for (WebElement element : elements) {
      String name = element.getText();
      int id = Integer.parseInt((element.findElement(By.tagName("input")).getAttribute("value")));
      groups.add(new GroupData().withId(id).withName(name));
    }
    return groups;
  }

  public void modify(GroupData group) {
    selectGroupbyId(group.getId());
    initGroupModification();
    fillGroupFrom(group);
    submitGroupModification();
    gotoGroupPage();
  }


  public void delete(GroupData deletedGroup) {
    selectGroupbyId(deletedGroup.getId());
    DeleteSelectedGroups();
    gotoGroupPage();
  }

  private void selectGroupbyId(int id) {
    wd.findElement(By.cssSelector("input[value='" + id + "']")).click();
  }
}