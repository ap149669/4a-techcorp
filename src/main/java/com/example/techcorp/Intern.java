package com.example.techcorp;

public class Intern extends Employee {

    public Intern(String name, int skillLevel, double salary) {
        super(name, skillLevel, salary);
    }

    @Override
    public int work() {
        
        return (int) (this.skill * 0.25);
    }

    @Override
    public String getRoleName() {
        return "Stażysta";
    }
}