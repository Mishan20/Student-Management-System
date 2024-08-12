package com.ims.studentmanagementapp.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin // This annotation is used to handle the request from a different domain
@RequestMapping("/api/v1/student")
public class StudentController {
}
