package mediator;

public class MediatorMainApp {

    public static void main(String[] args) {
        ChatMediator whatsappServer = new ChatMediatorImpl();

        User apoorv = new User("apoorv");
        User ishan = new User("ishan");
        User kedar = new User("kedar");
        User sajal = new User("sajal");

        ChatClient client1 = new WhatsAppChatClient(whatsappServer);
        ChatClient client2 = new WhatsAppChatClient(whatsappServer);
        ChatClient client3 = new WhatsAppChatClient(whatsappServer);
        ChatClient client4 = new WhatsAppChatClient(whatsappServer);

        client1.register(apoorv);
        client2.register(ishan);
        client3.register(kedar);
//        client4.register(sajal);

        client1.send(apoorv, "Hello All !!!");
        client2.send(ishan, "Hey, everyone");
    }
}
