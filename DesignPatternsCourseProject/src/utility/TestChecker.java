package utility;

public class TestChecker {

    // eager init
    private static TestChecker testChecker = new TestChecker();

    private TestChecker(){}

    public static TestChecker getTestChecker(){
        return testChecker;
    }

    public void isEqual(Object expected, Object actual){
        String areEqualEndMessage = expected.equals(actual) ? "are Equal" : "are Not Equal";
        System.out.println(expected + " and " + actual + " " + areEqualEndMessage);
    }
}
