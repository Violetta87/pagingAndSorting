package com.example.pagingandsorting.service;

import com.example.pagingandsorting.model.Employee;
import com.example.pagingandsorting.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository repository;

    public List<Employee> getAllEmployees(Integer pageNo, Integer pagesize, String sortBy){
        Pageable paging = PageRequest.of(pageNo, pagesize, Sort.by(sortBy));

        Page<Employee> pagedResult = repository.findAll(paging);

        if(pagedResult.hasContent()){
            return pagedResult.getContent();
        }else{
            return new ArrayList<Employee>();
        }
    }

}
