package Сканнер;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;


public class ScanFile {
    public static void main(String[] args) throws FileNotFoundException {
        String separator = File.separator;
        String path = "F:" + separator + "Test.txt";
        File file = new File(path);

        Scanner scanner = new Scanner(file);
        String line = scanner.nextLine();
        String[] numbers = line.split(" ");
        System.out.println(Arrays.toString(numbers));
        scanner.close();
    }
}