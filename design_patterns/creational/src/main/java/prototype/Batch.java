package prototype;

public enum Batch {

    APRIL_21_BATCH("april21BatchStudent"),
    APRIL_21_INTELLIGENT_BATCH("april21BatchIntelligentStudent");

    private String value;

    Batch(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }

}
