package mediator;

public interface ChatMediator {
    void sendMessage(ChatClient client, String message);

    void register(User user, ChatClient chatClient);
}
