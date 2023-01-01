package com.example.restapi.controller;

import com.example.restapi.model.FieldOfStudy;
import com.example.restapi.model.Group;
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
    public Student getStudentById(@RequestParam int nrAlbumu){
        return studentService.getStudentById(nrAlbumu);
    }

    //dodaje nowego studenta
    @PostMapping("/student")
    public void addNewStudent(@RequestBody Student newStudent){studentService.addNewStudent(newStudent);}

    //usuwa konkretnego studenta
    @DeleteMapping("/student")
    @ResponseBody
    public void deleteStudent(@RequestParam int nrAlbumu){studentService.deleteStudent(nrAlbumu);}

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
    @GetMapping("/group")
    public Group getGroupByName(@RequestParam int nrGrupy){
        return studentService.getGroupByName(nrGrupy);
    }


    //dodaje nowa grupe studentow
    @PostMapping("/group")
    public void addNewGroup(@RequestBody Group newGroup){studentService.addNewGroup(newGroup);}

    //usuwa konkretna grupe studentow
    @DeleteMapping("/group")
    @ResponseBody
    public void deleteGroup(@RequestParam int nrGrupy){studentService.deleteGroup(nrGrupy);}

    //zwraca wszytskie grupy studentow
    @GetMapping("/groups")
    public ArrayList getAllGruops(){
        return studentService.getAllGruops();
    }

    //zwraca konkretna grupe jako csv

    //zwraca wszystkie grupy jako csv



    //zwraca konkretny kierunek
    @GetMapping("/fieldOfStudy")
    public FieldOfStudy getFieldodStudyByName(@RequestParam String nameFieldOfStudy){
        return studentService.getFieldodStudyByName(nameFieldOfStudy);
    }

    //dodaje nowy kierunek
    @PostMapping("/fieldOfStudy")
    public void addNewFieldOfStudy(@RequestBody FieldOfStudy nameFieldOfStudy){studentService.addNewFieldOfStudy(nameFieldOfStudy);}

    //usuwa konkretny kierunek
    @DeleteMapping("/fieldOfStudy")
    @ResponseBody
    public void deleteFieldOfStudy(@RequestParam String nameFieldOfStudy){studentService.deleteFieldOfStudy(nameFieldOfStudy);}

    //zwraca wszsytkie kierunku
    @GetMapping("/fieldOfStudys")
    public ArrayList getAllFieldOfStudy(){
        return studentService.getAllFieldOfStudy();
    }

    //zwraca konkretny kierunek jako csv

    //zwraca wszsytkie kierunki jako csv




}
