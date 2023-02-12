package com.example.University_Event_Management.service;

import com.example.University_Event_Management.model.Student;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


import java.util.*;

@Component
public class StudentService {

    private static List<Student> studentList = new ArrayList<>();

    static {
        studentList.add(new Student(1, "Himanshu","Joshi", 20, "Mechanical"));
        studentList.add(new Student(2, "Raj","Sekhar", 21, "CS"));
        studentList.add(new Student(3, "DAU","saxena", 19, "ECE"));
    }

    public String addStudent(Student student){
        studentList.add(student);
        return "Student is added to database";
    }
    public List<Student> getAllStudent(){
      return studentList;
    }
    public Student getStudentById(Integer studentId){
       for(Student student : studentList){
           if(student.getStudentId()==studentId){
                return student;
           }
       }
        return null;
    }
    public String updateStudent(Integer studentId, String newDepartment){
       for(Student student : studentList){
           if(student.getStudentId().equals(studentId)){
               student.setDepartment(newDepartment);
                return "Department is updated in the Database";
            }
        }
        return "studentId not found";
    }


    public String deleteStudent(Integer studentId) {
        studentList.removeIf(student -> student.getStudentId().equals(studentId));
        return "Student is removed from Database !";
    }
}
