package abstractfactory;

public enum Platform {

    ANDROID("android"),
    IOS("ios"),
    WINDOWS("windows");

    private final String value;

    Platform(String platform) {
        this.value = platform;
    }

    public String getValue() {
        return this.value;
    }
}
