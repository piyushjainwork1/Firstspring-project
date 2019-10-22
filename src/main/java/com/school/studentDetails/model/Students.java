package com.school.studentDetails.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

@Entity
@Table(name = "StudentInfo")
public class Students {
  @Id
  @Size(min = 2)
  private String stuname;

  @Min(value = 6)
  private int stuRollno;


  private int stuclass;
  @Email
  private String stuemail;

  public String getStuname() {
    return stuname;
  }

  public void setStuname(String stuname) {
    this.stuname = stuname;
  }

  public int getStuRollno() {
    return stuRollno;
  }

  public void setStuRollno(int stuRollno) {
    this.stuRollno = stuRollno;
  }

  public int getStuclass() {
    return stuclass;
  }

  public void setStuclass(int stuclass) {
    this.stuclass = stuclass;
  }

  public String getStuemail() {
    return stuemail;
  }

  public void setStuemail(String stuemail) {
    this.stuemail = stuemail;
  }

  @Override
  public String toString() {
    return String.format("Students [stuname=%s, stuRollno=%s, stuclass=%s, stuemail=%s]", stuname,
        stuRollno, stuclass, stuemail);
  }



}
