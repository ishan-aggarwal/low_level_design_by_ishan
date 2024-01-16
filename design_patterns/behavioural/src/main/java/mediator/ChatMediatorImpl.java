package mediator;

import java.util.HashMap;
import java.util.Map;

public class ChatMediatorImpl implements ChatMediator {

    private final Map<User, ChatClient> userChatClientMap;

    public ChatMediatorImpl() {
        this.userChatClientMap = new HashMap<>();
    }

    @Override
    public void sendMessage(ChatClient client, String message) {
        for (Map.Entry<User, ChatClient> entry : userChatClientMap.entrySet()) {
            if (entry.getValue() != client) {
                entry.getValue().receive(client.getUser(), entry.getKey(), message);
            }
        }
        System.out.println("----------------------------------------------------");
    }

    @Override
    public void register(User user, ChatClient chatClient) {
        userChatClientMap.put(user, chatClient);
    }
}
