package co.edu.cesde.ga.Service;

import co.edu.cesde.ga.models.Student;
import co.edu.cesde.ga.repository.StudentRepository;
import java.util.List;

public class StudentServiceImpl implements StudentService {
    private final StudentRepository studentRepository;


    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public Student create(Student student) {

        if (isInvalidStudent(student) || studentRepository.existByDocumentNumber(student.getDocumentNumber())) {
            return null;
        }

        return studentRepository.create(student);
    }

    @Override
    public boolean delete(Long studentId) {
        return false;
    }

    @Override
    public boolean update(Student studentUpdate) {
        return false;
    }

    @Override
    public boolean Update(Student studentUpdate) {
        return false;
    }

    @Override
    public Student findById(Long studentId) {
        return null;
    }

    @Override
    public List<Student> findAll() {
        return List.of();
    }

    public boolean isInvalidStudent(Student student) {

        return student == null ||
                !isNotBlank(student.getCode()) ||
                !isNotBlank(student.getDocumentNumber()) ||
                !isNotBlank(student.getFirstname()) ||
                !isNotBlank(student.getLastname()) ||
                !isNotBlank(student.getBirthDate()) ||
                Student.getStatus == null;
    }

    private boolean isNotBlank(String value) {
        return value != null && !value.isBlank();
    }
}

