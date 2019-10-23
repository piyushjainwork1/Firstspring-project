package com.school.studentDetails.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.school.studentDetails.model.Students;

@Repository
public interface StudentRepository extends JpaRepository<Students, Long> {
  List<Students> findByStuclass(int s);

  // List<Students> findByStuemail(String email);

  @Query("select s from Students s where stuname like %?1")
  List<Students> findByStunameContain(String name1);

  // @Query("SELECT * FROM Students s where stuname = ?1",nativeQuery=true)
  // List<Students> findByStunameEndWith(String name2);

  // List<Students> findby

  List<Students> findByStuRollno(int rollno);

  List<Students> findByStuname(String name);


  // @Query("FROM Students WHERE stuemail= ?")
  // List<Students> findByStuemail(String email);
  //
  //
  // List<Students> findAllByStuemail(String email);

  // List<Students> findByStunameAndStuclass
}
