package com.example.Registration.EmployeeController;

import com.example.Registration.Dto.EmployeeDTO;
import com.example.Registration.Repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List; // Import List from java.util

@RestController
@RequestMapping // Use a base path for all employee-related endpoints
public class EmployeeController {

    @Autowired
    private EmployeeRepo employeeRepo;

    @PostMapping("/employees")
    public EmployeeDTO createEmployee(@RequestBody EmployeeDTO newEmployee) {
        return employeeRepo.save(newEmployee);
    }

    @GetMapping("/employee")
    public List<EmployeeDTO> getAllEmployees() {
        return employeeRepo.findAll(); // Correct method reference
    }

    @PutMapping("/employee/{id}")
    public EmployeeDTO updateEmployee(@PathVariable Long id, @RequestBody EmployeeDTO updatedEmployee) {
        if (employeeRepo.existsById(id)) {
            updatedEmployee.setId(id); // Ensure the ID is set for the update
            return employeeRepo.save(updatedEmployee);
        }
        return null; // Handle case where employee is not found
    }

    @DeleteMapping("/employee/{id}")
    public void deleteEmployee(@PathVariable Long id) {
        if (employeeRepo.existsById(id)) {
            employeeRepo.deleteById(id);
        }
        // Optionally handle case where employee is not found
    }
}
