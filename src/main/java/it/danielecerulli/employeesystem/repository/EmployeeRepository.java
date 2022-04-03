package it.danielecerulli.employeesystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.danielecerulli.employeesystem.model.Employee;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
