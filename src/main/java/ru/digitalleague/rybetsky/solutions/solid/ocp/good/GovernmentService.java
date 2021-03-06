package ru.digitalleague.rybetsky.solutions.solid.ocp.good;

public class GovernmentService implements CustomerService {
    @Override
    public void addCustomerByName(String name) {
        System.out.println("Adding a government department");
    }
}
