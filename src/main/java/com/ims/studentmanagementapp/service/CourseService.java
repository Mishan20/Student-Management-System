package com.ims.studentmanagementapp.service;

import com.ims.studentmanagementapp.dto.CourseDTO;
import com.ims.studentmanagementapp.dto.CourseSaveDTO;
import com.ims.studentmanagementapp.dto.CourseUpdateDTO;

import java.util.List;

public interface CourseService {

    String addCourse(CourseSaveDTO courseSaveDTO);
    List<CourseDTO> getAllCourses();
    String updateCourse(CourseUpdateDTO courseUpdateDTO);
    boolean deleteCourse(int id);
}
