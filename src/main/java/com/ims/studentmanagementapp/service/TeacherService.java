package com.ims.studentmanagementapp.service;

import com.ims.studentmanagementapp.dto.TeacherDTO;
import com.ims.studentmanagementapp.dto.TeacherSaveDTO;
import com.ims.studentmanagementapp.dto.TeacherUpdateDTO;

import java.util.List;

public interface TeacherService {

    String addTeacher(TeacherSaveDTO teacherSaveDTO);
    List<TeacherDTO> getAllTeachers();
    String updateTeacher(TeacherUpdateDTO teacherUpdateDTO);
    boolean deleteTeacher(int id);
}
