package mediator;

import java.util.HashMap;
import java.util.Map;

public class ChatMediatorImpl implements ChatMediator {

    private final Map<User, ChatClient> userChatClientMap;

    public ChatMediatorImpl() {
        this.userChatClientMap = new HashMap<>();
    }

    @Override
    public void sendMessage(User senderUser, String message) {
        for (Map.Entry<User, ChatClient> entry : userChatClientMap.entrySet()) {
            if (entry.getKey() != senderUser) {
                entry.getValue().receive(senderUser, entry.getKey(), message);
            }
        }
        System.out.println("----------------------------------------------------");
    }

    @Override
    public void register(User user, ChatClient chatClient) {
        userChatClientMap.put(user, chatClient);
    }
}
