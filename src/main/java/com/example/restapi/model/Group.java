package com.example.restapi.model;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;


public class Group implements Comparator<Student> {
    private String nazwaGrupy;
    private List<Student> listaStudentow;
    private int maksymalnaIloscStudentow;



    public Group(String nazwaGrupy, int maksymalnaIloscStudentow) {
        this.nazwaGrupy = nazwaGrupy;
        this.listaStudentow = new ArrayList<>();
        this.maksymalnaIloscStudentow = maksymalnaIloscStudentow;
    }

    public String getNazwaGrupy() {
        return nazwaGrupy;
    }

    public void setNazwaGrupy(String nazwaGrupy) {
        this.nazwaGrupy = nazwaGrupy;
    }

    public List<Student> getListaStudentow() {
        return listaStudentow;
    }

    public void setListaStudentow(List<Student> listaStudentow) {
        this.listaStudentow = listaStudentow;
    }

    public int getMaksymalnaIloscStudentow() {
        return maksymalnaIloscStudentow;
    }

    public void setMaksymalnaIloscStudentow(int maksymalnaIloscStudentow) {
        this.maksymalnaIloscStudentow = maksymalnaIloscStudentow;
    }

    public int getIloscStudentow() {
        return this.listaStudentow.size();
    }

    public double getProcentZapelnieniaGrupy() {
        return (double) this.listaStudentow.size() / (double) this.maksymalnaIloscStudentow * 100.0;
    }

    @Override
    //porownywanie nazwisk studentow
    public int compare(Student st1, Student st2) {
        int result = st1.getNazwisko().compareTo(st2.getNazwisko());

        if (result == 0) {
            return result;
        }
        return -1;
    }





    public void addStudent(Student newStudent) {
        listaStudentow.add(newStudent);
    }

    public void addPoints(Student varStudent, double points) {
        varStudent.setIloscPunktow(varStudent.getIloscPunktow() + points);
    }












}
