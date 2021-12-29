package io.amit.docker.study.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class SampleController {


    @GetMapping("/student/names")
    public List<String> allStudent(){
        List<String> names = new ArrayList<>();
        names.add("Amit Samanta");
        names.add("Anup Samanta");
        names.add("Riya Samanta");
        names.add("Rishi Samanta");

        return names;

    }
}
