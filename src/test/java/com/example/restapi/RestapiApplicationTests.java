package com.example.restapi;

import com.example.restapi.model.Enums.Gender;
import com.example.restapi.model.Enums.StudentCondition;
import com.example.restapi.model.FieldOfStudy;
import com.example.restapi.model.Group;
import com.example.restapi.model.Student;
import com.example.restapi.service.StudentService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class RestapiApplicationTests {

    @Autowired
    StudentService studentService;

    @Test
    public void testAddNewStudent() {
        Student testStudent = new Student(1000, "TestName", "TestSurname", StudentCondition.Obecny, 2001, Gender.mezczyzna, 90);
        studentService.addNewStudent(testStudent);
        assertNotNull(studentService.getStudentById(1000).toString());
    }

    @Test
    public void testAddNewGroup() {
        ArrayList testStudents = new ArrayList();
        Group testGroup = new Group(1000, "TestGrupa", 1000, testStudents);
        studentService.addNewGroup(testGroup);
        assertNotNull(studentService.getGroupById(1000).toString());
    }

    @Test
    public void testAddNewFieldOfStudy() {
        ArrayList testGroups = new ArrayList();
        FieldOfStudy testFieldOfStudy = new FieldOfStudy("TestKierunek", testGroups);
        studentService.addNewFieldOfStudy(testFieldOfStudy);
        assertNotNull(studentService.getFieldodStudyByName("TestKierunek").toString());
    }

}
