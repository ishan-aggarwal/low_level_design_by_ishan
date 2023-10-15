package mediator;

public abstract class ChatClient {
    protected final ChatMediator chatMediator;

    public ChatClient(ChatMediator chatMediator) {
        this.chatMediator = chatMediator;
    }

    abstract void register(User user);

    abstract void send(User sender, String message);

    abstract void receive(User sender, User receiver, String message);
}
