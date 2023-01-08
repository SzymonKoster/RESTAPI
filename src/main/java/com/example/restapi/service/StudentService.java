package com.example.restapi.service;

import com.example.restapi.model.FieldOfStudy;
import com.example.restapi.model.Group;
import com.example.restapi.model.Student;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public interface StudentService {

    public Student getStudentById(int nrAlbumu);

    public void addNewStudent(Student newStudent);

    public void deleteStudent(int nrAlbumu);

    public ArrayList getAllStudents();

    public void downloadOneCsvStudent(int nrAlbumu, PrintWriter printWriter);

    public void downloadAllCsvStudent(PrintWriter printWriter, List<Student> students);


    public Group getGroupById(int nrGrupy);

    public void addNewGroup(Group newGroup);

    public void deleteGroup(int nrGrupy);

    public ArrayList getAllGruops();

    public void downloadOneCsvGroup(int nrGrupy, PrintWriter printWriter);

    public void downloadAllCsvGroup(PrintWriter printWriter, List<Group> students);


    public FieldOfStudy getFieldodStudyByName(String nameFieldOfStudy);

    public void addNewFieldOfStudy(FieldOfStudy newFieldOfStudy);

    public void deleteFieldOfStudy(String nameFieldOfStudy);

    public ArrayList getAllFieldOfStudy();

    public void downloadOneCsvFieldOfStudy(String nameFieldOfStudy, PrintWriter printWriter);

    public void downloadAllCsvFieldOfStudy(PrintWriter printWriter, List<FieldOfStudy> students);

}
