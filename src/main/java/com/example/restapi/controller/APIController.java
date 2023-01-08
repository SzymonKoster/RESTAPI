package com.example.restapi.controller;

import com.example.restapi.model.FieldOfStudy;
import com.example.restapi.model.Group;
import com.example.restapi.model.Student;
import com.example.restapi.service.StudentService;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.ArrayList;

@RestController
@RequestMapping("/api")
public class APIController {

    StudentService studentService;


    @Autowired
    public APIController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/student")
    public Student getStudentById(@RequestParam int nrAlbumu) {
        return studentService.getStudentById(nrAlbumu);
    }

    @PostMapping("/student")
    public void addNewStudent(@RequestBody Student newStudent) {
        studentService.addNewStudent(newStudent);
    }

    @DeleteMapping("/student")
    @ResponseBody
    public void deleteStudent(@RequestParam int nrAlbumu) {
        studentService.deleteStudent(nrAlbumu);
    }

    @GetMapping("/students")
    public ArrayList getAllStudents() {
        return studentService.getAllStudents();
    }

    @GetMapping("/student.csv")
    public void downloadOneCsvStudent(@RequestParam int nrAlbumu, HttpServletResponse response) throws IOException {
        response.setContentType("text/csv");
        response.setHeader("Content-Disposition", "attachment; file=student{" + nrAlbumu + "}.csv");
        studentService.downloadOneCsvStudent(nrAlbumu, response.getWriter());
    }

    @GetMapping("/students.csv")
    public void downloadAllCsvStudent(HttpServletResponse response) throws IOException {
        response.setContentType("text/csv");
        response.setHeader("Content-Disposition", "attachment; file=students.csv");
        studentService.downloadAllCsvStudent(response.getWriter(), studentService.getAllStudents());
    }


    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    @GetMapping("/group")
    public Group getGroupById(@RequestParam int nrGrupy) {
        return studentService.getGroupById(nrGrupy);
    }

    @PostMapping("/group")
    public void addNewGroup(@RequestBody Group newGroup) {
        studentService.addNewGroup(newGroup);
    }

    @DeleteMapping("/group")
    @ResponseBody
    public void deleteGroup(@RequestParam int nrGrupy) {
        studentService.deleteGroup(nrGrupy);
    }

    @GetMapping("/groups")
    public ArrayList getAllGruops() {
        return studentService.getAllGruops();
    }

    @GetMapping("/group.csv")
    public void downloadOneCsvGroup(@RequestParam int nrGrupy, HttpServletResponse response) throws IOException {
        response.setContentType("text/csv");
        response.setHeader("Content-Disposition", "attachment; file=group{" + nrGrupy + "}.csv");
        studentService.downloadOneCsvGroup(nrGrupy, response.getWriter());
    }

    @GetMapping("/groups.csv")
    public void downloadAllCsvGroup(HttpServletResponse response) throws IOException {
        response.setContentType("text/csv");
        response.setHeader("Content-Disposition", "attachment; file=groups.csv");
        studentService.downloadAllCsvGroup(response.getWriter(), studentService.getAllGruops());
    }


    @GetMapping("/fieldOfStudy")
    public FieldOfStudy getFieldOfStudyByName(@RequestParam String nameFieldOfStudy) {
        return studentService.getFieldodStudyByName(nameFieldOfStudy);
    }

    @PostMapping("/fieldOfStudy")
    public void addNewFieldOfStudy(@RequestBody FieldOfStudy nameFieldOfStudy) {
        studentService.addNewFieldOfStudy(nameFieldOfStudy);
    }

    @DeleteMapping("/fieldOfStudy")
    @ResponseBody
    public void deleteFieldOfStudy(@RequestParam String nameFieldOfStudy) {
        studentService.deleteFieldOfStudy(nameFieldOfStudy);
    }

    @GetMapping("/fieldOfStudies")
    public ArrayList getAllFieldOfStudy() {
        return studentService.getAllFieldOfStudy();
    }

    @GetMapping("/fieldOfStudy.csv")
    public void downloadOneCsvFieldOfStudy(@RequestParam String nameFieldOfStudy, HttpServletResponse response) throws IOException {
        response.setContentType("text/csv");
        response.setHeader("Content-Disposition", "attachment; file=fieldOfStudy{" + nameFieldOfStudy + "}.csv");
        studentService.downloadOneCsvFieldOfStudy(nameFieldOfStudy, response.getWriter());
    }

    @GetMapping("/fieldOfStudies.csv")
    public void downloadAllCsvFieldOfStudy(HttpServletResponse response) throws IOException {
        response.setContentType("text/csv");
        response.setHeader("Content-Disposition", "attachment; file=fieldOfStudies.csv");
        studentService.downloadAllCsvFieldOfStudy(response.getWriter(), studentService.getAllFieldOfStudy());
    }


}
