package com.example.restapi.service;

import com.example.restapi.model.Enums.Gender;
import com.example.restapi.model.Enums.StudentCondition;
//import com.example.restapi.model.FieldOfStudy;
import com.example.restapi.model.Group;
import com.example.restapi.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@Service
public class StudentServiceImpl implements StudentService {


    ArrayList<Student> students = new ArrayList<>(Arrays.asList(

            new Student(1, "Adam", "Kowalski", StudentCondition.Obecny, 2001, Gender.mezczyzna, 90),
            new Student(2, "Oskar", "Sandomierski", StudentCondition.Nieobecny, 2000, Gender.mezczyzna, 92),
            new Student(3, "Bartek", "Adamczyk", StudentCondition.Chory, 2001, Gender.mezczyzna, 70),
            new Student(4, "Zygmunt", "Lesny", StudentCondition.Obecny, 2000, Gender.mezczyzna, 99),
            new Student(5, "Czarek", "Kowalski", StudentCondition.Odrabiajacy, 2001, Gender.mezczyzna, 62),
            new Student(6, "Leszek", "Glowacki", StudentCondition.Chory, 1999, Gender.mezczyzna, 58),
            new Student(7, "Kasia", "Glowacka", StudentCondition.Chory, 2003, Gender.kobieta, 50),
            new Student(8, "Amelia", "Wozniak", StudentCondition.Nieobecny, 1998, Gender.kobieta, 27),
            new Student(9, "Eleonora", "Szymborska", StudentCondition.Chory, 2003, Gender.kobieta, 50),
            new Student(10, "Marcin", "Kowalczyk", StudentCondition.Odrabiajacy, 1995, Gender.mezczyzna, 86)
    ));

    @Override
    public Student getStudentById(long nrAlbumu) {
        for (Student student : students) {
            if (student.getNrAlbumu() == nrAlbumu) {
                return student;
            }
        }
        return null;
    }


    public void addNewStudent(Student newStudent) {
        students.add(newStudent);
    }

    @Override
    public void deleteStudent(long nrAlbumu) {
        System.out.println("nr albumu");
        System.out.println(nrAlbumu);
        System.out.println(students.indexOf(findStudent(nrAlbumu)));
        students.remove(students.indexOf(findStudent(nrAlbumu)));
    }

    public Student findStudent(long nrAlbumu) {
        for (Student student : students) {
            if (student.getNrAlbumu() == nrAlbumu) {
                return student;
            }
        }
        return null;
    }

    public ArrayList getAllStudents() {
        ArrayList listaStudentow = new ArrayList<Student>();
        for (Student student : students) {
            listaStudentow.add(student);
        }
        return listaStudentow;
    }

}
