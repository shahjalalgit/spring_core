package demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

//        Student student = context.getBean(Student.class); or, below
        Student student = (Student) context.getBean("student");

        System.out.println(student);


    }
}
