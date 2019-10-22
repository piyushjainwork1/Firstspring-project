package com.school.studentDetails.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

@Entity

public class Classes {
  @Id
  @NotBlank
  private String name;
  @Min(value = 20)
  private int noOfStudents;
  @Min(value = 5)
  private int noOfGirls;

  private String nameOfTopper;

  public String getNameOfTopper() {
    return nameOfTopper;
  }

  public void setNameOfTopper(String nameOfTopper) {
    this.nameOfTopper = nameOfTopper;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getNoOfStudents() {
    return noOfStudents;
  }

  public void setNoOfStudents(int noOfStudents) {
    this.noOfStudents = noOfStudents;
  }

  public int getNoOfGirls() {
    return noOfGirls;
  }

  public void setNoOfGirls(int noOfGirls) {
    this.noOfGirls = noOfGirls;
  }



}
