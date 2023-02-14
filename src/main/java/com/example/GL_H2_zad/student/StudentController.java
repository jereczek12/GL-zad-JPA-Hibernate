package com.example.GL_H2_zad.student;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/students")
@RequiredArgsConstructor
public class StudentController {
    private final StudentServiceImpl studentService;

    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable("id") Long id){
        return studentService.getStudentByNrIndeksu(id);
    }
}
