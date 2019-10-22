package com.school.studentDetails.pojo;

import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;
import org.springframework.stereotype.Component;

@Component
public class StudentInput {

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
    return String.format("StudentInput [stuname=%s, stuRollno=%s, stuclass=%s, stuemail=%s]",
        stuname, stuRollno, stuclass, stuemail);
  }



}
