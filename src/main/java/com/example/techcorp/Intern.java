package com.techcorp;

public class Intern extends Employee {

    public Tester(String name, int skill, double salary) {
        super(name, skill, salary);
    }

    @Override
    public int work() {
        return getSkill()/4;
    }
    @Override
    public String getRoleName() {
        return "Stażysta";
    }
}