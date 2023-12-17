package dao_Classes;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import entitiy_Classes.Student;

@Transactional
public class StudentDao {

	private HibernateTemplate hibernateTemplate;

	public void insert(Student st) {
		this.hibernateTemplate.save(st);
	}

	public void update(Student st) {
		this.hibernateTemplate.update(st);
	}

	public void delete(int id) {
		Student student = this.hibernateTemplate.get(Student.class, id);
		this.hibernateTemplate.delete(student);
	}

	public Student getStudent(int id) {
		return this.hibernateTemplate.get(Student.class, id);
	}

	public List<Student> getAllStudents() {
		return this.hibernateTemplate.loadAll(Student.class);
	}

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

}
