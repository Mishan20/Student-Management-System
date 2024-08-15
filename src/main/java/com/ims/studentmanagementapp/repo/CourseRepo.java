package com.ims.studentmanagementapp.repo;

import com.ims.studentmanagementapp.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepo extends JpaRepository<Course, Integer> {
}
