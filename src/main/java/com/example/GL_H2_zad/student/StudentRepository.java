package com.example.GL_H2_zad.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    Student findByNrIndeksu(Long nr_indeksu);
}
