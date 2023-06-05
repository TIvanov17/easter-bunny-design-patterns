package test;

import memory.CustomList;
import memory.EasterList;
import utility.TestChecker;

import java.util.Iterator;

public class EasterListTest {

    private static final TestChecker testChecker = TestChecker.getTestChecker();

    public static void main(String[] args) {
        getCorrectSizeTest();
        getCorrectSizeMoreElementsTest();
        getCorrectSizeAfterRemoveTest();
        getCorrectSizeAfterRemoveLastTest();
        getCorrectSizeAfterRemoveFirstTest();
        getCorrectIndexOfElementTest();
        getWrongIndexOfElementShouldReturnMinusOneTest();
        getDoesElementContainsTest();
        testIteratorForEachLoopTest();
        testIteratorWhileLoopTest();
    }

    private static void getCorrectSizeTest(){
        CustomList<String> collection = new EasterList<>();
        collection.add("first");
        testChecker.isEqual(1, collection.size());
    }

    private static void getCorrectSizeMoreElementsTest(){
        CustomList<Integer> collection = new EasterList<>();
        for(int i = 0; i < 100; i++){
            collection.add(i);
        }
        testChecker.isEqual(100, collection.size());
    }

    private static void getCorrectSizeAfterRemoveTest(){
        CustomList<Integer> collection = new EasterList<>();
        for(int i = 0; i < 100; i++){
            collection.add(i);
        }

        for(int i = 0; i < 100; i++){
            collection.remove(0);
        }
        testChecker.isEqual(0, collection.size());
    }

    private static void getCorrectSizeAfterRemoveLastTest(){
        CustomList<Integer> collection = new EasterList<>();
        for(int i = 0; i < 100; i++){
            collection.add(i);
        }

        for(int i = 0; i < 100; i++){
            collection.removeLast();
        }
        testChecker.isEqual(0, collection.size());
    }

    private static void getCorrectSizeAfterRemoveFirstTest(){
        CustomList<Integer> collection = new EasterList<>();
        for(int i = 0; i < 100; i++){
            collection.add(i);
        }

        for(int i = 0; i < 100; i++){
            collection.removeFirst();
        }
        testChecker.isEqual(0, collection.size());
    }

    private static void getCorrectIndexOfElementTest(){
        CustomList<String> collection = new EasterList<>();
        collection.add("first");
        collection.add("second");
        collection.add("third");

        testChecker.isEqual(1, collection.indexOf("second"));
    }

    private static void getWrongIndexOfElementShouldReturnMinusOneTest(){
        CustomList<String> collection = new EasterList<>();
        collection.add("first");
        collection.add("second");
        collection.add("third");

        testChecker.isEqual(-1, collection.indexOf("test"));
    }

    private static void getDoesElementContainsTest(){
        CustomList<String> collection = new EasterList<>();
        collection.add("first");
        collection.add("second");
        collection.add("third");

        testChecker.isEqual(false, collection.contains("test"));
        testChecker.isEqual(true, collection.contains("third"));
    }

    private static void testIteratorForEachLoopTest(){
        CustomList<Integer> collection = new EasterList<>();
        for(int i = 0; i < 10; i++){
            collection.add(i);
        }

        int expectedElement = 0;
        for (Integer element: collection) {
            testChecker.isEqual(expectedElement++, element);
        }

        System.out.println();
    }

    private static void testIteratorWhileLoopTest(){
        CustomList<Integer> collection = new EasterList<>();
        for(int i = 0; i < 10; i++){
            collection.add(i);
        }

        Iterator<Integer> iterator =  collection.iterator();

        int expectedElement = 0;
        while (iterator.hasNext()){
            testChecker.isEqual(expectedElement++, iterator.next());
        }

        System.out.println();
    }
}
