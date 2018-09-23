package de.fh.entity;
import org.springframework.data.annotation.Id;

public class MyEntity {

  @Id
  private Integer id;

  public MyEntity() {
  }

  public MyEntity(
			int id) {
    this.id = id;
  }






  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }
}

