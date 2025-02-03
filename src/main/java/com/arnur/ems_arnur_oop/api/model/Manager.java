package com.arnur.ems_arnur_oop.api.model;
public class Manager extends Employee {
        private String department;


        public Manager(Long id, String name, String position, double salary, String department) {
            super(id, name, position, salary);
            this.department = department;
        }

        public String getDepartment() {
            return department;
        }

        public void setDepartment(String department) {
            this.department = department;
        }
        @Override
        public void work() {
            System.out.println(getName() + " is managing the "+ department +" team.");
        }
    }
