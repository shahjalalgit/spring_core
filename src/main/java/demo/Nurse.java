package demo;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@Scope(scopeName = "prototype")
public class Nurse implements Staff, BeanNameAware {

    private String qualification;

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    @Override
    public String toString() {
        return "Nurse{" +
                "qualification='" + qualification + '\'' +
                '}';
    }

    public void assist() {
        System.out.println("Nurse is assisting.");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("Set Bean name method is callded");
    }

    @PostConstruct
    public void postConstract() {
        System.out.println("Post Constract Method is called");
    }
}
