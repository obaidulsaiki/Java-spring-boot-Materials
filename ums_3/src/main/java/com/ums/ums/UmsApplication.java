package com.ums.ums;

import com.ums.ums.entity.Course;
import com.ums.ums.entity.Department;
import com.ums.ums.entity.Passport;
import com.ums.ums.entity.Student;
import com.ums.ums.repo.CourseRepo;
import com.ums.ums.repo.DepartmentRepo;
import com.ums.ums.repo.PassportRepo;
import com.ums.ums.repo.StudentRepo;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@SpringBootApplication
//@RequiredArgsConstructor
public class UmsApplication {
//	private  final StudentRepo studentRepo;
//	private  final DepartmentRepo departmentRepo;
//	private  final CourseRepo courseRepo;
//	private  final PassportRepo passportRepo;
	public static void main(String[] args) {
		SpringApplication.run(UmsApplication.class, args);
	}
//	@PostConstruct // use to run the method in the console
//	public void insertData(){
//		Student student = new Student();
//		student.setName("Rifatul");
//		student.setAddress("tangal");
//
//
//		Passport passport = new Passport();
//		passport.setNumber("BD-T-2098567");
//		passport.setValidateYear(2033);
//		student.setPassport(passport);
//
//		Department department = new Department();
//		department.setName("CSC 2309");
//
//		List<Student> studentForDep = new ArrayList<>();
//		studentForDep.add(student);
//		student.setDepartment(department);
//		department.setStudents(studentForDep);
//
//		Course course = new Course();
//		course.setName("Java 22 06");
//
//		Set<Course> coursesForStudent = new HashSet<>();
//		coursesForStudent.add(course);
//		Set<Student> studentsForCourse = new HashSet<>();
//		studentsForCourse.add(student);
//		student.setCourses(coursesForStudent);
//		course.setStudents(studentsForCourse);

//		studentRepo.save(student);

//	}
}
