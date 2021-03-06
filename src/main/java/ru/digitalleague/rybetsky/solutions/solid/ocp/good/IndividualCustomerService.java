package ru.digitalleague.rybetsky.solutions.solid.ocp.good;

public class IndividualCustomerService implements CustomerService {
    @Override
    public void addCustomerByName(String name) {
        System.out.println("Adding an individual person");
    }
}
