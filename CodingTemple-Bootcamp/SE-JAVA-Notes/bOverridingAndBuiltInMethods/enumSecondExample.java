package bOverridingAndBuiltInMethods;

enum Days{
    // Enum constants with associated data
    MONDAY("Monday"),
    TUESDAY("Tuesday"),
    WEDNESDAY("Wednesday"),
    THURSDAY("Thursday"),
    FRIDAY("Friday"),
    SATURDAY("Saturday"),
    SUNDAY("Sunday");

    private final String dayName;

Days(String dayName){
    this.dayName =dayName;
}

//Methods to get day name

    public String getDayName() {
        return dayName;
    }

    // Method to check if the day is a weekend
    public boolean isWeekend(){
    return this==SATURDAY||this==SUNDAY;
    }


    // Method to get a friendly message based on the day

    public String getFriendlyMessage(){
        if (isWeekend()) {
            return dayName + " is Weekend";
        } else {
            return dayName + " is Weekday";
        }
    }

}
public class enumSecondExample {
    public static void main(String[] args) {
        for(Days day:Days.values()){
            System.out.println(day.getFriendlyMessage());
            System.out.println();
            System.out.println(day.isWeekend());
        }
    }

}
