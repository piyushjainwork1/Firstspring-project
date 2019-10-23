package com.school.studentDetails.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.school.studentDetails.model.Classes;
import com.school.studentDetails.model.Students;
import com.school.studentDetails.pojo.CompleteClassInfo;
import com.school.studentDetails.pojo.CustomClassInfo;
import com.school.studentDetails.repository.ClassRepository;
import com.school.studentDetails.repository.StudentRepository;
import com.school.studentDetails.util.Conversion;

@Service
public class ClassService {

  @Autowired
  ClassRepository classrepo;
  @Autowired
  StudentRepository studentrepo;

  public void postDetails(CompleteClassInfo completeinfo) {

    Classes cobj = new Classes();

    cobj.setName(completeinfo.getClassName());
    cobj.setNameOfTopper(completeinfo.getTopperName());
    cobj.setNoOfGirls(completeinfo.getGirlsStrength());
    cobj.setNoOfStudents(completeinfo.getClassStrength());

    classrepo.save(cobj);

  }

  public List<CustomClassInfo> getTopperName() {
    List<Classes> classList = classrepo.findAll();

    List<CustomClassInfo> custlist = new ArrayList<>();

    for (int i = 0; i < classList.size(); i++) {
      Classes classobj = classList.get(i);


      CustomClassInfo obj = new CustomClassInfo();

      obj.setNoOfStudents(classobj.getNoOfStudents());
      obj.setToppername(classobj.getNameOfTopper());


      custlist.add(obj);

    }

    return custlist;
  }

  public String getClassName() {


    List<Classes> classlist = classrepo.findAll();


    for (int i = 0; i < classlist.size(); i++) {
      Classes classobj = classlist.get(i);

      String name = classobj.getName();

      int classint = Conversion.stringToInt(name);

      List<Students> studentlist = studentrepo.findByStuclass(classint);

      System.out
          .println("student records for class" + " " + name + " studnets " + studentlist.size());


    }

    return null;
  }



}
