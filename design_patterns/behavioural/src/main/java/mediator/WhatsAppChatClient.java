package mediator;

public class WhatsAppChatClient extends ChatClient {

    public WhatsAppChatClient(ChatMediator chatMediator) {
        super(chatMediator);
    }

    @Override
    public void register(User user) {
        chatMediator.register(user, this);
    }

    @Override
    public void send(User sender, String message) {
        chatMediator.sendMessage(sender, message);
    }

    @Override
    public void receive(User sender, User receiver, String message) {
        System.out.println("[" + sender.name + "] sent message:: " + message + " to [" + receiver.name + "]");
    }
}
