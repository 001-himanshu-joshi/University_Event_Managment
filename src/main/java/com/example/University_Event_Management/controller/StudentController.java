package com.example.University_Event_Management.controller;

import com.example.University_Event_Management.model.Student;
import com.example.University_Event_Management.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class StudentController {
    @Autowired
    StudentService studentService;

    @PostMapping("/addStudent")
    public String addStudent(@RequestBody Student student){
        return studentService.addStudent(student);
    }
    @GetMapping("/getAllStudent")
    public List<Student> getAllStudent(){
        return studentService.getAllStudent();
    }
    @GetMapping("getStudentById/{studentId}")
    public Student getStudentById(@PathVariable Integer studentId){
        return studentService.getStudentById(studentId);
    }
    @PutMapping("/updateDepartment/{studentId}/{department}")
    public String updateDepartment(@PathVariable Integer studentId, @PathVariable String department){
        return studentService.updateStudent(studentId, department);
    }

    @DeleteMapping("/deleteStudent/{studentId}")
    public String deleteStudent(@PathVariable Integer studentId){
        return studentService.deleteStudent(studentId);
    }


}
