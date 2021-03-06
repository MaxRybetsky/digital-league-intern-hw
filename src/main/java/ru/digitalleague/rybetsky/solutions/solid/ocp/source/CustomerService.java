package ru.digitalleague.rybetsky.solutions.solid.ocp.source;

public class CustomerService {
    public void addCustomerByName(String name) {
        if (name.startsWith("COMPANY")) {
            System.out.println("Adding a company");
        } else {
            System.out.println("Adding an individual person");
        }
    }
}
