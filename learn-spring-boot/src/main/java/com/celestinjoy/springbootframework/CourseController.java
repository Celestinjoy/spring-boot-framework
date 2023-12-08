package com.celestinjoy.springbootframework;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {
    @RequestMapping("/courses")
    public List<Course> retrieveAllCourses(){
        return Arrays.asList(
                new Course(1,"learn AWS","Jeff"),
                new Course(2,"learn Azure","nadella"),
                new Course(3,"learn GCP","pichai")
        );
    }
}
