package com.example.restapi.service;

import com.example.restapi.model.Enums.Gender;
import com.example.restapi.model.Enums.StudentCondition;
import com.example.restapi.model.FieldOfStudy;
import com.example.restapi.model.Group;
import com.example.restapi.model.Student;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


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
            new Group(1, "Grupa 1", 10, students1),
            new Group(2, "Grupa 2", 12, students2),
            new Group(3, "Grupa 3", 14, students3),
            new Group(4, "Grupa 4", 16, students4)
    ));

    ArrayList<FieldOfStudy> fieldsOfStudies = new ArrayList<>(Arrays.asList(
            new FieldOfStudy("InfaTechniczna", groups)
    ));


    //Students:
    @Override
    public Student getStudentById(int nrAlbumu) {
        for (Student student : students) {
            if (student.getNrAlbumu() == nrAlbumu) {
                return student;
            }
        }
        throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Nie ma studenta o podanym id");
    }

    @Override
    public void addNewStudent(Student newStudent) {
        students.add(newStudent);
    }

    @Override
    public void deleteStudent(int nrAlbumu) {
        students.remove(students.indexOf(getStudentById(nrAlbumu)));
    }

    @Override
    public ArrayList getAllStudents() {
        ArrayList listaStudentow = new ArrayList<Student>();
        for (Student student : students) {
            listaStudentow.add(student);
        }
        return listaStudentow;
    }

    @Override
    public void downloadOneCsvStudent(int nrAlbumu, PrintWriter printWriter) {
        printWriter.write("nrAlbumu, imie, nazwisko, stanStudenta, rokUrodzenia, plec, iloscPunktow\n");
        Student student = students.get(students.indexOf(getStudentById(nrAlbumu)));
        printWriter.write(student.getNrAlbumu() + "," + student.getImie() + "," + student.getNazwisko() + "," + student.getStanStudenta() + "," + student.getRokUrodzenia() + "," + student.getPlec() + "," + student.getIloscPunktow() + "\n");
    }

    @Override
    public void downloadAllCsvStudent(PrintWriter printWriter, List<Student> students) {
        printWriter.write("nrAlbumu, imie, nazwisko, stanStudenta, rokUrodzenia, plec, iloscPunktow\n");
        for (Student student : students) {
            printWriter.write(student.getNrAlbumu() + "," + student.getImie() + "," + student.getNazwisko() + "," + student.getStanStudenta() + "," + student.getRokUrodzenia() + "," + student.getPlec() + "," + student.getIloscPunktow() + "\n");
        }
    }


    //Groups:
    @Override
    public Group getGroupById(int nrGrupy) {
        for (Group group : groups) {
            if (group.getNumerGrupy() == nrGrupy) {
                return group;
            }
        }
        throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Nie ma grupy o podanym id");
    }

    @Override
    public void addNewGroup(Group newGroup) {
        groups.add(newGroup);
    }

    @Override
    public void deleteGroup(int nrGrupy) {
        groups.remove(groups.indexOf(getGroupById(nrGrupy)));
    }


    @Override
    public ArrayList getAllGruops() {
        ArrayList listaGrup = new ArrayList<Group>();
        for (Group group : groups) {
            listaGrup.add(group);
        }
        return listaGrup;
    }

    @Override
    public void downloadOneCsvGroup(int nrGrupy, PrintWriter printWriter) {
        printWriter.write("Nr grupy, Nazwa grupy, Maksymalna ilosc studentow w grupie, Lista studentow\n");
        Group group = groups.get(groups.indexOf(getGroupById(nrGrupy)));
        printWriter.write(group.getNumerGrupy() + "," + group.getNazwaGrupy() + "," + group.getMaksymalnaIloscStudentow() + "," + group.getListaStudentow() + "\n");
    }

    @Override
    public void downloadAllCsvGroup(PrintWriter printWriter, List<Group> groups) {
        printWriter.write("Nr grupy, Nazwa grupy, Maksymalna ilosc studentow w grupie, Lista studentow\n");
        for (Group group : groups) {
            printWriter.write(group.getNumerGrupy() + "," + group.getNazwaGrupy() + "," + group.getMaksymalnaIloscStudentow() + "," + group.getListaStudentow() + "\n");
        }
    }


    //Kierunek:
    @Override
    public FieldOfStudy getFieldodStudyByName(String nameFieldOfStudy) {
        for (FieldOfStudy fieldOfStudy : fieldsOfStudies) {
            if (fieldOfStudy.getNameFieldOfStudy().equals(nameFieldOfStudy)) {
                return fieldOfStudy;
            }
        }
        throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Nie ma kierunku o podanej nazwie");
    }

    @Override
    public void addNewFieldOfStudy(FieldOfStudy newFieldOfStudy) {
        fieldsOfStudies.add(newFieldOfStudy);
    }

    @Override
    public void deleteFieldOfStudy(String nameFieldOfStudy) {
        fieldsOfStudies.remove(fieldsOfStudies.indexOf(getFieldodStudyByName(nameFieldOfStudy)));
    }


    @Override
    public ArrayList getAllFieldOfStudy() {
        ArrayList listaKierunkow = new ArrayList<FieldOfStudy>();
        for (FieldOfStudy fieldOfStudy : fieldsOfStudies) {
            listaKierunkow.add(fieldOfStudy);
        }
        return listaKierunkow;
    }

    @Override
    public void downloadOneCsvFieldOfStudy(String nameFieldOfStudy, PrintWriter printWriter) {
        printWriter.write("Nazwa kierunku, Lista grup\n");
        FieldOfStudy fieldOfStudy = fieldsOfStudies.get(fieldsOfStudies.indexOf(getFieldodStudyByName(nameFieldOfStudy)));
        printWriter.write(fieldOfStudy.getNameFieldOfStudy() + "," + fieldOfStudy.getListaGrup() + "\n");
    }

    @Override
    public void downloadAllCsvFieldOfStudy(PrintWriter printWriter, List<FieldOfStudy> fieldOfStudies) {
        printWriter.write("Nazwa kierunku, Lista grup\n");
        for (FieldOfStudy fieldOfStudy : fieldOfStudies) {
            printWriter.write(fieldOfStudy.getNameFieldOfStudy() + "," + fieldOfStudy.getListaGrup() + "\n");
        }
    }

}
