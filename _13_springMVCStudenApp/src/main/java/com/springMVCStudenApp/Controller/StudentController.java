package com.springMVCStudenApp.Controller;

import com.springMVCStudenApp.Model.Student;
import com.springMVCStudenApp.Service.ServiceStudent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class StudentController {

    @Autowired
    private ServiceStudent serviceStudent;

    @GetMapping("/")
    public String loadThePage(Model model){
      //  extracted(model);
        return "index";
    }


    @InitBinder
    private void extracted(Model model,Student student) {
        model.addAttribute("student",student);
        model.addAttribute("courses",serviceStudent.getCoureses());
        model.addAttribute("prefTimings",serviceStudent.getTimings());
    }

    @PostMapping("/save")
    public String save(Model model,Student student){

        System.out.println(student);
          // extracted(model);
        model.addAttribute("msg","Data Saved Sucessfully................");
//        model.addAttribute("student",new Student());
//        model.addAttribute("courses",serviceStudent.getCoureses());
//        model.addAttribute("prefTimings",serviceStudent.getTimings());
        return "index";
    }
}
