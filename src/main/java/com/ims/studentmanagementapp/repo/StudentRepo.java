package com.ims.studentmanagementapp.repo;

import com.ims.studentmanagementapp.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student, Integer> {
}
