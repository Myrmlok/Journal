package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        var context=new ClassPathXmlApplicationContext(
                "apllicationXml.xml"
        );
        var journal=context.getBean("journal", Journal.class);
        System.out.println(journal.student.name+" "+"age:"+ journal.student.age);
        journal.print();

    }
}
