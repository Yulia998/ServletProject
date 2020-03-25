package test.dao;

import test.model.Student;

import java.util.List;

public interface DaoConnection {
    void connect();
    void disconnect();
    List<Student> selectAllStudents();
}
