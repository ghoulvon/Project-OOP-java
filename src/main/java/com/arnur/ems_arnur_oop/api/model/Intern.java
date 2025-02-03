package com.arnur.ems_arnur_oop.api.model;
public class Intern extends Employee {
    private String University;
    public Intern(Long id, String name, String position, double salary, String University) {
        super(id, name, position, salary);
        this.University = University;
    }
    public String getUniversity() {
        return University;
    }
    public void setUniversity(String Company) {
        this.University = University;
    }
    @Override
    public void work() {
        System.out.println(getName() + " is working as an intern, alumni of " + University );
    }
}