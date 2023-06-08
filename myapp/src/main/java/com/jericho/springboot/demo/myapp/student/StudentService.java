package com.jericho.springboot.demo.myapp.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {
    public List<Student> getStudents() {
        return List.of(
                new Student(1L,
                        "jericho",
                        "jericho@email.com",
                        LocalDate.of(2000, Month.JUNE, 16),
                        23)
        );
    }
}
