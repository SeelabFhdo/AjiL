package de.fh.entity;
import javax.persistence.Id;
import javax.persistence.Entity;

@Entity
public class Customer {

  @Id
  private Integer id;
  private String name;
  private int id;
  private boolean trustful;
  private String nameChar;
  private float credit;

  public Customer() {
  }

  public Customer(
  			String name,
   			int id,
   			boolean trustful,
   			String nameChar,
  	 		float credit,
			int id) {
   	this.name = name;
   	this.id = id;
   	this.trustful = trustful; 
   	this.nameChar = nameChar;
    this.credit = credit; 
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public boolean getTrustful() {
    return trustful;
  }

  public void setTrustful(boolean trustful) {
    this.trustful = trustful;
  }

  public String getNameChar() {
    return nameChar;
  }

  public void setnameChar(String nameChar) {
    this.nameChar = nameChar;
  }

  public float getCredit() {
    return credit;
  }

  public void setCredit(float credit) {
    this.credit = credit;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }
}

