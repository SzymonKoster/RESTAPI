package com.example.restapi.controller;

import com.example.restapi.model.Student;
import com.example.restapi.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/api")
public class APIController {

    StudentService studentService;

    @Autowired
    public APIController(StudentService studentService) {
        this.studentService = studentService;
    }

    //Zwraca konkretnego studenta
    @GetMapping("/student")
    public Student getStudentById(@RequestParam long nrAlbumu){
        return studentService.getStudentById(nrAlbumu);
    }

    //dodaje nowego studenta
    @PostMapping("/student")
    public void addNewStudent(@RequestBody Student newStudent){studentService.addNewStudent(newStudent);}

    //usuwa konkretnego studenta
    @DeleteMapping("/student")
    @ResponseBody
    public void deleteStudent(@RequestParam long nrAlbumu){studentService.deleteStudent(nrAlbumu);}

    //zwraca wszystkich studentow
    @GetMapping("/students")
    public ArrayList getAllStudents(){
        return studentService.getAllStudents();
    }

    //zwraca konkretnego studenta jako csv
    //@GetMapping("/student/csv")

    //zwraca wszystkich studentow jako csv
    //@GetMapping("/students/csv")


    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //zwraca konkretna grupe studentow

    //dodaje nowa grupe studentow

    //usuwa konkretna grupe studentow

    //zwraca wszytskie grupy studentow

    //zwraca konkretna grupe jako csv

    //zwraca wszystkie grupy jako csv

    //zwraca konkretny kierunek

    //dodaje nowy kierunek

    //usuwa konkretny kierunek

    //zwraca wszsytkie kierunku

    //zwraca konkretny kierunek jako csv

    //zwraca wszsytkie kierunki jako csv




}
