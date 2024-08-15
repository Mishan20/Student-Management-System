package com.ims.studentmanagementapp.repo;

import com.ims.studentmanagementapp.entity.Batch;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BatchRepo extends JpaRepository<Batch,Integer> {
}
