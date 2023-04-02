package demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
//        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

//        Student student = context.getBean(Student.class); or, below
//        Student student = (Student) context.getBean("student");
//        System.out.println(student);

        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
            Doctor doctor = context.getBean(Doctor.class);
        doctor.assist();
        doctor.setQualification("MBBS");
        System.out.println(doctor);

        Doctor doctor1 = context.getBean(Doctor.class);
        System.out.println(doctor1);


        //scopes
        ApplicationContext context2 = new AnnotationConfigApplicationContext(BeanConfig.class);
        Nurse nurse = context2.getBean(Nurse.class);
        nurse.assist();
        nurse.setQualification("Diploma in NURSE");
        System.out.println(nurse);
//
//        Nurse nurse2 = context2.getBean(Nurse.class);
//        System.out.println(nurse2);

    }
}
