package com.school.studentDetails;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan()
@SpringBootApplication
public class StudentDetailsApplication {

  public static void main(String[] args) {
    SpringApplication.run(StudentDetailsApplication.class, args);



  }

}
