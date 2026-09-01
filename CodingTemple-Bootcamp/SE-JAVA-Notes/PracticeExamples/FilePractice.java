package PracticeExamples;

import java.io.File;
import java.io.IOException;

public class FilePractice {
    public static void main(String[] args) {

        File file = new File("PracticeExamples/filePractice.txt");

        try {
            if (file.createNewFile()) {
                System.out.println("File created:" + file.getName());
            }else {
                System.out.println("File already exists");
            }

            System.out.println(file.canExecute());
            System.out.println(file.canRead());
            System.out.println(file.canWrite());
            System.out.println(file.getName());
            System.out.println(file.getAbsolutePath());
            System.out.println(file.length());

        }catch(IOException e) {
            throw new RuntimeException();
        }
    }
}
