package co.edu.cesde.ga.Service;
import co.edu.cesde.ga.models.Student;
import java.util.List;

public interface StudentService {
    Student create(Student student);
    boolean delete(Long studentId);
    boolean update(Student studentUpdate);

    boolean Update(Student studentUpdate);

    Student findById(Long studentId);
    List<Student> findAll();


}
