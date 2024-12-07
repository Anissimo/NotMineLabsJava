package org.example.lab3;

import java.util.Date;

public class Student extends Entity {
    private int id;
    private String surname;
    private String name;
    private String patronymic;
    private Date birthDate;
    private String address;
    private String phone;
    private String faculty;
    private int course;
    private String group;

    public Student(int id, String surname, String name, String patronymic, Date birthDate, String address, String phone, String faculty, int course, String group) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.birthDate = birthDate;
        this.address = address;
        this.phone = phone;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
    }

    // геттеры и сеттеры

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", birthDate=" + birthDate +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", faculty='" + faculty + '\'' +
                ", course=" + course +
                ", group='" + group + '\'' +
                '}';
    }
}