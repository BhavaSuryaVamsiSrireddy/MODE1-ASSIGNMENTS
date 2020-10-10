package com.hcl.ConstructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pojo.Student;


public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("/com/hcl/ConstructorInjection/Spring-Config.xml");
        Student student = (Student)applicationContext.getBean("student");
        System.out.println(student.getStudentId()+" "+student.getStudentName()+" "+student.getGender()+" "+student.getAge());
    }
}
