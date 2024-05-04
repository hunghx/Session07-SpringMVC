package ra.springmvc.service;



import ra.springmvc.model.Student;

import java.util.List;

public interface IStudentService {
    List<Student> findAll();
    boolean add(Student student);
}
