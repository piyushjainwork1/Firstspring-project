package com.school.studentDetails.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.school.studentDetails.model.Classes;

@Repository
public interface ClassRepository extends JpaRepository<Classes, Long> {

}
