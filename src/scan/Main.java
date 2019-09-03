package scan;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try {
            Scanner scan = new Scanner(new File("scan/text.txt"));
            System.out.println(scan.next());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
