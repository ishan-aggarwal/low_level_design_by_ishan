package template.networks;

/**
 * Base class of social network.
 */
public abstract class SocialNetwork {
    String userName;
    String password;

    SocialNetwork() {
    }

    /**
     * Publish the data to whatever network.
     */
    public final boolean post(String message) {
        // Authenticate before posting. Every network uses a different
        // authentication method.
        if (logIn(this.userName, this.password)) {
            // Send the post data.
            boolean result = sendData(message.getBytes());
            logOut();
            return result;
        }
        return false;
    }

    abstract boolean logIn(String userName, String password);

    abstract boolean sendData(byte[] data);

    abstract void logOut();
}
