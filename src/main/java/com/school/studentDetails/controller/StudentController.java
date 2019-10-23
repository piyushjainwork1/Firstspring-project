package com.school.studentDetails.controller;

import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.mashape.unirest.http.exceptions.UnirestException;
import com.school.studentDetails.model.Students;
import com.school.studentDetails.pojo.CustomStudent;
import com.school.studentDetails.pojo.StudentInput;
import com.school.studentDetails.pojo.StudentNameEmail;
import com.school.studentDetails.service.StudentService;
import com.school.studentDetails.service.UnirestService;
// import com.school.studentDetails.service.UnirestService;

@RestController
public class StudentController {
  @Autowired
  UnirestService apiservice;

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

  @GetMapping("/byrollno/{rollno}")
  public List<Students> byrollno(@PathVariable(value = ("rollno")) int rollno) {
    return service.byRollno(rollno);
  }

  @GetMapping("/name/{name}")
  public List<Students> byStudentName(@PathVariable(value = "name") String name) {
    return service.byStudentName(name);

  }

  @GetMapping("/endname/{name1}")
  public List<Students> bylastnameName(@PathVariable(value = "name1") String name1) {
    return service.bylastname(name1);
  }

  @GetMapping("/callingapi")
  public void usingunirest() throws UnirestException, Exception {

    apiservice.callingUni();

  }
}


