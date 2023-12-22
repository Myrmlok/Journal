package org.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student{
    @Value("${students.age}")
    int age;
    @Value("${students.name}")
    String name;
}
