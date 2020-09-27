package ru.stqa.pft.addressbook;

public class ContactData {
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

  public ContactData(String name, String middlename, String lastname, String nick, String company, String address, String phone, String email, String dbirth, String dmonth, String dyear) {
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
}
