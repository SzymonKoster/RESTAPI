package com.example.restapi.model;

import com.example.restapi.model.Enums.Gender;
import com.example.restapi.model.Enums.StudentCondition;


public class Student {
    private int nrAlbumu;
    private String imie;
    private String nazwisko;
    private StudentCondition stanStudenta;
    private int rokUrodzenia;
    private Gender plec;
    private double iloscPunktow;



    public Student(int nrAlbumu, String imie, String nazwisko, StudentCondition stanStudenta, int rokUrodzenia, Gender plec, double iloscPunktow) {
        this.nrAlbumu = nrAlbumu;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.stanStudenta = stanStudenta;
        this.rokUrodzenia = rokUrodzenia;
        this.plec = plec;
        this.iloscPunktow = iloscPunktow;
    }


    public void print() {
        System.out.println("Informacje o studencie: ");
        System.out.println("Nr albumu:  " + nrAlbumu);
        System.out.println("Imie:       " + imie);
        System.out.println("Nazwisko:   " + nazwisko);
        System.out.println("Stan:       " + stanStudenta);
        System.out.println("Rok urodzenia: " + rokUrodzenia);
        System.out.println("Plec:       " + plec);
        System.out.println("Ilosc punktow: " + iloscPunktow);
    }



    public int getNrAlbumu() {
        return nrAlbumu;
    }

    public Student setNrAlbumu(int nrAlbumu) {
        this.nrAlbumu = nrAlbumu;
        return null;
    }

    public String getImie() {
        return imie;
    }

    public Student setImie(String imie) {
        this.imie = imie;
        return null;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public Student setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
        return null;
    }

    public StudentCondition getStanStudenta() {
        return stanStudenta;
    }

    public Student setStanStudenta(StudentCondition stanStudenta) {
        this.stanStudenta = stanStudenta;
        return null;
    }

    public int getRokUrodzenia() {
        return rokUrodzenia;
    }

    public Student setRokUrodzenia(int rokUrodzenia) {
        this.rokUrodzenia = rokUrodzenia;
        return null;
    }

    public Gender getPlec() {
        return plec;
    }

    public Student setPlec(Gender plec) {
        this.plec = plec;
        return null;
    }

    public double getIloscPunktow() {
        return iloscPunktow;
    }

    public Student setIloscPunktow(double iloscPunktow) {
        this.iloscPunktow = iloscPunktow;
        return null;
    }

    @Override
    public String toString() {
        return "Student{" +
                "nrAlbumu=" + nrAlbumu +
                ", imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", stanStudenta=" + stanStudenta +
                ", rokUrodzenia=" + rokUrodzenia +
                ", plec=" + plec +
                ", iloscPunktow=" + iloscPunktow +
                '}';
    }
}
