package ru.digitalleague.rybetsky.solutions.solid.dip;

public class UserService {
    ConsoleLogger consoleLogger = new ConsoleLogger();

    public void addUser(int id, String name) {
        consoleLogger.message(String.format("User with id=%d and name=%s successfully added", id, name));
    }

    public void deleteUser(int id) {
        consoleLogger.message(String.format("User with id=%d successfully deleted", id));
    }
}
