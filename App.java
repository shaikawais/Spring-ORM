package com.spring.orm.Spring_ORM;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dao_Classes.StudentDao;
import entitiy_Classes.Student;

public class App {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/spring/orm/Spring_ORM/Config.xml");
		StudentDao stDao = context.getBean("studentDao",StudentDao.class);
		
		Student st=new Student(105, "Amir", "Zaheerabad");
//		Inserting
//		stDao.insert(st);
		
//		Updating
//		stDao.update(st);
		
//		Deleting
//		stDao.delete(103);
		
		
//		Fetching Single Object
//		Student student = stDao.getStudent(101);
//		System.out.println(student);
		
//		Fetching All Data
		List<Student> list=stDao.getAllStudents();
		for(Student s:list)
			System.out.println(s);
	}
}
