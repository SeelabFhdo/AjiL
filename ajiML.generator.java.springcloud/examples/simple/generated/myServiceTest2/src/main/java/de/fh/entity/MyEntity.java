package de.fh.entity;
import org.springframework.data.annotation.Id;

public class MyEntity {

  @Id
  private Integer id;
  private int age;
  private boolean booleanAttribute;

  public MyEntity() {
  }

  public MyEntity(
   			int age,
   			boolean booleanAttribute,
			int id) {
   	this.age = age;
   	this.booleanAttribute = booleanAttribute; 
    this.id = id;
  }


  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public boolean getBooleanAttribute() {
    return booleanAttribute;
  }

  public void setBooleanAttribute(boolean booleanAttribute) {
    this.booleanAttribute = booleanAttribute;
  }



  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }
}

