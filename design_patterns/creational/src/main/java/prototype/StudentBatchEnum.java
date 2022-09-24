package prototype;

public enum StudentBatchEnum {

    APRIL_21_BATCH_STUDENT("april21BatchStudent"),
    APRIL_21_BATCH_INTELLIGENT_STUDENT("april21BatchIntelligentStudent");

    private String value;

    StudentBatchEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }

}
