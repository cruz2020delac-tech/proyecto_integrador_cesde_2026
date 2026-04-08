package co.edu.cesde.ga.repository;
import co.edu.cesde.ga.models.Student;
import co.edu.cesde.ga.models.Teacher;
import java.util.List;

public interface TeacherRepository {
    Teacher create(Teacher teacher);
    boolean delete(long teacherId);
    Boolean Update (Teacher teacherUpdate);
    Student finbyId(long TeacherId);
    boolean findbyDocumentNumber(String documentNumber);
    List<Teacher> findAll();
    Boolean existsbyDocumentNumber(String documentNumber);
    

}
