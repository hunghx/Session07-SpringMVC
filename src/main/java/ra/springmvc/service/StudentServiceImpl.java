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
    public boolean add(Student student) {
        return studentDao.add(student);
    }
}
