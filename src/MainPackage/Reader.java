package MainPackage;

import java.util.Scanner;

public class Reader {
    public static int readIntInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static String readStringInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }
}
