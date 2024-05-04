package ra.springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ra.springmvc.model.Student;
import ra.springmvc.service.IStudentService;

import java.util.List;

@Controller
@RequestMapping("/students")
public class StudentController { // gọi sang service
    @Autowired
    private IStudentService studentService;
//    @RequestMapping(value = "/list",method = RequestMethod.GET)
    @GetMapping("/list")
    public String list(Model model) {
        List<Student> list = studentService.findAll();
        model.addAttribute("students", list);
        return "student/list";
    }
    @RequestMapping("/add")
    public String add(){
        return "student/add";
    }
    @PostMapping("/add")
    public  String doAdd(@ModelAttribute Student student){ // mapping theo tên thuộc tính
        studentService.add(student);
        return "redirect:/students/list";
    }

}
