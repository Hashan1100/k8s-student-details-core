package hms.core.student.manager.repo;

import hms.core.student.manager.entity.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, Long> {
}
