package com.example.techcorp;
import java.util.ArrayList;
import java.util.List;

public class Project {
    
    public String projectName;
    public int requiredPoints;
    public int currentPoints;
    public List<Employee> team;

 
    public Project(String projectName, int requiredPoints) {
        this.projectName = projectName;
        this.requiredPoints = requiredPoints;
        this.currentPoints = 0;
        this.team = new ArrayList<>();
    }


   
    public void workOneTurn() {
        for (Employee employee : team) {
            currentPoints += employee.work();
        }
    }

    
    public void addEmployee(Employee employee) {
        team.add(employee);
    }

    public String getName() {
        return projectName;
    }

    public int getProgress() {
        return currentPoints;
    }

    public int getRequiredWork() {
        return requiredPoints;
    }

    public boolean isFinished() {
        return currentPoints >= requiredPoints;
    }
    public List<Employee> getTeam(){
        return team;
    }
}