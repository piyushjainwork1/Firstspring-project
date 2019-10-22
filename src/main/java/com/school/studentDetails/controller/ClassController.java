package com.school.studentDetails.controller;

import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.school.studentDetails.pojo.CompleteClassInfo;
import com.school.studentDetails.pojo.CustomClassInfo;
import com.school.studentDetails.service.ClassService;

@RestController
public class ClassController {

  @Autowired
  ClassService service;

  @PostMapping("/Classes")
  public void postClassDetails(@Valid @RequestBody CompleteClassInfo completeclass) {
    service.postDetails(completeclass);


  }

  @GetMapping("/Classes")
  public List<CustomClassInfo> getSpecificDetails() {
    return service.getTopperName();
  }

  @GetMapping("/Classes/byname")
  public void getspecific() {
    service.getClassName();
  }


}
