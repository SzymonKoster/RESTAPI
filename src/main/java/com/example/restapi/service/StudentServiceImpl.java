package com.example.restapi.service;

import com.example.restapi.model.Enums.Gender;
import com.example.restapi.model.Enums.StudentCondition;
import com.example.restapi.model.FieldOfStudy;
import com.example.restapi.model.Group;
import com.example.restapi.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;


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
            new Student(10, "Marcin", "Kowalczyk", StudentCondition.Odrabiajacy, 1995, Gender.mezczyzna, 86),
            new Student(11, "Kacper", "Kon", StudentCondition.Obecny, 1995, Gender.mezczyzna, 86),
            new Student(12, "Marcin", "Kowalczyk", StudentCondition.Odrabiajacy, 1995, Gender.mezczyzna, 86),
            new Student(13, "Marcin", "Kowalczyk", StudentCondition.Odrabiajacy, 1995, Gender.mezczyzna, 86),
            new Student(14, "Marcin", "Kowalczyk", StudentCondition.Odrabiajacy, 1995, Gender.mezczyzna, 86),
            new Student(15, "Marcin", "Kowalczyk", StudentCondition.Odrabiajacy, 1995, Gender.mezczyzna, 86),
            new Student(16, "Marcin", "Kowalczyk", StudentCondition.Odrabiajacy, 1995, Gender.mezczyzna, 86)
    ));

    ArrayList<Student> students1 = new ArrayList<>(Arrays.asList(

            new Student(1, "Adam", "Kowalski", StudentCondition.Obecny, 2001, Gender.mezczyzna, 90),
            new Student(2, "Oskar", "Sandomierski", StudentCondition.Nieobecny, 2000, Gender.mezczyzna, 92),
            new Student(3, "Bartek", "Adamczyk", StudentCondition.Chory, 2001, Gender.mezczyzna, 70),
            new Student(4, "Zygmunt", "Lesny", StudentCondition.Obecny, 2000, Gender.mezczyzna, 99),
            new Student(5, "Czarek", "Kowalski", StudentCondition.Odrabiajacy, 2001, Gender.mezczyzna, 62),
            new Student(6, "Leszek", "Glowacki", StudentCondition.Chory, 1999, Gender.mezczyzna, 58)
    ));

    ArrayList<Student> students2 = new ArrayList<>(Arrays.asList(

            new Student(7, "Kasia", "Glowacka", StudentCondition.Chory, 2003, Gender.kobieta, 50),
            new Student(8, "Amelia", "Wozniak", StudentCondition.Nieobecny, 1998, Gender.kobieta, 27),
            new Student(9, "Eleonora", "Szymborska", StudentCondition.Chory, 2003, Gender.kobieta, 50)
    ));

    ArrayList<Student> students3 = new ArrayList<>(Arrays.asList(

            new Student(10, "Marcin", "Kowalczyk", StudentCondition.Odrabiajacy, 1995, Gender.mezczyzna, 86),
            new Student(11, "Kacper", "Kon", StudentCondition.Obecny, 1995, Gender.mezczyzna, 86),
            new Student(12, "Marcin", "Kowalczyk", StudentCondition.Odrabiajacy, 1995, Gender.mezczyzna, 86),
            new Student(13, "Marcin", "Kowalczyk", StudentCondition.Odrabiajacy, 1995, Gender.mezczyzna, 86)
    ));

    ArrayList<Student> students4 = new ArrayList<>(Arrays.asList(

            new Student(14, "Marcin", "Kowalczyk", StudentCondition.Odrabiajacy, 1995, Gender.mezczyzna, 86),
            new Student(15, "Marcin", "Kowalczyk", StudentCondition.Odrabiajacy, 1995, Gender.mezczyzna, 86),
            new Student(16, "Marcin", "Kowalczyk", StudentCondition.Odrabiajacy, 1995, Gender.mezczyzna, 86)
    ));

    ArrayList<Group> groups = new ArrayList<>(Arrays.asList(
            new Group(1, "Grupa 1", 10 ,students1),
            new Group(2, "Grupa 2",  12,students2 ),
            new Group(3, "Grupa 3",  14, students3 ),
            new Group(4,  "Grupa 4", 16, students4 )
    ));

    ArrayList<FieldOfStudy> fieldsOfStudies = new ArrayList<>(Arrays.asList(
            new FieldOfStudy("InfaTechniczna", groups)
    ));

    ///////////////////////////////////////////////////////////////////////////////////////////

    //Students:
    @Override
    public Student getStudentById(int nrAlbumu) {
        for (Student student : students) {
            if (student.getNrAlbumu() == nrAlbumu) {
                return student;
            }
        }
        return null;
    }

    @Override
    public void addNewStudent(Student newStudent) {
        students.add(newStudent);
    }

    @Override
    public void deleteStudent(int nrAlbumu) {
        students.remove(students.indexOf(findStudent(nrAlbumu)));
    }

    public Student findStudent(int nrAlbumu) {
        for (Student student : students) {
            if (student.getNrAlbumu() == nrAlbumu) {
                return student;
            }
        }
        return null;
    }

    @Override
    public ArrayList getAllStudents() {
        ArrayList listaStudentow = new ArrayList<Student>();
        for (Student student : students) {
            listaStudentow.add(student);
        }
        return listaStudentow;
    }






    //Groups:
    @Override
    public Group getGroupByName(int nrGrupy) {
        for (Group group : groups) {
            if (group.getNumerGrupy() == nrGrupy) {
                return group;
            }
        }
        return null;
    }

    @Override
    public void addNewGroup(Group newGroup) {
        groups.add(newGroup);
    }

    @Override
    public void deleteGroup(int nrGrupy) {
        groups.remove(groups.indexOf(findGroup(nrGrupy)));
    }

    public Group findGroup(int nrGrupy) {
        for (Group group : groups) {
            if (group.getNumerGrupy() == nrGrupy) {
                return group;
            }
        }
        return null;
    }

    @Override
    public ArrayList getAllGruops() {
        ArrayList listaGrup = new ArrayList<Group>();
        for (Group group : groups) {
            listaGrup.add(group);
        }
        return listaGrup;
    }






    //Kierunek:
    @Override
    public FieldOfStudy getFieldodStudyByName(String nameFieldOfStudy) {
        for (FieldOfStudy fieldOfStudy : fieldsOfStudies) {
            if (fieldOfStudy.getNameFieldOfStudy() == nameFieldOfStudy) {
                return fieldOfStudy;
            }
        }
        return null;
    }

    @Override
    public void addNewFieldOfStudy(FieldOfStudy newFieldOfStudy) {
        fieldsOfStudies.add(newFieldOfStudy);
    }
    @Override
    public void deleteFieldOfStudy(String nameFieldOfStudy) {
//        System.out.println("Nazwa grupy");
//        System.out.println(nameFieldOfStudy);
//        System.out.println(groups.indexOf(findFieldOfStudy(nameFieldOfStudy)));
        groups.remove(groups.indexOf(findFieldOfStudy(nameFieldOfStudy)));
    }

    public FieldOfStudy findFieldOfStudy(String nameFieldOfStudy) {
        for (FieldOfStudy fieldOfStudy : fieldsOfStudies) {
            if (fieldOfStudy.getNameFieldOfStudy() == nameFieldOfStudy) {
                return fieldOfStudy;
            }
        }
        return null;
    }

    @Override
    public ArrayList getAllFieldOfStudy() {
        ArrayList listaKierunkow = new ArrayList<FieldOfStudy>();
        for (FieldOfStudy fieldOfStudy : fieldsOfStudies) {
            listaKierunkow.add(fieldOfStudy);
        }
        return listaKierunkow;
    }


}
