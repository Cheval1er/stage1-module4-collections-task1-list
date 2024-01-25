package com.epam.mjc.collections.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListCreator {
    public LinkedList<Integer> createLinkedList(List<Integer> sourceList) {
        LinkedList<Integer> resultList = new LinkedList<>();
        for (Integer num : sourceList) {
            if (num % 2 != 0) {
                resultList.addFirst(num); // Add odd numbers at the beginning
            } else {
                resultList.addLast(num); // Add even numbers at the end
            }
        }
        return resultList;
    }
}
