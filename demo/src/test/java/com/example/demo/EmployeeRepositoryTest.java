

package com.example.demo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(SpringExtension.class) // for JUnit 5
@DataMongoTest
public class EmployeeRepositoryTest {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Test
    public void testSaveEmployee() {
        Employee employee = new Employee();
        employee.setName("John Doe");
        employee.setEmail("john.doe@example.com");
        employee.setDepartment("IT");

        Employee savedEmployee = employeeRepository.save(employee);

        assertThat(savedEmployee.getName()).isEqualTo(employee.getName());
        assertThat(savedEmployee.getEmail()).isEqualTo(employee.getEmail());
        assertThat(savedEmployee.getDepartment()).isEqualTo(employee.getDepartment());
    }
}
