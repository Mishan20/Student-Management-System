package com.ims.studentmanagementapp.service.IMPL;

import com.ims.studentmanagementapp.dto.StudentSaveDTO;
import com.ims.studentmanagementapp.entity.Student;
import com.ims.studentmanagementapp.repo.StudentRepo;
import com.ims.studentmanagementapp.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceIMPL implements StudentService {

    @Autowired
    private StudentRepo studentRepo;


    @Override
    public String addStudent(StudentSaveDTO studentSaveDTO) {

        Student student = new Student(
                studentSaveDTO.getStudentname(),
                studentSaveDTO.getAddress(),
                studentSaveDTO.getPhone()
        );
        studentRepo.save(student);
        return student.getStudentname();
    }
}
