package com.ishan.lld.lru.v1;

import com.ishan.lld.lru.v1.model.DataElement;

import java.util.Arrays;
import java.util.Optional;

public class LRUCacheV1 {

    private int capacity;
    private DataElement[] dataElements;

    private int currentPos;

    public LRUCacheV1(int capacity) {
        this.capacity = capacity;
        this.currentPos = -1;
        dataElements = new DataElement[capacity];
    }

    public void put(DataElement dataElement) {

        Optional<String> value = get(dataElement.getKey());
        if (value.isPresent()) {
            return;
        }

        if (isFull()) {
            // delete element with largest timestamp and insert
            int pos = -1;
            int largestTimeStamp = Integer.MIN_VALUE;

            for (int i = 0; i <= currentPos; i++) {
                if (dataElements[i].getTimeStamp() > largestTimeStamp) {
                    largestTimeStamp = dataElements[i].getTimeStamp();
                    pos = i;
                }
            }
            if (pos != -1) {
                for (DataElement eachDE : dataElements) {
                    eachDE.setTimeStamp(eachDE.getTimeStamp() + 1);
                }
                dataElements[pos] = dataElement;
            }
        } else {
            for (int i = 0; i <= currentPos; i++) {
                DataElement eachDE = dataElements[i];
                eachDE.setTimeStamp(eachDE.getTimeStamp() + 1);
            }
            ++currentPos;
            dataElements[currentPos] = dataElement;
        }
    }

    public boolean isFull() {
        return currentPos == capacity - 1;
    }

    public boolean isEmpty() {
        return currentPos == -1;
    }

    public Optional<String> get(String keyToBeFetched) {
        DataElement dataElement = null;
        for (int i = 0; i <= currentPos; ++i) {
            DataElement tmpDataElement = dataElements[i];
            if (keyToBeFetched.equals(tmpDataElement.getKey())) {
                dataElement = tmpDataElement;
                break;
            }
        }

        if (dataElement != null) {
            Arrays.stream(dataElements).forEach(
                    element -> element.setTimeStamp(element.getTimeStamp() + 1)
            );
            dataElement.setTimeStamp(0);
            return Optional.of(dataElement.getValue());
        }
        return Optional.empty();
    }

    public void print() {
        for (int i = 0; i <= currentPos; ++i) {
            System.out.println(dataElements[i]);
        }
    }
}
