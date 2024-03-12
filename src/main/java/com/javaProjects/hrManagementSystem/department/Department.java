package com.javaProjects.hrManagementSystem.department;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table

public class Department {
    // needs explanation
    @Id
    @SequenceGenerator(
            name = "department_sequence",
            sequenceName = "department_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "department_sequence"

    )
    private Long id;
    private String name;
    //Foreign Key
    private Long employeeId;
    private String description;
    private LocalDate creationDate;
    //Check if Float will create problems!
    private Float budgetAllocation;
    private Integer employeeCount;
    //Foreign Key!
    private String projectID;

    public Department() {
    }

    public Department(Long id, String name,
                      Long employeeId,
                      String description,
                      LocalDate creationDate,
                      Float budgetAllocation,
                      Integer employeeCount, String projectID) {
        this.id = id;
        this.name = name;
        this.employeeId = employeeId;
        this.description = description;
        this.creationDate = creationDate;
        this.budgetAllocation = budgetAllocation;
        this.employeeCount = employeeCount;
        this.projectID = projectID;
    }

    public Department(String name, Long employeeId,
                      String description,
                      LocalDate creationDate,
                      Float budgetAllocation,
                      Integer employeeCount, String projectID) {
        this.name = name;
        this.employeeId = employeeId;
        this.description = description;
        this.creationDate = creationDate;
        this.budgetAllocation = budgetAllocation;
        this.employeeCount = employeeCount;
        this.projectID = projectID;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }

    public Float getBudgetAllocation() {
        return budgetAllocation;
    }

    public void setBudgetAllocation(Float budgetAllocation) {
        this.budgetAllocation = budgetAllocation;
    }

    public Integer getEmployeeCount() {
        return employeeCount;
    }

    public void setEmployeeCount(Integer employeeCount) {
        this.employeeCount = employeeCount;
    }

    public String getProjectID() {
        return projectID;
    }

    public void setProjectID(String projectID) {
        this.projectID = projectID;
    }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", employeeId=" + employeeId +
                ", description='" + description + '\'' +
                ", creationDate=" + creationDate +
                ", budgetAllocation=" + budgetAllocation +
                ", employeeCount=" + employeeCount +
                ", projectID='" + projectID + '\'' +
                '}';
    }
}
