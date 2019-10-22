package com.school.studentDetails.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.school.studentDetails.model.Students;

@Repository
public interface StudentRepository extends JpaRepository<Students, Long> {
  List<Students> findByStuclass(int s);



}
