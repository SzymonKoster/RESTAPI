package com.example.restapi.model;

import java.util.List;


public class FieldOfStudy {
    private String nameFieldOfStudy;
    private List<Group> listaGrup;

    public FieldOfStudy(String nameFieldOfStudy, List<Group> listaGrup) {
        this.nameFieldOfStudy = nameFieldOfStudy;
        this.listaGrup = listaGrup;
    }
    public FieldOfStudy(String nameFieldOfStudy) {
        this.nameFieldOfStudy = nameFieldOfStudy;
    }

    public List<Group> getListaGrup() {
        return listaGrup;
    }
    public void addGroup(Group newGroup) {
        listaGrup.add(newGroup);
    }

    public String getNameFieldOfStudy() {
        return nameFieldOfStudy;
    }

//    public void init()
//    {
//
//        //dodajemy kilku studentow
//        Student Adam = new Student(1, "Adam", "Kowalski", StudentCondition.Obecny, 2001, Gender.mezczyzna, 90);
//        Student Oskar = new Student(2, "Oskar", "Sandomierski", StudentCondition.Nieobecny, 2000, Gender.mezczyzna, 92);
//        Student Bartek = new Student(3, "Bartek", "Adamczyk", StudentCondition.Chory, 2001, Gender.mezczyzna, 70);
//        Student Zygmunt = new Student(4, "Zygmunt", "Lesny", StudentCondition.Obecny, 2000, Gender.mezczyzna, 99);
//        Student Czarek = new Student(5, "Czarek", "Kowalski", StudentCondition.Odrabiajacy, 2001, Gender.mezczyzna, 62);
//        Student Leszek = new Student(6, "Leszek", "Glowacki", StudentCondition.Chory, 1999, Gender.mezczyzna, 58);
//
//        Student Kasia = new Student(7, "Kasia", "Glowacka", StudentCondition.Chory, 2003, Gender.kobieta, 50);
//        Student Amelia = new Student(8, "Amelia", "Wozniak", StudentCondition.Nieobecny, 1998, Gender.kobieta, 27);
//        Student Eleonora = new Student(9, "Eleonora", "Szymborska", StudentCondition.Chory, 2003, Gender.kobieta, 50);
//        Student Marcin = new Student(10, "Marcin", "Kowalczyk", StudentCondition.Odrabiajacy, 1995, Gender.mezczyzna, 86);
//
//
//        //System.out.println("Tworzymy 3 grupy Studentow");
//        Groups Grupa1 = new Groups(1,"Grupa1",10);
//        Groups Grupa2 = new Groups(2,"Grupa2",15);
//        Groups Grupa3 = new Groups(3,"Grupa3",20);
//        Groups Grupa4 = new Groups(4,"Grupa4",25);
//
//        //dodanie osobv do grp 1
//        Grupa1.addStudent(Adam);
//        Grupa1.addStudent(Oskar);
//        Grupa1.addStudent(Bartek);
//        Grupa1.addStudent(Zygmunt);
//        Grupa1.addStudent(Czarek);
//        Grupa1.addStudent(Leszek);
//
//        //dodanie osob do grp 2
//        Grupa2.addStudent(Kasia);
//        Grupa2.addStudent(Amelia);
//        Grupa2.addStudent(Eleonora);
//        Grupa2.addStudent(Marcin);
//
//
//        //dodanie grup do kierunku
//        this.addGroup("Grupa1",Grupa1);
//        this.addGroup("Grupa2",Grupa2);
//        this.addGroup("Grupa3", Grupa3);
//        this.addGroup("Grupa4",Grupa4);
//    }
}
