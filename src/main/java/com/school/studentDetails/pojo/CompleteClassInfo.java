package com.school.studentDetails.pojo;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

public class CompleteClassInfo {

  private String topperName;

  public String getTopperName() {
    return topperName;
  }

  public void setTopperName(String topperName) {
    this.topperName = topperName;
  }

  @NotBlank
  private String className;
  @Min(value = 15)
  private int classStrength;
  @Min(value = 2)
  private int girlsStrength;

  public String getClassName() {
    return className;
  }

  public void setClassName(String className) {
    this.className = className;
  }

  public int getClassStrength() {
    return classStrength;
  }

  public void setClassStrength(int classStrength) {
    this.classStrength = classStrength;
  }

  public int getGirlsStrength() {
    return girlsStrength;
  }

  public void setGirlsStrength(int girlsStrength) {
    this.girlsStrength = girlsStrength;
  }

}

