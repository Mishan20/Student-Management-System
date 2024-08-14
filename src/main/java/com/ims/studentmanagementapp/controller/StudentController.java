package com.ims.studentmanagementapp.controller;

import com.ims.studentmanagementapp.dto.StudentSaveDTO;
import com.ims.studentmanagementapp.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin // This annotation is used to handle the request from a different domain
@RequestMapping("/api/v1/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/save")
    public String saveStudent(@RequestBody StudentSaveDTO studentSaveDTO) {
        String stname = studentService.addStudent(studentSaveDTO);
        return stname;
    }
}
