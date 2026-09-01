package cJavaFilesIO;

import java.io.File;

public class DirectoryExamples {
    public static void main(String[] args) {
        File directory = new File("cExampleDirectory");

        if(directory.mkdir()){
            System.out.println("Directory created:"+ directory.getName());
        }else{
            System.out.println("Directory already Exists");
        }

        //List contents of a directory

        String[] files = directory.list();

        if(files !=null){
            for(String fileName:files){
                System.out.println(fileName);
            }
        }

    }
}
