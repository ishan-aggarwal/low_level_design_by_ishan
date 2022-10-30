package com.ishan.lld.lru.v1;

import com.ishan.lld.lru.v1.model.DataElement;

import java.util.Optional;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to LRU Cache Version 1 using arrays");
        System.out.println("Enter size of LRU cache");
        int size = Integer.parseInt(scanner.nextLine());

        LRUCacheV1 lruCacheV1 = new LRUCacheV1(size);
        printMenu();

        while (true) {
            System.out.print("Enter user choice: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Enter the key and value to be inserted (key,value): ");
                    String pair = scanner.nextLine();
                    String[] split = pair.split(",");
                    DataElement dataElement = new DataElement(split[0], split[1], 0);
                    lruCacheV1.put(dataElement);
                    break;
                case 2:
                    System.out.println("Enter the key to be fetched");
                    String keyToBeFetched = scanner.nextLine();
                    Optional<String> returnValue = lruCacheV1.get(keyToBeFetched);

                    if (returnValue.isPresent()) {
                        System.out.println("Returned value: " + returnValue.get());
                    } else {
                        System.out.println("Key: [" + keyToBeFetched + "] is not present.");
                    }
                    break;
                case 3:
                    lruCacheV1.print();
                    break;
                default:
                    System.out.println("Bye bye");
                    return;
            }
        }
    }

    private static void printMenu() {
        System.out.println("Press 1 to Put element into cache");
        System.out.println("Press 2 to get element from cache");
        System.out.println("Press 3 to print all elements from cache");
        System.out.println("Press any other key to exit");
    }
}
