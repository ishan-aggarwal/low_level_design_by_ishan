package mediator;

public class MediatorMainApp {

    public static void main(String[] args) {
        // ChatMediator is nothing but acting like Whatsapp server here
        ChatMediator whatsappServer = new ChatMediatorImpl();

        // normal users
        User apoorv = new User("apoorv");
        User ishan = new User("ishan");
        User kedar = new User("kedar");
        User sajal = new User("sajal");

        // On mobile devices, downloaded whatsapp app from play-store
        ChatClient client1 = new WhatsAppChatClient(whatsappServer);
        ChatClient client2 = new WhatsAppChatClient(whatsappServer);
        ChatClient client3 = new WhatsAppChatClient(whatsappServer);
        ChatClient client4 = new WhatsAppChatClient(whatsappServer);

        // on apoorv mobile device - he entered his personal details and registered
        client1.register(apoorv);
        client2.register(ishan);
        client3.register(kedar);
//        client4.register(sajal);

        client1.send("Hello All !!!");
        client2.send("Hey, everyone");
    }
}
