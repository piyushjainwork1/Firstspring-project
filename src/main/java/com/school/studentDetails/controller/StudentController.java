package com.school.studentDetails.controller;

import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.school.studentDetails.pojo.CustomStudent;
import com.school.studentDetails.pojo.StudentInput;
import com.school.studentDetails.pojo.StudentNameEmail;
import com.school.studentDetails.service.StudentService;

@RestController
public class StudentController {

  @Autowired
  StudentService service;

  @PostMapping("/StudentInfo")
  public void poststudentinfo(@Valid @RequestBody StudentInput studentinput) {
    service.save(studentinput);
  }

  @GetMapping("/StudentInfo")
  public List<CustomStudent> getCustomStudentInfo() {
    return service.getCustomElements();
  }

  @GetMapping("/StudentInfo/getnames")
  public List<StudentNameEmail> getNameEmailInfo() {
    return service.getNameNoEmail();
  }

  @GetMapping("/StudentInfo/getdetails")
  public List<StudentInput> getalldetails() {

    return service.getStudentsDetails();


  }
}
