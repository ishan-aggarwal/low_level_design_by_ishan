package mediator;

public abstract class ChatClient {
    protected final ChatMediator chatMediator;

    protected User user;

    public ChatClient(ChatMediator chatMediator) {
        this.chatMediator = chatMediator;
    }

    abstract void register(User user);

    abstract void send(String message);

    abstract void receive(User sender, User receiver, String message);
    public User getUser() {
        return user;
    }
}
