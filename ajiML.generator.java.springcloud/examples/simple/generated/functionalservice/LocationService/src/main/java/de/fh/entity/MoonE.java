package de.fh.entity;
import org.springframework.data.annotation.Id;

public class MoonE {

  @Id
  private Integer id;
  private String moonName;

  public MoonE() {
  }

  public MoonE(
  			String moonName,
			int id) {
   	this.moonName = moonName;
    this.id = id;
  }

  public String getMoonName() {
    return moonName;
  }

  public void setMoonName(String moonName) {
    this.moonName = moonName;
  }





  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }
}

