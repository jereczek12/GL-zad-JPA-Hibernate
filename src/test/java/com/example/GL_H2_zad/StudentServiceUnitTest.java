package com.example.GL_H2_zad;


import com.example.GL_H2_zad.student.Student;
import com.example.GL_H2_zad.student.StudentServiceImpl;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class StudentServiceUnitTest {
    @Autowired
    private StudentServiceImpl studentService;

    @Test
    public void whenApplicationStarts_thenHibernateCreatesInitialRecords() {
        Student student = studentService.getStudentByNrIndeksu(1L);

        Assert.assertEquals(student.getImie(), "Szymon");
    }
}
