package utility;

import java.util.Scanner;

public class InputScanner {

    private static final Scanner scanner = new Scanner(System.in);

    private InputScanner(){
    }

    public static int read(){
        return scanner.nextInt();
    }

}
