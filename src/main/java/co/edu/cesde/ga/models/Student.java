package co.edu.cesde.ga.models;

import java.time.LocalDate;

public  class Student extends Person {
    private long studentId;
    private String birthDate;

    public Student() {
        super();
    }


    public Student(long studentId, String code, String documentNumber, String firstname, String lastname, boolean status, String birthDate) {
        super( studentId,code, documentNumber, firstname, lastname, status);
        this.birthDate = birthDate;
        this.studentId = studentId;
    }

    public Student(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "Student" + super.toString() +
        "birthDate='" + birthDate + '\'';
    }

    public void setStudentId(Long aLong) {
    }

    public Long getStudentId() {
    }
}









