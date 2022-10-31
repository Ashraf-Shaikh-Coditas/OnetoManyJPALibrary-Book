package dao;

import bean.Student;

public interface StudentDao {
    void addRecord(Student student);
    void updateRecord(int id, String newCity);
    void deleteRecord(int id);
    void findByID(int id);
}
