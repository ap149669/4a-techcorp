package com.techcorp;

public class Main {
   
    public static double getEmployeeSalary(Employee employee) {
        return employee.getSalary();
    }

    public static int addSkills(int skill1, int skill2) {
        return skill1 + skill2;
    }

    
    public static void printProjectStatus(Project project) {
        System.out.println("Project: " + project.getName() + " | Progress: " + project.getProgress() + "/" + project.getRequiredWork() + " | Finished: " + project.isFinished());
    }

    public static void main(String[] args) {
        System.out.println("--- START PROGRAMU ---");

        
        Employee devAnna = new Developer("Anna", 9, 8000);
        Employee devOlek = new Developer("Olek", 7, 7500);
        Employee testPiotr = new Tester("Piotr", 6, 6500);
        Employee testMarta = new Tester("Marta", 8, 7000);
        Employee managerKamil = new Manager("Kamil", 10, 12000);
        Employee intern1 = new Intern("Janusz", 4, 2000);

        
        Project mobileApp = new Project("Aplikacja Mobilna", 50);
        mobileApp.addEmployee(devAnna);
        mobileApp.addEmployee(testPiotr);
        mobileApp.addEmployee(managerKamil);

        Project bankSystem = new Project("System Bankowy", 100);
        bankSystem.addEmployee(devOlek);
        bankSystem.addEmployee(testMarta);
        bankSystem.addEmployee(managerKamil);

        Company techCorp = new Company("TechCorp", 50000.0);
        techCorp.hire(devOlek);
        techCorp.hire(testPiotr);
        techCorp.hire(testMarta);
        techCorp.startProject(mobileApp);
        techCorp.startProject(bankSystem);

       
        System.out.println("Salary Anny: " + getEmployeeSalary(devAnna));
        System.out.println("Total Skill (5+10): " + addSkills(5, 10));
        printProjectStatus(mobileApp);

        
        Project newProject = new Project("Nowy System", 100);
        newProject.addEmployee(devAnna);

        int turnCounter = 0;
        while (!newProject.isFinished()) {
            newProject.workOneTurn();
            turnCounter++;
            System.out.println("Tura " + turnCounter + ": " + newProject.getProgress() + " pkt.");
        }

        System.out.println("\n--- PROJEKT ZAKOŃCZONY ---");
        System.out.println("Liczba wymaganych tur: " + turnCounter);
        printProjectStatus(newProject);

       
        System.out.println("\n--- STATUS PROJEKTÓW W FIRMIE ---");
        techCorp.showStatus();

        System.out.println("\n--- RAPORT KOSZTÓW ---");
        System.out.println("Pensja Anny: " + devAnna.getSalary());
        System.out.println("Pensja Olka: " + devOlek.getSalary());
    }
}