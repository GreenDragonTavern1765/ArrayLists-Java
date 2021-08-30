// Programmer:          Zachary William Preston
// A test usage of the ArrayList data structure in Java programming language
// This is mean to be a refresher of my skills going in to my capstone course

import java.util.*;

public class ArrayListMain {
    public static void main(String[] args) {
        // Test code arrayLists for the static methods
        ArrayList<Integer> exampleList1 = new ArrayList<>(
                Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        ArrayList<Integer> exampleList2 = new ArrayList<>(
                Arrays.asList(1, 25, 2, 5, 30, 19, 57, 2, 25));

        ArrayList<String> exampleList3 = new ArrayList<>(
                Arrays.asList("I", "like", "to", "eat", "eat", "eat", "apples", "and", "bananas"));

        ArrayList<Integer> exampleList4 = new ArrayList<> (
                Arrays.asList(1, 2, 4));

        ArrayList<Integer> exampleList5 = new ArrayList<> (
                Arrays.asList(2, 4, 1));

        ArrayList<Integer> exampleList6 = new ArrayList<> (
                Arrays.asList(1, 4, 5, 6, 5, 5, 2));

        ArrayList<Integer> myExample1 = new ArrayList<> (
                Arrays.asList(1, 12, 43, 12, 54, 15, 21, 21));

        ArrayList<String> myExample2 = new ArrayList<> (
                Arrays.asList("Alpha", "Bravo", "Charlie", "Alpha", "Delta", "Delta", "Echo",
                        "Foxtrot", "Alpha", "Golf", "Juliet", "Hotel", "India", "Juliet",
                        "Kilo", "Foxtrot", "Bravo", "Bravo", "Alpha"));

        System.out.println(allStringsOfSize(exampleList3, 3));
        System.out.println(allStringsOfSize(exampleList3, 2));
        System.out.println(allStringsOfSize(exampleList3, 1));
        System.out.println(allStringsOfSize(myExample2, 5));
    }

    /* Unique tests each element in the ArrayList using a nested loop
       Array is compared to itself, and if any elements are found that are equal,
       but don't reside in the same index, method will return false */
    public static <E> boolean unique(ArrayList<E> testList) {
        for (int i = 0; i < testList.size(); i++) {
            for (int j = 0; j < testList.size(); j++) {
                if ((testList.get(i) == testList.get(j)) && (i != j)) {
                    return false;
                }
            }
        } return true;
    }

    /* Method takes in two arguments, arrayList from above, and integer value.
       Traverse the arraylist, if element is multiple of value, then add to multiple list
       finally return the list afterwards */
    public static ArrayList<Integer> allMultiples(ArrayList<Integer> testList, int value) {
        ArrayList<Integer> multiple = new ArrayList<>();
        for (int i = 0; i < testList.size(); i++) {
            if ((testList.get(i) % value == 0) && testList.get(i) >= value) {
                multiple.add(testList.get(i));
            }
        } return multiple;
    }

    /* Takes in two parameters, arrayList of strings from above, as well as length
       of the target strings. If the string has length given in arguments, add to list, then return list */
    public static ArrayList<String> allStringsOfSize(ArrayList<String> testList, int length) {
        ArrayList<String> stringList = new ArrayList<>();
        for (int i = 0; i < testList.size(); i++) {
            if (testList.get(i).length() == length)
                stringList.add(testList.get(i));
        } return stringList;
    }
}
