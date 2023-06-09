package com.example.demo.service;

import com.example.demo.exception.DepNotFoundException;
import com.example.demo.model.Department;
import java.util.*;

public interface DepService {
    public Department createDepartment(Department dep);

    public List<Department> getAllDepartmentsList();

    public Department getDepartmentbyId(long departmentId) throws DepNotFoundException;

    public Department updateDepartment(long departmentId,Department dep);

    public void delDepartment(long departmentId);

    Department getDepByName(String depName);



}
