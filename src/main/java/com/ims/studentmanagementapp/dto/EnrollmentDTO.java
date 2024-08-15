package com.ims.studentmanagementapp.dto;

import com.ims.studentmanagementapp.entity.Batch;
import com.ims.studentmanagementapp.entity.Student;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class EnrollmentDTO {
    private int enrollid;
    private Student student;
    private Batch batch;
    private String joindate;
    private int fee;
}
