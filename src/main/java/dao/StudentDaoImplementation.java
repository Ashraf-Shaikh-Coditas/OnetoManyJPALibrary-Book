package dao;

import bean.Student;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
public class StudentDaoImplementation implements StudentDao {

    public void addRecord(Student student) {
        EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("ashraf");
        EntityManager entityManager=entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();
        entityManager.persist(student);
        entityManager.getTransaction().commit();
    }

    public void updateRecord(int id, String newCity) {
        EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("ashraf");
        EntityManager entityManager=entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();
        Student student = entityManager.find(Student.class,id);
        student.setCity(newCity);
        entityManager.getTransaction().commit();

    }

    public void deleteRecord(int id) {
        EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("ashraf");
        EntityManager entityManager=entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();
        Student student = entityManager.find(Student.class,id);
        entityManager.remove(student);
        entityManager.getTransaction().commit();
    }

    public void findByID(int id) {
        EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("ashraf");
        EntityManager entityManager=entityManagerFactory.createEntityManager();

        Student student = entityManager.find(Student.class,id);
        System.out.println(student);
    }
}
