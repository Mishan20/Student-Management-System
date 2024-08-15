package com.ims.studentmanagementapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CourseSaveDTO {

    private int courseid;
    private String coursename;
    private String syllabus;
    private String duration;
}
