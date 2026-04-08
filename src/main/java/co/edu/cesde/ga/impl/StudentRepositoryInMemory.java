package co.edu.cesde.ga.impl;

import co.edu.cesde.ga.repository.StudentRepository;
import co.edu.cesde.ga.models.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentRepositoryInMemory implements StudentRepository {

    private List<Student> students;
    private Long nextStudentId;

    public StudentRepositoryInMemory() {
        this.students = new ArrayList<>();
        this.nextStudentId = 1L;
    }

    @Override
    public Student create(Student student) {
        if (student == null) {
            return null;
        }
        if (existsbyDocumentNumber(student.getDocumentNumber())) {
            return null;
        }
        student.setStudentId(nextStudentId++);
        students.add(student);
        return student;
    }

    @Override
    public boolean delete(long studentId) {
        return false;
    }

    @Override
    public Boolean Update(Student studentUpdate) {
        return null;
    }

    @Override
    public Student finbyId(long studentId) {
        return null;
    }

    @Override
    public boolean findbyDocumentNumber(String documentNumber) {
        return false;
    }


    @Override
    public boolean delete(Long studentId) {
        if (studentId == null) {
            return false;
        }
        Student student = findById(studentId);
        if (student == null) {
            return false;
        }

        return students.remove(student);

    }

    @Override
    public boolean update(Student studentUpdate) {
        if (studentUpdate == null || studentUpdate.getStudentId() == null) {
            return false;
        }
        for (Student student : students) {
            if (!student.getStudentId().equals(studentUpdate.getStudentId())
                    && student.getDocumentNumber().equals(studentUpdate.getDocumentNumber())) {
                return false;
            }

        }
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getStudentId().equals(studentUpdate.getStudentId())) {

                students.set(i,studentUpdate);
                return true;
            }
        }
        return false;
    }
    @Override
    public Student findByDocumentNumber(String documentNumber) {
        if (documentNumber == null || documentNumber.isBlank()) {
            return null;
        }

        for (Student student : students) {
            if (documentNumber.equals(student.getDocumentNumber())) {
                return student;
            }
        }
        return null;
    }



    @Override
    public Student findById(Long studentId) {
        if (studentId == null || studentId < 0L) {
            return null;
        }
        for (Student student : students) {
            if (student.getStudentId().equals(studentId)) {
                return student;
            }
        }
        return null;
    }



    @Override
    public List<Student> findAll() {
        return new ArrayList<>(students);
    }

    @Override
    public Boolean existsbyDocumentNumber(String documentNumber) {

        return findByDocumentNumber(documentNumber) != null;
    }

    @Override
    public boolean existsById(Long studentId) {
        if (studentId == null || studentId < 0L) {
            return false;
        }
        for (Student student : students) {
            if (studentId.equals(student.getStudentId())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int count() {

        return students.size();
    }

    @Override
    public boolean existByDocumentNumber(String documentNumber) {
        return false;
    }
}
