package co.edu.cesde.ga.repository;

import co.edu.cesde.ga.models.Student;
import java.util.List;

        public interface StudentRepository {
        Student create (Student student);
        boolean delete(long studentId);
        Boolean Update (Student studentUpdate);
        Student finbyId(long studentId);
        boolean findbyDocumentNumber(String documentNumber);

            boolean delete(Long studentId);

            boolean update(Student studentUpdate);

            Student findById(Long studentId);

            boolean findByDocumentNumber(String documentNumber);

            List<Student> findAll();
        Boolean existsbyDocumentNumber(String documentNumber);

            boolean existsById(Long studentId);
        }

