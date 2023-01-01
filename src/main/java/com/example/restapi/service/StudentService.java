package com.example.restapi.service;

import com.example.restapi.model.FieldOfStudy;
import com.example.restapi.model.Group;
import com.example.restapi.model.Student;

import java.util.ArrayList;

public interface StudentService {

    public Student getStudentById(int nrAlbumu);

    public void addNewStudent(Student newStudent);

    public void deleteStudent(int nrAlbumu);

    public ArrayList getAllStudents();



    public Group getGroupByName(int nrGrupy);

    public void addNewGroup(Group newGroup);

    public void deleteGroup(int nrGrupy);

    public ArrayList getAllGruops();



    public FieldOfStudy getFieldodStudyByName(String nameFieldOfStudy);

    public void addNewFieldOfStudy(FieldOfStudy newFieldOfStudy);

    public void deleteFieldOfStudy(String nameFieldOfStudy);

    public ArrayList getAllFieldOfStudy();

}
