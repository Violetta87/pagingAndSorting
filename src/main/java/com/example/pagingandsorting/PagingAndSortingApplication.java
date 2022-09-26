package com.example.pagingandsorting;

import com.example.pagingandsorting.model.Employee;
import com.example.pagingandsorting.repository.EmployeeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class PagingAndSortingApplication {

    public static void main(String[] args) {
        SpringApplication.run(PagingAndSortingApplication.class, args);
    }

    @Bean
    public CommandLineRunner data(EmployeeRepository reposi) {

        return (args) -> {
            final List<Employee> employees = new ArrayList<>();
            employees.add(new Employee("cam", "frand", "dodo@email"));
            employees.add(new Employee("mafu fu ", "pati ti", "mathu@outlook.com"));
            reposi.saveAll(employees);
        };

    }
}
