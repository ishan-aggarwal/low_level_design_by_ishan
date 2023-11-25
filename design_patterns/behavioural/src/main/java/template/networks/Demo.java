package template.networks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Demo class. Everything comes together here.
 */
public class Demo {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        SocialNetwork socialNetwork = null;
        System.out.print("Input user name: ");
        String userName = reader.readLine();
        System.out.print("Input password: ");
        String password = reader.readLine();

        // Enter the message.
        System.out.print("Input message: ");
        String message = reader.readLine();

        System.out.println("\nChoose social network for posting message.\n" +
                "1 - Facebook\n" +
                "2 - Twitter");
        int choice = Integer.parseInt(reader.readLine());

        // Create proper socialNetwork object and send the message.
        if (choice == 1) {
            socialNetwork = new Facebook(userName, password);
        } else if (choice == 2) {
            socialNetwork = new Twitter(userName, password);
        } else {
            System.out.println("Wrong choice!");
            return;
        }
        boolean status = socialNetwork.post(message);
    }
}
