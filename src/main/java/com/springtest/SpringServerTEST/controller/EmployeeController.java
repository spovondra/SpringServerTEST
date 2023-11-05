package com.springtest.SpringServerTEST.controller;

import com.springtest.SpringServerTEST.model.employee.Employee;
import com.springtest.SpringServerTEST.model.employee.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

  @Autowired
  private EmployeeDao employeeDao;

  @GetMapping("/employee/get-all")
  public List<Employee> getAllEmployees() {
    return employeeDao.getAllEmployees();
  }

  @PostMapping("/employee/save")
  public Employee save(@RequestBody Employee employee) {
    return employeeDao.save(employee);
  }

  @DeleteMapping("/employee/delete/employeeId")
  public void delete(@PathVariable String employeeId) {
    // Zde provedete kód pro smazání zaměstnance s daným ID.
    employeeDao.delete(employeeId);
  }
}
