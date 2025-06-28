package com.ums.ums.controller;

import com.ums.ums.DTO.StudentDTO;
import com.ums.ums.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class Student {
    private final StudentService studentService;

    @PostMapping("/student/insert_student")
    public void insertStudent(@RequestBody StudentDTO studentDTO) {
        studentService.inserStudent(studentDTO);

    }
}
