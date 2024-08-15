package com.ims.studentmanagementapp.service;

import com.ims.studentmanagementapp.dto.EnrollmentDTO;
import com.ims.studentmanagementapp.dto.EnrollmentSaveDTO;
import com.ims.studentmanagementapp.dto.EnrollmentUpdateDTO;

import java.util.List;

public interface EnrollmentService {

    String addEnrollment(EnrollmentSaveDTO entrollmentSaveDTO);
    List<EnrollmentDTO> getAllEnrollments();
    String updateEnrollment(EnrollmentUpdateDTO enrollmentUpdateDTO);
    boolean deleteEnrollment(int id);
}
