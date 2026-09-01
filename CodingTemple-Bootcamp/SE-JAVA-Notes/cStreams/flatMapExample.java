package cStreams;
import java.util.*;
import java.util.stream.Collectors;

public class flatMapExample {
    public static void main(String[] args) {
        List<String> Sentences = Arrays.asList(
                "Nkunda Gusoma",
                "Bakunda kwiga",
                "j'aime le Seigneur",
                "God is everything");

        List<String> longWords = Sentences.stream().flatMap(sentence->Arrays
                                           .stream(sentence.split(" ")))  //First operation
                                           .filter(word->word.length()>5)  //Adding second operation
                                           .collect(Collectors.toList());    //Collect resul to the list

        System.out.println(longWords);
    }
}
