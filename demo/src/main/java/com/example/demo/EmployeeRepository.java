package com.example.demo;


import org.springframework.data.mongodb.repository.MongoRepository;

public interface EmployeeRepository extends MongoRepository<Employee, String> {
    // You can define custom queries or use default methods provided by MongoRepository
}