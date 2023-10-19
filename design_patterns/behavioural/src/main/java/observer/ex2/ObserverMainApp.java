package observer.ex2;

public class ObserverMainApp {

    public static void main(String[] args) {

        PhoneSubject phoneSubject = new IPhoneSubject();

        Observer textObserver = new TextObserver("John", "1234567890");
        Observer emailObserver = new EmailObserver("John", "abc@gmail.com");

        phoneSubject.register(textObserver);
        phoneSubject.register(emailObserver);

        phoneSubject.addStock(10);
    }
}
