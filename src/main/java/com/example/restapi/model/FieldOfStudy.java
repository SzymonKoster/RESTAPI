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

    public FieldOfStudy print() {
        System.out.println("Informacje o kierunku: ");
        System.out.println("Nazwa kierunku:\n" + nameFieldOfStudy);
        System.out.println("Lista grup:\n" + listaGrup);
        return null;
    }

    @Override
    public String toString() {
        System.out.println("Informacje o kierunku: ");
        System.out.println("Nazwa kierunku:\n" + nameFieldOfStudy);
        System.out.println("Lista grup:\n" + listaGrup);
        return "FieldOfStudy{" +
                "Nazwa kierunku=" + nameFieldOfStudy +
                ", Lista grup='" + listaGrup +
                '}';
    }
}
