package com.school.studentDetails.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.school.studentDetails.model.Students;
import com.school.studentDetails.pojo.CustomStudent;
import com.school.studentDetails.pojo.StudentInput;
import com.school.studentDetails.pojo.StudentNameEmail;
import com.school.studentDetails.repository.StudentRepository;



@Service
public class StudentService {


  @Autowired
  StudentRepository studentrepo;

  public String save(StudentInput studentinput) {

    Students student = new Students();

    student.setStuclass(studentinput.getStuclass());

    student.setStuemail(studentinput.getStuemail());

    student.setStuname(studentinput.getStuname());

    student.setStuRollno(studentinput.getStuRollno());


    studentrepo.save(student);



    return null;
  }

  public List<CustomStudent> getCustomElements() {
    List<Students> list = studentrepo.findAll();

    List<CustomStudent> custlist = new ArrayList<>();

    for (int i = 0; i < list.size(); i++) {
      Students studentobj = list.get(i);

      CustomStudent obj = new CustomStudent();

      obj.setEmail(studentobj.getStuemail());

      obj.setRollno(studentobj.getStuRollno());



      custlist.add(obj);

    }

    return custlist;

  }



  public List<StudentNameEmail> getNameNoEmail() {
    List<Students> list1 = studentrepo.findAll();


    List<StudentNameEmail> nameEmailList = new ArrayList<>();

    for (int i = 0; i < list1.size(); i++) {
      Students stuobj = list1.get(i);

      StudentNameEmail studentobj = new StudentNameEmail();

      studentobj.setEmail(stuobj.getStuemail());
      studentobj.setName(stuobj.getStuname());

      nameEmailList.add(studentobj);

    }

    return nameEmailList;

  }

  public List<StudentInput> getStudentsDetails() {

    List<Students> list2 = studentrepo.findAll();
    List<StudentInput> studentDetails = new ArrayList<>();
    for (int i = 0; i < list2.size(); i++) {
      Students studentobj = list2.get(i);

      StudentInput inputobj = new StudentInput();

      inputobj.setStuclass(studentobj.getStuclass());
      inputobj.setStuemail(studentobj.getStuemail());
      inputobj.setStuname(studentobj.getStuname());
      inputobj.setStuRollno(studentobj.getStuRollno());

      studentDetails.add(inputobj);
    }
    return studentDetails;
  }


  // public List<CustomStudent> getStudentsList() {
  // // Create empty list of custome Stuent
  // // Fetch list from repository
  // // then iterate list which has come from repository
  // // inside for loop create Custom Student object
  // // Assign value in that
  // // append in list
  // // Return final list
  //
  // List<CustumStudent> list= new ArrayList<CustomStudent>();
  //
  // }

}
