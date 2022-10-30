package com.ishan.lld.lru.v1.model;

public class DataElement {

    private String key;
    private String value;
    private int timeStamp;

    public DataElement(String key, String value, int time) {
        this.key = key;
        this.value = value;
        this.timeStamp = time;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public int getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(int timeStamp) {
        this.timeStamp = timeStamp;
    }

    @Override
    public String toString() {
        return "DataElement{" +
                "key='" + key + '\'' +
                ", value='" + value + '\'' +
                ", timeStamp=" + timeStamp +
                '}';
    }
}
