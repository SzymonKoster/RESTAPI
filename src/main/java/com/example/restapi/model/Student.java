package com.example.restapi.model;

import com.example.restapi.model.Enums.Gender;
import com.example.restapi.model.Enums.StudentCondition;


public class Student {
    private long nrAlbumu;
    private String imie;
    private String nazwisko;
    private StudentCondition stanStudenta;
    private int rokUrodzenia;
    private Gender plec;
    private double iloscPunktow;


    public Student(long nrAlbumu, String imie, String nazwisko, StudentCondition stanStudenta, int rokUrodzenia, Gender plec, double iloscPunktow) {
        this.nrAlbumu = nrAlbumu;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.stanStudenta = stanStudenta;
        this.rokUrodzenia = rokUrodzenia;
        this.plec = plec;
        this.iloscPunktow = iloscPunktow;
    }


    public long getNrAlbumu() {
        return nrAlbumu;
    }

    /*    public void setNrAlbumu(long nrAlbumu) {
        this.nrAlbumu = nrAlbumu;
    }*/

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public StudentCondition getStanStudenta() {
        return stanStudenta;
    }

    public void setStanStudenta(StudentCondition stanStudenta) {
        this.stanStudenta = stanStudenta;
    }

    public int getRokUrodzenia() {
        return rokUrodzenia;
    }

    public void setRokUrodzenia(int rokUrodzenia) {
        this.rokUrodzenia = rokUrodzenia;
    }

    public Gender getPlec() {
        return plec;
    }

    public void setPlec(Gender plec) {
        this.plec = plec;
    }

    public double getIloscPunktow() {
        return iloscPunktow;
    }

    public void setIloscPunktow(double iloscPunktow) {
        this.iloscPunktow = iloscPunktow;
    }
}
