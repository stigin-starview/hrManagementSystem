package com.javaProjects.hrManagementSystem.department;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
@Service
public class DepartmentService {
    public List<Department> getDepartment() {
        return List.of(
                new Department(
                        22L,
                        "hr",
                        15L,
                        "something",
                        LocalDate.of(2000, Month.JANUARY, 5),
                        2220000f,
                        10,
                        "DF6"

                )
        );
    }
}
