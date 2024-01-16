package mediator;

public class WhatsAppChatClient extends ChatClient {

    public WhatsAppChatClient(ChatMediator chatMediator) {
        super(chatMediator);
    }

    @Override
    public void register(User user) {
        this.user = user;
        chatMediator.register(user, this);
    }

    @Override
    public void send(String message) {
        chatMediator.sendMessage(this, message);
    }

    @Override
    public void receive(User sender, User receiver, String message) {
        System.out.println("[" + sender.name + "] sent message:: " + message + " to [" + receiver.name + "]");
    }
}
