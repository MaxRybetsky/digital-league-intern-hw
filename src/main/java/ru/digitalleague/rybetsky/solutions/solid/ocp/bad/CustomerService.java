package ru.digitalleague.rybetsky.solutions.solid.ocp.bad;

public class CustomerService {
    public void addCustomerByName(String name) {
        if (name.startsWith("COMPANY")) {
            System.out.println("Adding a company");
        } else if (name.startsWith("GOV")) {
            System.out.println("Adding a government department");
        } else {
            System.out.println("Adding an individual person");
        }
    }
}
