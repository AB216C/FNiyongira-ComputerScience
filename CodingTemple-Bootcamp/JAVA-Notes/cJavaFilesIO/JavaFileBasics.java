package cJavaFilesIO;
//Always, import java.io.file to work with JAVA FILE
import java.io.File;
public class JavaFileBasics {
    public static void main(String[] args) {
        //file=An abstract representation of file and directory pathnames

        File file = new File("cJavaFilesIO/fileExample.txt");

        //File methods
        if(file.exists()){
            System.out.println("The file exists");
            System.out.println(file.getPath());
            System.out.println(file.getAbsolutePath());
            System.out.println(file.isFile());
            //file.delete();
        }else{
            System.out.println("The file does not exist");
        }
    }
}
