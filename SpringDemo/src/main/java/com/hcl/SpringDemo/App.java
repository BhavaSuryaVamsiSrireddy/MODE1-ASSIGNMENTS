package com.hcl.SpringDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pojo.Student;


public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("/com/hcl/SpringDemo/Spring-Config.xml");
    	Student student = (Student) context.getBean("student"); 
    	student.setStudentId(1);
    	student.setStudentName("surya");
    	System.out.println("Student Id = "+student.getStudentId()+" "+"Student Name = "+student.getStudentName());
    }
}
