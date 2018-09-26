package de.fh.entity;
import org.springframework.data.annotation.Id;

public class MySecondEntity {

  @Id
  private Integer id;

  public MySecondEntity() {
  }

  public MySecondEntity(
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

