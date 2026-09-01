package aJavaBasics;
public class SplitAndJoin {
    public static void main(String[] args) {
//SPLIT():
//        originalString: The string you want to split.
//        delimiter: The pattern to determine where the string should be split.

        String sentence = "Learning Java is Fun";
        //Performing a split on whitespace

        String[] words = sentence.split(" ");

        for( String word:words) {
            System.out.println(word);
        }

        //JOIN()

//        delimiter: The separator is to be placed between each element.
//        myArray: The collection of strings to join.

        String[] splitted = {"Learning", "Java", "is", "Fun"};

        String joined = String.join(" ",splitted);
        System.out.println(joined);



    }
}
