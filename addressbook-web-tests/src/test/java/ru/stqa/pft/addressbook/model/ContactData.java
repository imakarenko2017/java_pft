package ru.stqa.pft.addressbook.model;

import java.util.Objects;

public class ContactData {
  private int id;
  private final String name;
  private final String middlename;
  private final String lastname;
  private final String nick;
  private final String company;
  private final String address;
  private final String phone;


  private final String email;
  private final String dbirth;
  private final String dmonth;
  private final String dyear;
  private String group;

  public ContactData(String name, String middlename, String lastname, String nick, String company, String address, String phone, String email, String dbirth, String dmonth, String dyear,String group) {
    this.id = Integer.MAX_VALUE;
    this.name = name;
    this.middlename = middlename;
    this.lastname = lastname;
    this.nick = nick;
    this.company = company;
    this.address = address;
    this.phone = phone;
    this.email = email;
    this.dbirth = dbirth;
    this.dmonth = dmonth;
    this.dyear = dyear;
    this.group = group;
  }

  public String getName() {
    return name;
  }

  public String getMiddlename() {
    return middlename;
  }

  public String getLastname() {
    return lastname;
  }

  public String getNick() {
    return nick;
  }

  public String getCompany() {
    return company;
  }

  public String getAddress() {
    return address;
  }

  public String getPhone() {
    return phone;
  }

  public String getEmail() {
    return email;
  }

  public String getDbirth() {
    return dbirth;
  }

  public String getDmonth() {
    return dmonth;
  }

  public String getDyear() {
    return dyear;
  }

  public String getGroup() {
    return group;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ContactData that = (ContactData) o;
    return Objects.equals(name, that.name) &&
            Objects.equals(lastname, that.lastname);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, lastname);
  }
}
