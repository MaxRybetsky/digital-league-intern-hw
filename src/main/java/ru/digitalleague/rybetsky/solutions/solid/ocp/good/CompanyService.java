package ru.digitalleague.rybetsky.solutions.solid.ocp.good;

public class CompanyService implements CustomerService {
    @Override
    public void addCustomerByName(String name) {
        System.out.println("Adding a company");
    }
}
