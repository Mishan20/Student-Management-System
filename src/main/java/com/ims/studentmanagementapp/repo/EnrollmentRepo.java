package com.ims.studentmanagementapp.repo;

import com.ims.studentmanagementapp.entity.Enrollment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnrollmentRepo extends JpaRepository<Enrollment, Integer> {
}
