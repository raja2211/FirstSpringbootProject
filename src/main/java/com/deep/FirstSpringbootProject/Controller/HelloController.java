package com.deep.FirstSpringbootProject.Controller;

import com.deep.FirstSpringbootProject.Helper.StudentHelper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping("/display")
    public List<StudentHelper> displayMsg() {
        List<StudentHelper> strList = new ArrayList<>();
        strList.add(new StudentHelper("Divyadeep","Thomas Sr",123));
        strList.add(new StudentHelper("Megha","DDN",456));
       // strList.add("Best");
       // strList.add("is coming");
        return strList;
    }
}
