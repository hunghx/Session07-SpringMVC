package ra.springmvc.dao;


import ra.springmvc.model.Student;

import java.util.List;

public interface IStudentDao {
    List<Student> findAll();
    boolean add(Student student);
}
