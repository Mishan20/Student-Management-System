package com.ims.studentmanagementapp.repo;

import com.ims.studentmanagementapp.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepo extends JpaRepository<Teacher, Integer> {
}
