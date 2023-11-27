
package model;

/**
 *
 * @author MONTENEGRO
 */
public class Customer {
  private String name;
  private String phone;
  private String typeEvent;
  private String Date;
  private String numberOfTable;
  private String typeCusine;
  private String numbreOfPeople;
  private String typeOfTable;
  private String numberOfDay;
  private String room;  

  public Customer() {
  }

  public Customer(String name, String phone, String typeEvent, String Date, String typeCusine, String numbreOfPeople) {
    this.name = name;
    this.phone = phone;
    this.typeEvent = typeEvent;
    this.Date = Date;
    this.typeCusine = typeCusine;
    this.numbreOfPeople = numbreOfPeople;
  }
  

  public Customer(String name, String phone, String typeEvent, String Date, String numberOfTable, String typeCusine, String numbreOfPeople, String typeOfTable, String numberOfDay, String room) {
    this.name = name;
    this.phone = phone;
    this.typeEvent = typeEvent;
    this.Date = Date;
    this.numberOfTable = numberOfTable;
    this.typeCusine = typeCusine;
    this.numbreOfPeople = numbreOfPeople;
    this.typeOfTable = typeOfTable;
    this.numberOfDay = numberOfDay;
    this.room = room;
  }

  public Customer(String name, String phone, String typeEvent, String Date, String numberOfTable, String typeCusine, String numbreOfPeople, String typeOfTable) {
    this.name = name;
    this.phone = phone;
    this.typeEvent = typeEvent;
    this.Date = Date;
    this.numberOfTable = numberOfTable;
    this.typeCusine = typeCusine;
    this.numbreOfPeople = numbreOfPeople;
    this.typeOfTable = typeOfTable;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public String getTypeEvent() {
    return typeEvent;
  }

  public void setTypeEvent(String typeEvent) {
    this.typeEvent = typeEvent;
  }

  public String getDate() {
    return Date;
  }

  public void setDate(String Date) {
    this.Date = Date;
  }

  public String getNumberOfTable() {
    return numberOfTable;
  }

  public void setNumberOfTable(String numberOfTable) {
    this.numberOfTable = numberOfTable;
  }

  public String getTypeCusine() {
    return typeCusine;
  }

  public void setTypeCusine(String typeCusine) {
    this.typeCusine = typeCusine;
  }

  public String getNumbreOfPeople() {
    return numbreOfPeople;
  }

  public void setNumbreOfPeople(String numbreOfPeople) {
    this.numbreOfPeople = numbreOfPeople;
  }

  public String getTypeOfTable() {
    return typeOfTable;
  }

  public void setTypeOfTable(String typeOfTable) {
    this.typeOfTable = typeOfTable;
  }

  public String getNumberOfDay() {
    return numberOfDay;
  }

  public void setNumberOfDay(String numberOfDay) {
    this.numberOfDay = numberOfDay;
  }

  public String getRoom() {
    return room;
  }

  public void setRoom(String room) {
    this.room = room;
  }
  
  
  
  
  
}
