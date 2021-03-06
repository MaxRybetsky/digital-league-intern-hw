package ru.digitalleague.rybetsky.solutions.solid.isp;

public interface MessageService {
    void send(String message);

    String getMessage(String src);

    void setRecipient(String recipient);

    String getSender(int messageId);

    void addMediaToMessage(String path);
}
