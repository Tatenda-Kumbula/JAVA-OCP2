package Lesson_11_Exception_and_Assertions.ExceptionClassMethodsExample;

import java.io.FileInputStream;
import java.io.InputStream;

public class ExceptionClassMethodsMain {


    public static void main(String[] args) {
        
        try {
            System.out.println("About to open a file");
            InputStream in = new FileInputStream("missingfile.txt");
            System.out.println("File open");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }     
    }
}
