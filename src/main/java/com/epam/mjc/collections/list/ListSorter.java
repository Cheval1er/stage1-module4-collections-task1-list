package com.epam.mjc.collections.list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import java.util.Comparator;
import java.util.List;

public class ListSorter {
    public void sort(List<String> sourceList) {
        sourceList.sort(new ListComparator());
    }

    static class ListComparator implements Comparator<String> {
        @Override
        public int compare(String a, String b) {
            int aValue = functionValue(a);
            int bValue = functionValue(b);
            if (aValue != bValue) {
                return Integer.compare(aValue, bValue);
            } else {

                return Integer.compare(Integer.parseInt(a), Integer.parseInt(b));
            }
        }

        // Function 5x^2 + 3
        private int functionValue(String x) {
            int num = Integer.parseInt(x);
            return 5 * num * num + 3;
        }
    }

    public static void main(String[] args) {
        ListSorter sorter = new ListSorter();
        List<String> sourceList = List.of("-5", "-12", "0", "20", "9", "-20", "37");
        sorter.sort(sourceList);
        System.out.println(sourceList);
    }
}
