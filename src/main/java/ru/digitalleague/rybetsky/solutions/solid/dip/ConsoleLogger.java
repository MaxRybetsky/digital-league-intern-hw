package ru.digitalleague.rybetsky.solutions.solid.dip;

public class ConsoleLogger {
    public void message(String msg) {
        print("[MESSAGE]:", msg);
    }

    public void error(String msg) {
        print("[ERROR]:", msg);
    }

    public void info(String msg) {
        print("[INFO]:", msg);
    }

    private void print(String s, String msg) {
        System.out.println(s + msg);
    }
}
