package com.example.demo.controller;

import com.example.demo.exception.DepNotFoundException;
import com.example.demo.model.Department;
import com.example.demo.service.DepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class DepartmentController {
    @Autowired
    private DepService depService;

    @PostMapping("/deps")
    public  Department createDepartment(@RequestBody Department dep)
    {
         ResponseEntity<String> res =  ResponseEntity.ok("Student created successfully");
        System.out.println(res.toString());
        return  depService.createDepartment(dep);

    }
    @GetMapping("/deps")
    public List<Department> getAllDepartments(){

        return depService.getAllDepartmentsList();
    }

    @GetMapping("/deps/{id}")
    public Department getDepartmentById(@PathVariable("id") Long depId) throws DepNotFoundException {

        return depService.getDepartmentbyId(depId);
    }

    @DeleteMapping("/deps/{id}")
    public String deleteDepartmentById(@PathVariable("id") Long depId){
        depService.delDepartment(depId);
        return "department deleted successfully";
    }

    @GetMapping("/deps/name/{name}")
    public Department getDepByName(@PathVariable("name") String depName)
    {
        return depService.getDepByName(depName);
    }

    @PutMapping("/deps/{id}")
    public Department updateDepartment(@PathVariable("id") Long depId,
    @RequestBody Department dep){
        return depService.updateDepartment(depId,dep);

    }

}
