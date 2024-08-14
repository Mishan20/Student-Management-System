package com.ims.studentmanagementapp.service;

import com.ims.studentmanagementapp.dto.StudentDTO;
import com.ims.studentmanagementapp.dto.StudentSaveDTO;
import com.ims.studentmanagementapp.dto.StudentUpdateDTO;

import java.util.List;

public interface StudentService {

    String addStudent(StudentSaveDTO studentSave);
    List<StudentDTO> getAllStudents();
    String updateStudent(StudentUpdateDTO studentUpdateDTO);
    boolean deleteStudent(int id);
}
