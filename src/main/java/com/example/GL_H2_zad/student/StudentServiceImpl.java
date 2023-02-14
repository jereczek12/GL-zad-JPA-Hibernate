package com.example.GL_H2_zad.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student getStudentByNrIndeksu(Long indeks) {
        return studentRepository.findByNrIndeksu(indeks);
    }
}
