package ra.springmvc.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ra.springmvc.dao.IStudentDao;
import ra.springmvc.model.Student;

import java.util.List;
@Service
public class StudentServiceImpl implements IStudentService{ // singleton - bean
    @Autowired
    private IStudentDao studentDao;
    @Override
    public List<Student> findAll() {
        return studentDao.findAll();
    }

    @Override
    public List<Student> findAll(String sort, String by) {
        return studentDao.findAll(sort,by);
    }

    @Override
    public boolean add(Student student) {
        return studentDao.add(student);
    }

    @Override
    public void deleteById(Integer id) {
        studentDao.deleteById(id);
    }

    @Override
    public Student findById(Integer id) {
        return studentDao.findById(id);
    }

    @Override
    public void update(Student student) {
        studentDao.update(student);
    }
}
