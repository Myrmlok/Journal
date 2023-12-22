package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class Journal {
    @Autowired
    @Qualifier("student")
    Student student;
    @Value("#{${subject_value.data}}")
    Map<String, List<Integer>> maks;
    public void print(){
        System.out.println(maks);
    }

}
