package com.example.Registration.Repo;

import com.example.Registration.Dto.EmployeeDTO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<EmployeeDTO, Long> {
    // Additional query methods can be defined here
}
