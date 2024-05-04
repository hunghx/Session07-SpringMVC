package ra.springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import ra.springmvc.service.IStudentService;


@Controller
public class HomeController {
    @RequestMapping(value = "/home") // mặc định RequestMaping là Get
    public String home(Model model){
        model.addAttribute("name","Hồ Xuân Hùng");
        model.addAttribute("age",18);
        return "home";
    }
    @RequestMapping("/edit")
    public String edit(){
        return "";
    }
}
