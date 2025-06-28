package com.ums.ums.service;

import com.ums.ums.DTO.StudentDTO;
import com.ums.ums.entity.Passport;
import com.ums.ums.entity.Student;
import com.ums.ums.repo.StudentRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Stream;

@Service
@RequiredArgsConstructor
public class StudentService {
    private final StudentRepo studentRepo;

    public void inserStudent(StudentDTO studentDTO){
        Student student = new Student();
        student.setName(studentDTO.getName());
        student.setAddress(studentDTO.getAddress());

        Passport passport = new Passport();
        passport.setNumber(studentDTO.getPassportNumber());
        passport.setValidateYear(studentDTO.getPassportValidateYear());
        student.setPassport(passport);
        studentRepo.save(student);
    }

}
