package bOverridingAndBuiltInMethods;
//An enum ("enumeration") in Java is a type of class that represents a group of constants (unchangeable variables, like final variables).
// The goal is that they have some sort of correlation and typically represent something from the real world, like the days of the week.
// We define them similarly to classes.


enum Day {
    //Same as enumeration
    Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday
}
public class enumClasses {
    public static void main(String[] args) {
        //Accessing an enum class

        Day today = Day.Tuesday;
        //Print enum constant

        System.out.println("Today is :"+ today);

        //Switch statements with enums

        switch(today){
            case Monday:
                System.out.println("This the begining of the work week");
                break;
            case Friday:
                System.out.println("Almost weekend");
                break;
            case Saturday:
            case Sunday:
                System.out.println("Weekend");
                break;
            default:
                System.out.println("We are in midweek");
                System.out.println();

                //ENUM PROPERTIES:
                //Fixed Set of Constants: Enums are used to define a fixed set of constants, such as days of the week, months of the year, or specific categories.
                //Type Safety: Enums provide compile-time type safety, meaning you can only use the predefined constants and no other values.
                //Built-in Methods: Enums come with built-in methods like values(), valueOf(), and name() to work with the constants.
                System.out.println("All days of the week");

                for(Day day:Day.values()){
                    System.out.println(day);
                }
                System.out.println();

                //Retrieve enum constant by its name
                //Example of valueOf(String name)

                Day day = Day.valueOf("Friday");
                System.out.println("Day obtained by Name:"+ day);
                System.out.println();

                // Example of name()
                // Gets the name of the enum constant as a String

                Day day2 = Day.Monday;
                System.out.println("Name of the day:" + day2);
                System.out.println();

                // Example of ordinal()
                // Gets the ordinal (position) of the enum constant

                Day day3 = Day.Wednesday;
                System.out.println("Oridinal of the day:"+day3.ordinal());
                System.out.println();

                // Example of toString()
                // Returns the string representation of the enum constant

                Day day4 = Day.Saturday;
                System.out.println("String representation of a day: "+day4.toString());
                System.out.println();

                // Example of compareTo(E o)
                // Compares the ordinal values of two enum constants

                Day day5 = Day.Monday;
                Day day6 = Day.Friday;

                System.out.println("Comparing between Monday and Friday: "+day5.compareTo(day6));
                System.out.println("Comparing between Monday and Friday: "+day6.compareTo(day5));


        }


    }


}
