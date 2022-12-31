package com.example.restapi.service;

import com.example.restapi.model.Student;

import java.util.ArrayList;

public interface StudentService {

    public Student getStudentById(long nrAlbumu);

    public void addNewStudent(Student newStudent);

    public void deleteStudent(long nrAlbumu);

    public ArrayList getAllStudents();

}
