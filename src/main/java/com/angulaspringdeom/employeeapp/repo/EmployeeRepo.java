package com.angulaspringdeom.employeeapp.repo;

import com.angulaspringdeom.employeeapp.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * @author Temidayo F.
 */

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Long> {
    void deleteEmployeeById(Long id);

   Optional<Employee>  findEmployeeById(long id);
}
