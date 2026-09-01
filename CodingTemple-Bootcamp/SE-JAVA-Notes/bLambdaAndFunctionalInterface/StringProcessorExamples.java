package bLambdaAndFunctionalInterface;


//Custom Functional Interface
/*
AddExclamation: Adds an exclamation point at the end of the input string.
CountVowels: Counts the number of vowels (both uppercase and lowercase) in the input string.
ToggleCase: Toggles the case of each character in the string (lowercase to uppercase and vice versa).
*/

@FunctionalInterface
interface StringProcessor {
    String process(String input);
}
public class StringProcessorExamples {
    public static void main(String[] args) {

        //1st string processor
        StringProcessor addExclamation = input-> input + "!";

        //2nd String processor
        StringProcessor countVowels = input -> {
            int count = 0;
            for (char c:input.toCharArray()){
                if("aieuoAIEUO".indexOf(c)!=-1){
                    count++;
                }
            }
            return "Number of vowels: " + count;
        };

        //3rd String processor
        StringProcessor toggledCase = input -> {
            StringBuilder toggled = new StringBuilder();

            for(char c:input.toCharArray()) {
                if(Character.isUpperCase(c)){
                    toggled.append(Character.toLowerCase(c));
                }else {
                    toggled.append(Character.toUpperCase(c));
                }
            }

            return toggled.toString();

        };

        String testString = "Hello World From Java";

        //Executing first string processor
        System.out.println("Original:"+ testString);
        System.out.println("After adding Exclamation: "+ addExclamation.process(testString));
        //Executing second string processor
        System.out.println(countVowels.process(testString));
        //Executing 3rd String processor
        System.out.println("Toggled Case: " + toggledCase.process(testString));

    }

}
