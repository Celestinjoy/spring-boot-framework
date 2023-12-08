package com.celestin.sample01.studentAPI;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
@RestController
@RequestMapping("/students")
public class StudentsController {
    @GetMapping
    public List<Student> retrieveStudentData(){
        return Arrays.asList(
                new Student("Amal",5,10),
                new Student("akhil",10,9),
                new Student("adarsh",33,8),
                new Student("manu",44,7)
        );
    }
}
